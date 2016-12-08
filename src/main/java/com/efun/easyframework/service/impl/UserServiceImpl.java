package com.efun.easyframework.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.efun.easyframework.dao.UserMapper;
import com.efun.easyframework.pojo.User;
import com.efun.easyframework.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	  @Resource
	    private UserMapper userMapper;

	    public User searchById(String id){
	        return userMapper.selectByPrimaryKey(id);
	    }

	    @Transactional
	    public int insert(User user) {
	        return userMapper.insert(user);
	    }

	    @Transactional
	    public int delete(String id){
	        return userMapper.deleteByPrimaryKey(id);
	    }
}
