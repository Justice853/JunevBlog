package com.cxp.blog.Controller;

import com.cxp.blog.service.FriendDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FriendShowController {

    @Autowired
    private FriendDoService friendDoService;

    @GetMapping("/friends")
    public String friends(Model model){
        model.addAttribute ( "friendlinks",friendDoService.listFriendLink () );
        return "friends";
    }
}
