package com.openmusic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openmusic.service.CommonService;

@RestController
@RequestMapping("/api/v1/user-login")
public class LoginOrSignupController {

	private final static Logger LOGGER = LoggerFactory.getLogger(LoginOrSignupController.class);

	@Autowired
	CommonService commonService;

}
