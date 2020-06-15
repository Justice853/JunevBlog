package com.cxp.blog.Controller;

import com.cxp.blog.pojo.BlogDo;
import com.cxp.blog.pojo.TypeDo;
import com.cxp.blog.service.BlogDoService;
import com.cxp.blog.service.TypeDoService;
import com.cxp.blog.vo.FirstPageBlog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TypeShowController {
    @Autowired
    private TypeDoService typeDoService;

    @Autowired
    private BlogDoService blogDoService;

    @GetMapping("/types/{id}")
    public String types(@PathVariable Long id, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum, Model model){
        PageHelper.startPage ( pageNum,100 );
        List<TypeDo> typeDos = typeDoService.getAllTypeBlog ();
        System.out.println ("types"+typeDos);
        if(id == -1){
            id=typeDos.get ( 0 ).getId ();
        }
        model.addAttribute ( "types",typeDos );
        List<FirstPageBlog> blogDos =blogDoService.getByTypeId ( id );
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<> ( blogDos );
        model.addAttribute ( "pageInfo",pageInfo );
        model.addAttribute ( "activeTypeId",id );
        return "types";

    }
}
