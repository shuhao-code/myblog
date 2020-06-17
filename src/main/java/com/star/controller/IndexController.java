package com.star.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shuhao
 * @date 2020/6/17 22:40
 */
@Controller
public class IndexController {
    //通过get方式请求路径
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
