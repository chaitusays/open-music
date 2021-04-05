package com.openmusic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openmusic.service.CommonService;
import com.openmusic.service.UserService;

@Service("commonService")
public class CommonServiceImpl implements CommonService {
	
	@Autowired
	UserService userService;

	@Override
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
