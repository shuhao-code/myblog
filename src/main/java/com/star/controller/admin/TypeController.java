package com.star.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.star.entity.Type;
import com.star.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

/**
 * 分类管理controller
 * @author shuhao
 * @date 2020/6/18 14:46
 */
@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    //分页查询分类列表
    @GetMapping("/types")
    public String list(Model model, @RequestParam(defaultValue = "1", value = "pageNum")Integer pageNum){
        //按照排序字段 倒序 排序
        String orderBy = "id desc";
        PageHelper.startPage(pageNum, 10, orderBy);
        List<Type> allType = typeService.getAllType();
        PageInfo<Type> pageInfo = new PageInfo<>(allType);
        model.addAttribute("pageInfo", pageInfo);
        return "admin/types";
    }

    //返回新增分类页面
    @GetMapping("/types/input")
    public String input(Model model){
        model.addAttribute("type", new Type());
        return "admin/types-input";
    }

    //新增分类
    @PostMapping("/types")
    public String addType(@Valid Type type, RedirectAttributes attributes){
        Type type1 = typeService.getTypeByName(type.getName());
        if(type1 != null){
            attributes.addFlashAttribute("message", "不能添加重复类");
            return "redirect:admin/types/input";
        }
        int i = typeService.saveType(type);
        if(i == 0){
            attributes.addFlashAttribute("message", "添加失败");
        }else {
            attributes.addFlashAttribute("message", "添加成功");
        }
        return "redirect:/admin/types";

    }

    //跳转修改分类页面
    @GetMapping("/types/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("type", typeService.getType(id));
        return "/admin/types-input";
    }

    //编辑修改类
    @PostMapping("/types/{id}")
    public String editPost(@Valid Type type, RedirectAttributes attributes){
        Type type1 = typeService.getTypeByName(type.getName());
        if (type1 == null) {
            attributes.addFlashAttribute("message", "该分类不存在");
            return "redirect:/admin/types/input";
        }
        int t = typeService.updateType(type);
        if (t == 0 ) {
            attributes.addFlashAttribute("message", "编辑失败");
        } else {
            attributes.addFlashAttribute("message", "编辑成功");
        }
        return "redirect:/admin/types";
    }

    //删除分类
    @GetMapping("types/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes){
        typeService.deleteType(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "/redirect:/admin/types";
    }


}
