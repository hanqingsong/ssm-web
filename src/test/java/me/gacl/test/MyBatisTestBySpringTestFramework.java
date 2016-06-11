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
//������@ContextConfigurationע�Ⲣʹ�ø�ע���locations����ָ��spring�������ļ�֮��
@ContextConfiguration(locations = {"classpath:config/spring.xml", "classpath:config/spring-mybatis.xml" })
public class MyBatisTestBySpringTestFramework {

    //ע��userService
    @Autowired
    private UserService userService;
    
    @Test
    public void testAddUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("xdp_gacl_�׻����");
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
    	List<User> userList= userService.selectUsers();
    	System.out.println(userList);
    }
}