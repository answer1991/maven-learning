package com.answer1991.account.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.answer1991.account.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {
	@SuppressWarnings("unchecked")
	private final Class<T> entityClazz = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	
	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public void persist(T entity) {
		em.persist(entity);
	}
	
	@Override
	public T find(Serializable id) {
		return em.find(entityClazz, id);
	}
	
	@Override
	public T merge(T entity) {
		return em.merge(entity);
	}
}
