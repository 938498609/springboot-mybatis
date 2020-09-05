package com.atguigu.service.ipml;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    // @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public List<User> findAll() {

        String key = "allUser";
        List<User> userList = (List<User>) redisTemplate.boundValueOps(key).get();
        if (userList != null) {
            System.out.println("从redis中获取数据" + userList);
            return userList;
        }
        userList = userDao.findAll();
        if (userList != null || userList.size() > 0) {

            System.out.println("从数据库中取" + userList);
            redisTemplate.boundValueOps(key).set(userList);
        }
        return userList;
    }
}
