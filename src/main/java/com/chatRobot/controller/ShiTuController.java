package com.chatRobot.controller;


import com.chatRobot.service.OuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//返回页面的controller
@Controller
@RequestMapping("/page")
public class ShiTuController {
    @Autowired
    private OuserService ouserService;


    @RequestMapping("/{admin}")
    public String find(@PathVariable String admin){
        return admin;
    }






}
