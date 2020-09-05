package com.atguigu.service;

import com.atguigu.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lswstart
 * @create 2020-09-02-18:19
 */
public interface UserService {
    List<User> findAll();
}
