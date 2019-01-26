package com.chatRobot.controller;

import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }
    @RequestMapping("/hello")
    public String find(){
        return "hello";
    }

    @RequestMapping("/{password}")
    @ResponseBody
    public String update(@PathVariable String password){
        String a=userService.update(password);
        return a;
    }

    @RequestMapping("/{id}/{email}/{password}/{username}/{role}/{status}/{regTime}/{regIp}")
    @ResponseBody
    public String insert(User user){
        String b=userService.insert(user);
        return b;
    }

    @RequestMapping("delete/{id}")
    @ResponseBody
    public String delete(@PathVariable long id){
        String c=userService.delete(id);
        return c;
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
       return userService.findAll();
    }




}
