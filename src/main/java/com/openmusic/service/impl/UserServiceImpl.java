package com.openmusic.service.impl;

import java.text.ParseException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jwt.SignedJWT;
import com.openmusic.domain.AuthUser;
import com.openmusic.service.UserService;
import com.openmusic.utils.OpenMusicConstants;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private HttpServletRequest request;

	private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	public String resolveToken(HttpServletRequest req) {
		LOGGER.info("::In resolvetoken::");
		try {
			String bearerToken = req.getHeader("Authorization");
			if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
				return bearerToken.substring(7, bearerToken.length());
			}
		} catch (Exception e) {
			LOGGER.error("Exception in resolveToken method" + e);
		}
		return null;
	}

	public String getUserExternalId(HttpServletRequest req) {

		String token = resolveToken(req);
		if (token == null) {
			return OpenMusicConstants.UNAUTHORIZED;
		}
		SignedJWT signedJWT;
		ObjectMapper mapper = new ObjectMapper();
		try {
			signedJWT = SignedJWT.parse(token);
			AuthUser user = mapper.readValue(signedJWT.getPayload().toJSONObject().toJSONString(), AuthUser.class);
			Calendar exp = user.getExpiration();
			if (System.currentTimeMillis() > exp.getTimeInMillis()) {
				return OpenMusicConstants.UNAUTHORIZED;
			} else {
				return user.getId();
			}
		} catch (ParseException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		}
		return OpenMusicConstants.UNAUTHORIZED;
	}

}
