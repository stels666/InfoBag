package com.infobag.services;

import java.util.List;

public interface AbstractService<T> {
	
	public T get(Long id);
	
	public List<T> getAll();
	
	public void save(T obj);
	
	public void delete(T obj);
	
	public void update(T obj);

}
