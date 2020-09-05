package com.atguigu;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import javax.swing.*;
import java.util.List;

/**
 * @author lswstart
 * @create 2020-09-02-21:15
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void testFindAll() {
        List<User> list = userService.findAll();
        System.out.println(list);
    }

    @Autowired
    DataSource dataSource;

    @Test
    public void testDataSource() {
        System.out.println(dataSource.getClass());
    }

}

