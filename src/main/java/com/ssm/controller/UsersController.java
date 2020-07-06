package com.ssm.controller;

import com.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * ClassName：UserController
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/7/4 19:09
 * @version 1.0.0
 */

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/userDetail")
    public String userDetail(Model model){
//        ModelAndView mv = new ModelAndView();
//
//        User user = userService.getUser();
//        mv.addObject("user", user);
//        mv.setViewName("user");
        model.addAttribute("user",usersService.getUser());
        model.addAttribute("time",new Date());
        return "user";
    }

}
