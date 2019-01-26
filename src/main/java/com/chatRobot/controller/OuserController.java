package com.chatRobot.controller;

import com.chatRobot.model.Ouser;
import com.chatRobot.service.OuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname OuserController
 * @Description TOO
 * @Date 2019/1/18 13:36
 * @Created by HP
 */
@Controller
@RequestMapping("/ouser")
public class OuserController {
    @Autowired
    private OuserService ouserService;

    //加载页面后，查询数据
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Ouser> findAll(){
        return ouserService.findAll();
    }

    //接受表单请求，添加数据
    @RequestMapping("/id/name/password/count")
    public String findAll(Ouser ouser){
        String a=ouserService.insert(ouser);
        System.out.println(a);
        return "hello";
    }

    //删除数据
    @RequestMapping(value="/delete",method=RequestMethod.POST)
    @ResponseBody
    public  String delete(String[] id) {     //接受checkbox存放value值的数组
       ArrayList<Integer> list = new ArrayList<>();
        for (String s: id) {
            Integer a=Integer.parseInt(s);
            list.add(a);
        }
        if(list.get(0)==0){
            list.remove(0);
        }
        ouserService.delete(list);
        return "delete";
    }

    //修改操作,获取被选中id一行值
    @RequestMapping("/id")
    @ResponseBody
    public Ouser findid(int id){
        return ouserService.findid(id);
    }




}
