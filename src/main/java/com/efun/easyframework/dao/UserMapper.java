package com.efun.easyframework.dao;

import org.apache.ibatis.annotations.Param;

import com.efun.easyframework.pojo.User;

public interface UserMapper {

	    int deleteByPrimaryKey(@Param(value="id")String id);

	    int insert(User user);

	    User selectByPrimaryKey(@Param(value="id")String id);
}
