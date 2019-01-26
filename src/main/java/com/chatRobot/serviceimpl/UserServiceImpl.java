package com.chatRobot.serviceimpl;

import com.chatRobot.dao.IUserDao;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }


   public String update(String password){
        userDao.update(password);
       return "update";
   }

   public String insert(User user){
        userDao.insert(user);
        return "insert";
   }
   public String delete(long id){
        userDao.delete(id);
        return "delete";
   }
   public List<User> findAll(){
        return userDao.findAll();
   }


}