package com.chatRobot.service;

import com.chatRobot.model.User;

import java.util.List;

public interface IUserService {

    public User selectUser(long userId);
    public String update(String password);
    public String insert(User user);
    public String delete(long id);
    public List<User> findAll();
}
