package com.cxp.blog.Controller.admin;

import com.cxp.blog.pojo.FriendDo;
import com.cxp.blog.service.FriendDoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class FriendController {
    @Autowired
    private FriendDoService friendDoService;

    @GetMapping("/friendlinks")
    public String friend(Model model, @RequestParam(defaultValue = "1",value = "pageNum")Integer pageNum){
        PageHelper.startPage (pageNum,10);
        List<FriendDo> listFriend = friendDoService.listFriendLink ();
        PageInfo<FriendDo> pageInfo = new PageInfo<> ( listFriend );
        model.addAttribute ( "pageInfo",pageInfo );
        return "admin/friendlinks";
    }

    @GetMapping("/friendlinks/input")
    public String input(Model model){
        model.addAttribute ( "friendlink",new FriendDo () ) ;
        return "admin/friendlinks-input";
    }
    @PostMapping("/friendlinks")
    public String post(FriendDo friendDo, BindingResult result, RedirectAttributes attributes){
        FriendDo friendDo1 = friendDoService.getFriendLinkByBlogaddress ( friendDo.getBlogaddress () );
        if(friendDo1 !=null){
            attributes.addFlashAttribute ( "message","不能添加相同的地址" );
            return "redirect:/admin/friendlinks/input";
        }

        if(result.hasErrors ()){
            return "admin/friendlinks-input";
        }

        friendDo.setCreate_time ( new Date (  ) );

        int f = friendDoService.saveFriendLink ( friendDo );
        if(f==0){
            attributes.addFlashAttribute ( "message","新增失败" );
        }
        else {
            attributes.addFlashAttribute ( "message","新增成功" );
        }
        return "redirect:/admin/friendlinks";
    }
    @GetMapping("/friendlinks/{id}/input")
    public String edirInput(@PathVariable long id,Model model){
        model.addAttribute ( "friendlink", friendDoService.getFriendLink ( id ));
        return "admin/friendlinks-input";
    }
    @PostMapping("/friendlinks/{id}")
    public String editPost(FriendDo friendDo,RedirectAttributes attributes){
        int t = friendDoService.updateFriendLink ( friendDo );
        if (t == 0 ) {
            attributes.addFlashAttribute("message", "编辑失败");
        } else {
            attributes.addFlashAttribute("message", "编辑成功");
        }
        return "redirect:/admin/friendlinks";
    }

    @GetMapping("/friendlinks/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes attributes){
        friendDoService.deleteFriendLink ( id );
        attributes.addFlashAttribute ( "message","删除成功" );
        return "redirect:/admin/friendlinks";
    }
}
