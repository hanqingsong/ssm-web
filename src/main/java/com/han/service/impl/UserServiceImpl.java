package com.han.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.dao.UserMapper;
import com.han.model.User;
import com.han.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}


}
