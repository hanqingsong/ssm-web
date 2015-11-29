package com.han.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.han.model.User;
import com.han.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/userinfo",method=RequestMethod.GET,produces={"application/json"})
	@ResponseBody
	public String getUserInfo(){
		System.out.println("aaaa");
		List<User> userList= userService.selectAllUser();
		System.out.println(userList);
		//User selectByPrimaryKey = userService.selectByPrimaryKey("1");
		//System.out.println(selectByPrimaryKey);
		return "saaa";
	}
}
