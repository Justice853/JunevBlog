package com.cxp.blog.Controller;

import com.cxp.blog.service.PictureDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PicturesShowController {
    @Autowired
    private PictureDoService pictureDoService;

    @GetMapping("/pictures")
    public String friends(Model model) {
        model.addAttribute("pictures",pictureDoService.listPicture ());
        return "pictures";
    }
}
