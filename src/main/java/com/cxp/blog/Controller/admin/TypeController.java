package com.cxp.blog.Controller.admin;

import com.cxp.blog.pojo.TypeDo;
import com.cxp.blog.service.TypeDoService;
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
public class TypeController {
    @Autowired
    TypeDoService typeDoService;

    @GetMapping("/types")
    public String list(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum){
        String orderBy="id desc";
        PageHelper.startPage ( pageNum,5,orderBy );
        List<TypeDo> list = typeDoService.list ();
        PageInfo<TypeDo> pageInfo = new PageInfo<> ( list );
        model.addAttribute ( "pageInfo",pageInfo );
        return "admin/types";
    }
    @GetMapping("/types/input")
    public String input(Model model){
        model.addAttribute ( "typeDo",new TypeDo () );
        return "admin/types-input";
    }

    @GetMapping("/types/{id}/input")
    public String editType(@PathVariable Long id,Model model){
        model.addAttribute ( "typeDo",typeDoService.getType ( id ) );
        return "admin/types-input";
    }

    @PostMapping("/types")
    public String post(TypeDo typeDo, RedirectAttributes attributes){
        if(typeDoService.getTypeByName ( typeDo.getName () )!=null){
            attributes.addFlashAttribute ( "message" ,"不能添加重复的分类");
            return "redirect:/admin/types/input";
        }
        int t =typeDoService.save( typeDo );
        System.out.println (t);
        if(t==0){
            attributes.addFlashAttribute ( "message","添加失败");
        }else {
            attributes.addFlashAttribute ( "message","添加成功" );
        }
        return "redirect:/admin/types";

    }

    @PostMapping("/types/{id}")
    public String editpost(TypeDo typeDo,Long id,RedirectAttributes attributes){
        if(typeDoService.getTypeByName ( typeDo.getName ())!=null){
            attributes.addFlashAttribute ( "message" ,"不能添加重复的分类");
            return "redirect:/admin/types/{id}/input";
        }
        int t =typeDoService.updateType (id, typeDo);
        System.out.println (t);
        if(t==0){
            attributes.addFlashAttribute ( "message","更新失败");
        }else {
            attributes.addFlashAttribute ( "message","更新成功" );
        }
        return "redirect:/admin/types";

    }
    @GetMapping("/types/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes attributes){
        typeDoService.deleteType ( id );
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/types";
    }
}
