package com.efun.easyframework.service;

import com.efun.easyframework.pojo.User;

public interface UserService {
	 User searchById(String id);

	    int insert(User user);

	    int delete(String id);
}
