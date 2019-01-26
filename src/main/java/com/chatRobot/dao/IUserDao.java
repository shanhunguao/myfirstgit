package com.chatRobot.dao;

import com.chatRobot.model.User;

import java.util.List;

public interface IUserDao {

    User selectUser(long id);
    void update(String password);
    void insert(User user);
    void delete(long id);
    List<User> findAll();
}
