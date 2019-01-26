package com.chatRobot.service;

import com.chatRobot.model.Ouser;

import java.util.List;

/**
 * @Classname UserService
 * @Description TOO
 * @Date 2019/1/18 13:29
 * @Created by HP
 */
public interface OuserService {
    public List<Ouser> findAll();
    public String insert(Ouser ouser);
    public void delete(List list);
    public Ouser findid(int id);
}
