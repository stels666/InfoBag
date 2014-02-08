package com.infobag.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infobag.dao.AbstractDAO;
import com.infobag.services.AbstractService;

@Service
@Transactional(readOnly=true)
public abstract class AbstractServiceImpl<T> implements AbstractService<T> {
	
	public abstract AbstractDAO<T> getDAO();

	public T get(Long id) {
		return getDAO().get(id);
	}

	public List<T> getAll() {
		return getDAO().getAll();
	}

	@Transactional(readOnly=false)
	public void save(T obj) {
		getDAO().save(obj);
	}

	@Transactional(readOnly=false)
	public void delete(T obj) {
		getDAO().delete(obj);
	}

	@Transactional(readOnly=false)
	public void update(T obj) {
		getDAO().update(obj);
	}

}
