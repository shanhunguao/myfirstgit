package com.chatRobot.serviceimpl;


import com.chatRobot.dao.OuserDao;
import com.chatRobot.model.Ouser;

import com.chatRobot.service.OuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OuserServiceimpl
 * @Description TOO
 * @Date 2019/1/18 13:29
 * @Created by HP
 */
@Service
public class OuserServiceimpl implements OuserService {
    @Autowired
    private OuserDao ouserDao;


    @Override
    public List<Ouser> findAll() {
        return ouserDao.findAll();
    }

    @Override
    public String insert(Ouser ouser) {
        ouserDao.insert(ouser);
        return "insert";
    }

    @Override
    public void delete(List list) {
        ouserDao.delete(list);
    }

    @Override
    public Ouser findid(int id) {
        return ouserDao.findid(id);
    }
}
