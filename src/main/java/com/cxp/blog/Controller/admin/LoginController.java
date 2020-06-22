package com.cxp.blog.Controller.admin;

import com.cxp.blog.pojo.UserDo;
import com.cxp.blog.service.UserDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    UserDoService userDoServiceImpl;
    @GetMapping
    public String loginPage(HttpSession session){
        if(session.getAttribute ( "user" )!=null){
            return "admin/index";
        }
        return "admin/login";
    }
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpSession httpSession, RedirectAttributes attributes){
        UserDo userDo=userDoServiceImpl.checkUser(username,password);
        if(userDo!=null){
            userDo.setPassword (null);
            httpSession.setAttribute ( "user",userDo );
            return "admin/index";
        }
        else {
            attributes.addFlashAttribute ( "message","用户名和密码错误" );
            return "redirect:/admin";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.removeAttribute ( "user" );
        return "redirect:/admin";
    }
}
