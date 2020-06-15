package com.cxp.blog.service.impl;

import com.cxp.blog.dao.MessageDoMapper;
import com.cxp.blog.pojo.MessageDo;
import com.cxp.blog.service.MessageDoService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageDoServiceImpl implements MessageDoService {
    @Autowired
    private MessageDoMapper messageDoMapper;

    private List<MessageDo> tempReplys = new ArrayList<> ();
    @Override
    public List<MessageDo> listMessage ( ) {
        List<MessageDo> messageDos = messageDoMapper.findByParentIdNull ( Long.parseLong ( "-1" ) );
        for(MessageDo messageDo : messageDos){
            Long id = messageDo.getId ();
            String parentNickname1 = messageDo.getNickname ();
            List<MessageDo> childMessages = messageDoMapper.findByParentIdNotNull ( id );
            combineChildren(childMessages,parentNickname1);
            messageDo.setReplyMessages ( tempReplys );
            tempReplys = new ArrayList<> (  );
        }
        return messageDos;
    }

    private void combineChildren (List<MessageDo> childMessages, String parentNickname1) {
        if(childMessages.size ()>0){
            for(MessageDo messageDo : childMessages){
                String parentNickName =messageDo.getNickname ();
                messageDo.setParentNickname ( parentNickname1 );
                tempReplys.add ( messageDo );
                Long childId = messageDo.getId ();
                recursively(childId, parentNickName);
            }
        }
    }

    private void recursively (Long childId, String parentNickName1) {
        List<MessageDo> replayMessages = messageDoMapper.findByReplayId ( childId );
        if(replayMessages.size ()>0){
            for(MessageDo replayMessage : replayMessages){
                String parentNickName = replayMessage.getNickname ();
                replayMessage.setParentNickname ( parentNickName1 );
                Long replayId=replayMessage.getId ();
                tempReplys.add ( replayMessage );
                recursively ( replayId,parentNickName );
            }
        }
    }


    @Override
    public int saveMessage (MessageDo message) {
        message.setCreate_time ( new Date (  ) );
        return messageDoMapper.insert ( message );
    }

    @Override
    public void deleteMessage (Long id) {
        messageDoMapper.deleteByPrimaryKey ( id );
    }
}
