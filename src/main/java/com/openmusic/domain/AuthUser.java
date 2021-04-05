package com.openmusic.domain;

import java.io.Serializable;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthUser implements Serializable {


	private static final long serialVersionUID = 1L;
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private Calendar expiration;
	private Long exp;
	private String loginSource;
	private String tawkHash;
	private String userType;
	private String gdprEmailPolicy;
	private Boolean firstTimeSignedIn;

	public AuthUser() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getExpiration() {
		return expiration;
	}

	public void setExpiration(Calendar expiration) {
		this.expiration = expiration;
	}

	public Long getExp() {
		return exp;
	}

	public void setExp(Long exp) {
		this.exp = exp;
	}

	public String getLoginSource() {
		return loginSource;
	}

	public void setLoginSource(String loginSource) {
		this.loginSource = loginSource;
	}

	public Boolean getFirstTimeSignedIn() {
		return firstTimeSignedIn;
	}

	public void setFirstTimeSignedIn(Boolean firstTimeSignedIn) {
		this.firstTimeSignedIn = firstTimeSignedIn;
	}

	public String getTawkHash() {
		return tawkHash;
	}

	public void setTawkHash(String tawkHash) {
		this.tawkHash = tawkHash;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getGdprEmailPolicy() {
		return gdprEmailPolicy;
	}

	public void setGdprEmailPolicy(String gdprEmailPolicy) {
		this.gdprEmailPolicy = gdprEmailPolicy;
	}

	@Override
	public String toString() {
		return "AuthUser [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", expiration=" + expiration + ", exp=" + exp + ", loginSource=" + loginSource + ", tawkHash="
				+ tawkHash + ", userType=" + userType + ", gdprEmailPolicy=" + gdprEmailPolicy + ", firstTimeSignedIn="
				+ firstTimeSignedIn + "]";
	}

}
