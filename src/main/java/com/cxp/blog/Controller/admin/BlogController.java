package com.cxp.blog.Controller.admin;

import com.cxp.blog.exception.NotFoundException;
import com.cxp.blog.pojo.BlogDo;
import com.cxp.blog.pojo.UserDo;
import com.cxp.blog.service.BlogDoService;
import com.cxp.blog.service.TagsDoService;
import com.cxp.blog.service.TypeDoService;
import com.cxp.blog.vo.BlogQuery;
import com.cxp.blog.vo.SearchBlog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class BlogController {

    private static String Input = "admin/input";
    private static String List ="admin/admin";
    private static String Redirect_List = "redirect:/admin/blogs";

    @Autowired
    BlogDoService blogDoService;
    @Autowired
    TypeDoService typeDoService;
    @Autowired
    TagsDoService tagsDoService;
    public void setTypeAndTag(Model model) {
        model.addAttribute("types", typeDoService.list ());
        model.addAttribute ( "tags",tagsDoService.list () );
    }
    @GetMapping("/blogs")
    public String list(Model model, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum){
        String orderBy="update_time desc";
        PageHelper.startPage ( pageNum,5,orderBy);
        List<BlogQuery> list = blogDoService.getAllBlog ();
        PageInfo<BlogQuery> pageInfo = new PageInfo<> ( list );
        model.addAttribute ( "pageInfo",pageInfo );
        setTypeAndTag ( model );
        return List;
    }

    @PostMapping("/blogs/search")
    public String search(Model model, SearchBlog searchBlog, @RequestParam(required = false,defaultValue = "1",value = "pageNum")Integer pageNum){
        PageHelper.startPage ( pageNum,5);
        List<BlogQuery> list = blogDoService.searchAllBlog ( searchBlog );
        PageInfo<BlogQuery> pageInfo = new PageInfo<> ( list );
        model.addAttribute ( "pageInfo",pageInfo );
        model.addAttribute("message", "查询成功");
        setTypeAndTag ( model );
        return "admin/admin :: blogList";
    }
    @GetMapping("/blogs/input")
    public String input(Model model){
        setTypeAndTag ( model );
        model.addAttribute ( "blogDo",new BlogDo () );
        return Input;
    }
    @PostMapping("/blogs")
    public String post(BlogDo blogDo, RedirectAttributes attributes,HttpSession session) {
        blogDo.setUserDo ( (UserDo)session.getAttribute ( "user" ) );
        blogDo.setUser_id ( blogDo.getUserDo ().getId () );
        blogDo.setType_id ( blogDo.getType_id ());
        blogDo.setTypeDo ( typeDoService.getType ( blogDo.getType_id () ) );
        blogDo.setTags ( tagsDoService.getTagByString ( blogDo.getTag_ids () ) );
        int b= blogDoService.saveBlog ( blogDo );

        if(b==0){
            attributes.addFlashAttribute ( "message","新增失败" );
        }else {
            attributes.addFlashAttribute ( "message","新增成功" );
        }

        return Redirect_List;
    }

    @GetMapping("/blogs/{id}/input")
    public String edit(@PathVariable Long id,Model model){
        setTypeAndTag ( model );
        BlogDo blogDo = blogDoService.getBlogById ( id );
        blogDo.init ();
        model.addAttribute ( "blogDo",blogDo );
        return Input;
    }
    @PostMapping("/blogs/{id}")
    public String editpost(BlogDo blogDo, RedirectAttributes attributes) {
        int b= blogDoService.updateBlog ( blogDo );
        if(b==0){
            attributes.addFlashAttribute ( "message","新增失败" );
        }else {
            attributes.addFlashAttribute ( "message","新增成功" );
        }
        return Redirect_List;
    }

    @GetMapping("/blogs/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes) {
        blogDoService.deleteBlog(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/blogs";
    }

}
