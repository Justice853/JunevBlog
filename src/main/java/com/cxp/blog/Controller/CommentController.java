package com.cxp.blog.Controller;

import com.cxp.blog.pojo.CommentDo;
import com.cxp.blog.pojo.UserDo;
import com.cxp.blog.service.BlogDoService;
import com.cxp.blog.service.CommentDoService;
import com.cxp.blog.vo.DetailedBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentDoService commentService;

    @Autowired
    private BlogDoService blogService;

    @GetMapping("/comments/{blogId}")
    public String comments(@PathVariable Long blogId, Model model) {
        List<CommentDo> comments = commentService.listCommentByBlogId(blogId);
        model.addAttribute("comments", comments);
        return "details :: commentList";
    }

    //    新增评论
    @PostMapping("/comments")
    public String post(CommentDo comment, HttpSession session, Model model) {
        Long blogId = comment.getBlog_id ();
        UserDo user = (UserDo) session.getAttribute("user");
        if (user != null) {
            comment.setAvatar(user.getAvatar());
            comment.setAdmin_comment (true);
        } else {
            //设置头像
            comment.setAvatar("https://static.dongtu.com/netpic/20200526114439M4M948SSIQUFXJ8Q.gif");
        }

        if (comment.getParentComment().getId() != null) {
            comment.setParent_comment_id (comment.getParentComment().getId());
        }
        commentService.saveComment(comment);
        List<CommentDo> comments = commentService.listCommentByBlogId(blogId);
        model.addAttribute("comments", comments);
        return "details :: commentList";
    }

    //    删除评论
    @GetMapping("/comment/{blogId}/{id}/delete")
    public String delete(@PathVariable Long blogId, @PathVariable Long id, CommentDo comment, RedirectAttributes attributes, Model model){
        commentService.deleteComment(comment,id);
        DetailedBlog detailedBlog = blogService.getDetailedBlog(blogId);
        List<CommentDo> comments = commentService.listCommentByBlogId(blogId);
        model.addAttribute("blog", detailedBlog);
        model.addAttribute("comments", comments);
        return "details";
    }
}
