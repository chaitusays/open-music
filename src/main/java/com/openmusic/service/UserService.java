package com.openmusic.service;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

	public String resolveToken(HttpServletRequest req);

	public String getUserExternalId(HttpServletRequest req);

}
