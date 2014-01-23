package com.answer1991.account.dao.service.impl;

import java.io.Serializable;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.answer1991.account.dao.ValidatorValueDao;
import com.answer1991.account.dao.service.ValidatorValueService;
import com.answer1991.account.entity.ValidatorValue;

@Component
public class ValidatorValueServiceImpl implements ValidatorValueService {
	@Autowired
	private ValidatorValueDao validatorValueDao;
	
	private static final String ALL_RANDOM_CHAR = "abcdefghijklmnopqrstuvwxyz1234567890";
	private static final int ALL_RANDOM_CHAR_COUNT = ALL_RANDOM_CHAR.length();
	
	private final Random random = new Random();
	
	private int valueMaxLength = 4;
	
	@Override
	public String generateValidator() {
		int i = 0;
		StringBuffer sb = new StringBuffer();
		for(int j = 0; j < valueMaxLength; i ++) {
			i = random.nextInt(ALL_RANDOM_CHAR_COUNT);
			sb.append(ALL_RANDOM_CHAR.charAt(i));
		}
		ValidatorValue validatorValues = new ValidatorValue();
		validatorValues.setValue(sb.toString());
		
		validatorValueDao.persist(validatorValues);
		return validatorValues.getId();
	}

	@Override
	public ValidatorValue getValidatorValue(Serializable id) {
		return validatorValueDao.find(id);
	}
}
