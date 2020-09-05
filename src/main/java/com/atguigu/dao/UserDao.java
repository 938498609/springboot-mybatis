package com.atguigu.dao;

import com.atguigu.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lswstart
 * @create 2020-09-02-18:10
 */
@Repository
public interface UserDao {
    public List<User> findAll();
}
