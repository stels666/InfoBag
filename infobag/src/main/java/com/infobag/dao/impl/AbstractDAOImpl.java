package com.infobag.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.infobag.dao.AbstractDAO;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public T get(Long id) {
		return (T) getSession().get(getObjectClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return createCriteria().list();
	}

	public void save(T obj) {
		getSession().save(obj);
	}

	public void delete(T obj) {
		getSession().delete(obj);
	}

	public void update(T obj) {
		getSession().update(obj);
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings({"unchecked" })
	private  Class<T> getObjectClass() {
		final Type actualArgumentType = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		if (actualArgumentType instanceof ParameterizedType) {
			return (Class<T>) ((ParameterizedType) actualArgumentType).getRawType();
		}
		return (Class<T>) actualArgumentType;
	}
	
	private Criteria createCriteria() {
		return getSession().createCriteria(getObjectClass());
	}

}
