package com.answer1991.account.dao.service;

import java.io.Serializable;

import com.answer1991.account.entity.ValidatorValue;

public interface ValidatorValueService {
	public abstract String generateValidator();
	public abstract ValidatorValue getValidatorValue(Serializable id);
}
