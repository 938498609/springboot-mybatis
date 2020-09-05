package com.atguigu.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lswstart
 * @create 2020-09-04-22:11
 */

@WebListener
public class HelloListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("HelloListener初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("HelloListener销毁");
    }
}
