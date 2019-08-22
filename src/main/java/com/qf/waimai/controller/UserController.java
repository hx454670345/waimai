package com.qf.waimai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping("/main")
    public String showGoods(){
        return "main";
    }
    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }
}
