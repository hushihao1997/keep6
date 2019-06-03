package com.rj.service.Impl;

import com.rj.dao.UserDao;
import com.rj.entity.User;
import com.rj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void insertUserInfo(User user) {
        userDao.insertUserInfo(user);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
