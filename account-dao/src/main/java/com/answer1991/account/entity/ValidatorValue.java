package com.answer1991.account.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "validator_value")
public class ValidatorValue {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String id;
	
	@NotNull
	@Size(min = 4, max = 15)
	private String value;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "generator_date")
	private Date generatorDate = new Date();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getGeneratorDate() {
		return generatorDate;
	}

	public void setGeneratorDate(Date generatorDate) {
		this.generatorDate = generatorDate;
	}
	
}
