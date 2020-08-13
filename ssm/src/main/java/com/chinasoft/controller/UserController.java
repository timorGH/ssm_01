package com.chinasoft.controller;


import com.chinasoft.domain.User;
import com.chinasoft.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> all = userService.findAll();
        modelAndView.addObject("users",all);
        modelAndView.setViewName("success");
        return modelAndView;
    }
	
	@RequestMapping("insertUser")
	public ModelAndView insertUser(){
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}
}
