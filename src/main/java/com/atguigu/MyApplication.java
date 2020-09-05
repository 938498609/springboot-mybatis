package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lswstart
 * @create 2020-09-02-18:25
 */
@EnableTransactionManagement//启用声明式事务
@MapperScan("com.atguigu.dao")
@ServletComponentScan//webListener @webfilter @WebServlet
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
        System.out.println("测试master修改");
        System.out.println("测试hotfix修改");
    }
}
