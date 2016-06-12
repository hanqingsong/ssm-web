package me.gacl.test;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.han.model.User;
import com.han.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:config/spring.xml", "classpath:config/spring-mybatis.xml" })
public class MyBatisTestBySpringTestFramework {

    //注入userService
    @Autowired
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("xdp_gacl_白虎神皇");
        userService.insert(user);
    }
    
    @Test
    public void testGetUserById(){
        String userId = "fb1c5941094e400b975f10d9a9d602a3";
        User user = userService.selectByPrimaryKey(userId);
        System.out.println(user);
    }
    
    @Test
    public void testGetAllUser(){
        List<User> userList = userService.selectAllUser();
        System.out.println(userList);
    }
}