package com.infobag.dao;

import java.util.List;

import org.hibernate.Session;

public interface AbstractDAO<T> {
	
	public T get(Long id);
	
	public List<T> getAll();
	
	public void save(T obj);
	
	public void delete(T obj);
	
	public void update(T obj);
	
	public Session getSession();

}
