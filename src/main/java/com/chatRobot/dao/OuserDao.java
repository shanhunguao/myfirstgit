package com.chatRobot.dao;

import com.chatRobot.model.Ouser;

import java.util.List;

/**
 * @Classname OuserDao
 * @Description TOO
 * @Date 2019/1/18 13:32
 * @Created by HP
 */
public interface OuserDao {
    public List<Ouser> findAll();
    public void insert(Ouser ouser);
    public void delete(List list);
    public Ouser findid(int id);

}
