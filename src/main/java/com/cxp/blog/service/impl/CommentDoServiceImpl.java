package com.cxp.blog.service.impl;

import com.cxp.blog.dao.BlogDoMapper;
import com.cxp.blog.dao.CommentDoMapper;
import com.cxp.blog.pojo.CommentDo;
import com.cxp.blog.service.CommentDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommentDoServiceImpl implements CommentDoService {
    @Autowired
    private CommentDoMapper commentDoMapper;
    @Autowired
    private BlogDoMapper blogDoMapper;

    private List<CommentDo> tempReplys = new ArrayList<> ();
    @Override
    public List<CommentDo> listCommentByBlogId (Long blogId) {
        List<CommentDo> commentDos = commentDoMapper.findByBlogIdParentIdNotNull ( blogId,Long.parseLong ( "-1" ) );
        for(CommentDo comment : commentDos){
            Long id = comment.getId();
            String parentNickname1 = comment.getNickname();
            List<CommentDo> childComments = commentDoMapper.findByBlogIdParentIdNotNull(blogId,id);
//            查询出子评论
            combineChildren(blogId, childComments, parentNickname1);
            comment.setReplyComments (tempReplys);
            tempReplys = new ArrayList<>();
        }
        return commentDos;

    }

    private void combineChildren (Long blogId, List<CommentDo> childComments, String parentNickname1) {
        if(childComments.size ()>0){
            for(CommentDo childComment : childComments){
                String parentNickname = childComment.getNickname ();
                childComment.setParentNickname ( parentNickname1 );
                tempReplys.add ( childComment );
                Long childId = childComment.getId ();
                recursively(blogId, childId, parentNickname);
            }
        }
    }

    private void recursively (Long blogId, Long childId, String parentNickname1) {
        List<CommentDo> replayComments = commentDoMapper.findByBlogIdAndReplayId(blogId,childId);

        if(replayComments.size() > 0){
            for(CommentDo replayComment : replayComments){
                String parentNickname = replayComment.getNickname();
                replayComment.setParentNickname(parentNickname1);
                Long replayId = replayComment.getId();
                tempReplys.add(replayComment);
                recursively(blogId,replayId,parentNickname);
            }
        }
    }


    @Override
    public int saveComment (CommentDo comment) {
        comment.setCreate_time ( new Date (  ) );
        int comments=commentDoMapper.saveComment ( comment );
        blogDoMapper.getCommentCountById ( comment.getBlog_id () );
        return comments;
    }

    @Override
    public void deleteComment (CommentDo comment, Long id) {
        commentDoMapper.deleteByPrimaryKey ( id );
        blogDoMapper.getCommentCountById ( comment.getBlog_id () );
    }
}
