package com.han.service;

import java.util.List;

import com.han.model.User;

public interface UserService {
	int deleteByPrimaryKey(String id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<User> selectAllUser();
}
