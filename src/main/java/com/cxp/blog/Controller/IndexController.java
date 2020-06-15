package com.cxp.blog.Controller;

import com.cxp.blog.exception.NotFoundException;
import com.cxp.blog.pojo.CommentDo;
import com.cxp.blog.pojo.TagsDo;
import com.cxp.blog.pojo.TypeDo;
import com.cxp.blog.service.BlogDoService;
import com.cxp.blog.service.CommentDoService;
import com.cxp.blog.service.TagsDoService;
import com.cxp.blog.service.TypeDoService;
import com.cxp.blog.vo.DetailedBlog;
import com.cxp.blog.vo.FirstPageBlog;
import com.cxp.blog.vo.RecommendBlog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    BlogDoService blogDoService;
    @Autowired
    TypeDoService typeDoService;
    @Autowired
    TagsDoService tagsDoService;
    @Autowired
    CommentDoService commentDoService;
    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage ( pageNum,7 );
        List<FirstPageBlog> allFirstPageBlog=blogDoService.getAllFirstPageBlog ();
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<> ( allFirstPageBlog );
        List<TypeDo> typeDos = typeDoService.getAllTypeBlog ();
        List<TagsDo> tagsDos = tagsDoService.list ();
        List<RecommendBlog> recommendBlogs = blogDoService.getRecommendedBlog ();
        model.addAttribute ( "pageInfo",pageInfo );
        model.addAttribute ( "typeDos",typeDos );
        model.addAttribute ( "tagsDos",tagsDos );
        model.addAttribute ( "recommendBlogs",recommendBlogs );
        return "index";
    }


//    @GetMapping("/footer/recommend")
//    public String recommend(Model model){
//        List<RecommendBlog> recommendBlogs = blogDoService.getRecommendedBlog ();
//        model.addAttribute ( "recommends",recommendBlogs );
//        return "_fragments :: recommend";
//    }

    @GetMapping("/footer/blogmessage")
    public String blogMessage(Model model){
        int blogTotal = blogDoService.getBlogTotal();
        int blogViewTotal = blogDoService.getBlogViewTotal();
        int blogCommentTotal = blogDoService.getBlogCommentTotal();
        int blogMessageTotal = blogDoService.getBlogMessageTotal();

        List<RecommendBlog> recommends = blogDoService.getRecommendedBlog ();
        model.addAttribute ( "recommends",recommends );
        model.addAttribute("blogTotal",blogTotal);
        model.addAttribute("blogViewTotal",blogViewTotal);
        model.addAttribute("blogCommentTotal",blogCommentTotal);
        model.addAttribute("blogMessageTotal",blogMessageTotal);
        return "/admin/_fragments:: blogMessage";
    }

    @GetMapping("/footer/blogRecommend")
    public String blogRecommend(Model model){
        List<RecommendBlog> recommends = blogDoService.getRecommendedBlog ();
        model.addAttribute ( "recommends",recommends );
        return "/admin/_fragments :: blogRecommend";
    }

    @PostMapping("/search")
    public String search(Model model,
                         @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum,
                         @RequestParam String query){
        PageHelper.startPage ( pageNum,10 );
        List<FirstPageBlog> searchBlog = blogDoService.getSearchBlog ( query );
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<> ( searchBlog );
        model.addAttribute ( "pageInfo",pageInfo );
        model.addAttribute ( "query",query );
        return "search";

    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Long id,Model model){
        DetailedBlog detailedBlog = blogDoService.getDetailedBlog ( id );
        detailedBlog.init ();
        detailedBlog.setTags ( tagsDoService.getTagByString ( detailedBlog.getTag_ids () ) );
        List<CommentDo> commentDos =commentDoService.listCommentByBlogId ( id );
        model.addAttribute ( "comments",commentDos );
        model.addAttribute ( "blog",detailedBlog );
        return "details";
    }

}
