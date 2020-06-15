package com.cxp.blog.Controller.admin;

import com.cxp.blog.pojo.TagsDo;
import com.cxp.blog.service.TagsDoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class TagsController {
    @Autowired
    TagsDoService tagsDoService;

    @GetMapping("/tags")
    public String list(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum){
        String orderBy="id desc";
        PageHelper.startPage ( pageNum,5,orderBy );
        List<TagsDo> list = tagsDoService.list ();
        PageInfo<TagsDo> pageInfo = new PageInfo<> ( list );
        model.addAttribute ( "pageInfo",pageInfo );
        return "admin/tags";
    }
    @GetMapping("/tags/input")
    public String input(Model model){
        model.addAttribute ( "tagsDo",new TagsDo () );
        return "admin/tags-input";
    }

    @GetMapping("/tags/{id}/input")
    public String editTags(@PathVariable Long id,Model model){
        model.addAttribute ( "tagsDo",tagsDoService.getTags ( id ) );
        return "admin/tags-input";
    }

    @PostMapping("/tags")
    public String post(TagsDo tagsDo, RedirectAttributes attributes){
        if(tagsDoService.getTagsByName( tagsDo.getName () )!=null){
            attributes.addFlashAttribute ( "message" ,"不能添加重复的分类");
            return "redirect:/admin/tags/input";
        }
        int t =tagsDoService.save( tagsDo );
        if(t==0){
            attributes.addFlashAttribute ( "message","添加失败");
        }else {
            attributes.addFlashAttribute ( "message","添加成功" );
        }
        return "redirect:/admin/tags";

    }

    @PostMapping("/tags/{id}")
    public String editpost(TagsDo tagsDo,Long id,RedirectAttributes attributes){
        if(tagsDoService.getTagsByName ( tagsDo.getName ())!=null){
            attributes.addFlashAttribute ( "message" ,"不能添加重复的分类");
            return "redirect:/admin/tags/{id}/input";
        }
        int t =tagsDoService.updateTags (id, tagsDo);
        System.out.println (t);
        if(t==0){
            attributes.addFlashAttribute ( "message","更新失败");
        }else {
            attributes.addFlashAttribute ( "message","更新成功" );
        }
        return "redirect:/admin/tags";

    }
    @GetMapping("/tags/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes attributes){
        tagsDoService.deleteTags ( id );
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/tags";
    }
}
