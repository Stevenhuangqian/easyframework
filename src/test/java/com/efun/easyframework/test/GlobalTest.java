package com.efun.easyframework.test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;
import com.efun.easyframework.dao.UserMapper;
import com.efun.easyframework.pojo.User;
import com.efun.easyframework.service.UserService;

/**
 * 单元测试
 * @author developer
 */
// 告诉spring怎样执行
@RunWith(SpringJUnit4ClassRunner.class)
//  标明是web应用测试
@WebAppConfiguration(value = "src/main/webapp") //可以不填，默认此目录
// 配置文件地址
@ContextConfiguration(locations = { "file:src/main/resources/application-context.xml",  "file:src/main/resources/application-mybatis.xml", "file:src/main/resources/application-mvc.xml" })

public class GlobalTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Before
    public  void before(){
        System.out.println("准备测试！！！");
    }

    @AfterClass
    public static void After(){
        System.out.println("测试结束！！！");
    }

    @Test
    public void get() {
        User user = userMapper.selectByPrimaryKey("1");
        System.out.println(JSON.toJSONString(user));
    }

    @Test
    public void add(){
        User user = new User();
        user.setId("7");
        user.setName("wodemingzi");
        user.setPwd("!@#$%^&");
        userService.insert(user);
    }

}
