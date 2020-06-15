package com.cxp.blog.Controller;

import com.cxp.blog.pojo.BlogDo;
import com.cxp.blog.service.BlogDoService;
import com.cxp.blog.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ArchiveShowController {
    @Autowired
    BlogDoService blogDoService;

    @GetMapping("/archives")
    public String archive(Model model){
        List<BlogQuery> blogs = blogDoService.getAllBlog ();
        model.addAttribute ( "blogs",blogs );
        return "archives";
    }
}
