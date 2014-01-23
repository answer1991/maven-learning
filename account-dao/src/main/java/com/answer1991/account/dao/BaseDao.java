package com.answer1991.account.dao;

import java.io.Serializable;

public interface BaseDao<T> {
	public abstract void persist(T entity);
	public abstract T find(Serializable id);
	public abstract T merge(T entity);
}
