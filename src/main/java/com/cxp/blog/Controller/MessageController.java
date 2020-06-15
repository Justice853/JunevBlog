package com.cxp.blog.Controller;

import com.cxp.blog.pojo.MessageDo;
import com.cxp.blog.pojo.UserDo;
import com.cxp.blog.service.MessageDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MessageController {
    @Autowired
    private MessageDoService messageDoService;

    @GetMapping("/message")
    public String message() {
        return "message";
    }

    @GetMapping("/messagecomment")
    public String message(Model model){
        List<MessageDo> messageDos = messageDoService.listMessage ();
        model.addAttribute ( "messages",messageDos );
        return "message :: messageList ";
    }

    @PostMapping("/message")
    public String post(MessageDo messageDo, HttpSession session,Model model){
        UserDo userDo=(UserDo) session.getAttribute ( "user" );
        if(userDo !=null){
            messageDo.setAvatar ( userDo.getAvatar () );
            messageDo.setAdmin_message ( true );
        }
        else {
            messageDo.setAvatar ( "https://static.dongtu.com/netpic/20200526114439M4M948SSIQUFXJ8Q.gif" );
        }
        if(messageDo.getParentMessage ().getId ()!=null){
            messageDo.setParent_message_id ( messageDo.getParentMessage ().getId () );
        }
        if(messageDo.getAdmin_message ()==null){
            messageDo.setAdmin_message ( false );
        }
        messageDoService.saveMessage ( messageDo );
        List<MessageDo> messageDos = messageDoService.listMessage ();
        model.addAttribute ( "messages",messageDos );
        return "message :: messageList";
    }

    @GetMapping("/messages/{id}/delete")
    public String delete(@PathVariable Long id , RedirectAttributes attributes, Model model){
        messageDoService.deleteMessage ( id );
        return "redirect:/message";
    }
}
