package com.han.controller.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.han.model.User;
import com.han.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users",method=RequestMethod.GET,produces={"application/json"})
	public List<User> getUserList(@RequestParam(value="username",required=false) String userName){
		LOGGER.debug("requestParam: {}",userName);
		List<User> userList= userService.selectAllUser();
		System.out.println(userList);
		//User selectByPrimaryKey = userService.selectByPrimaryKey("1");
		//System.out.println(selectByPrimaryKey);
		return userList;
	}
}
