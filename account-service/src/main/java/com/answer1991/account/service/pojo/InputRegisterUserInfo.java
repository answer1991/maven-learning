package com.answer1991.account.service.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.answer1991.account.utils.RegExpUtils;

public class InputRegisterUserInfo {
	@NotNull
	@Pattern(regexp = RegExpUtils.EMAIL_PATTERN)
	private String eMail;
	
	@NotNull
	@Size(min = 6, max = 20)
	private String username;

	@NotNull
	@Size(min = 8, max = 20)
	private String password;
	
	@NotNull
	@NotBlank
	private String validateKey;
	
	@NotNull
	@NotBlank
	private String validateValue;
	
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getValidateKey() {
		return validateKey;
	}
	public void setValidateKey(String validateKey) {
		this.validateKey = validateKey;
	}
	public String getValidateValue() {
		return validateValue;
	}
	public void setValidateValue(String validateValue) {
		this.validateValue = validateValue;
	}
}
