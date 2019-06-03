package com.rj.dao;

import com.rj.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public void insertUserInfo(User user);

    public List<User> findAll();
}
