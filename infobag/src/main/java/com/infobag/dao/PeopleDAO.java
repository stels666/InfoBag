package com.infobag.dao;

import com.infobag.models.People;

public interface PeopleDAO {
	
	public void save(People people);
	public void delete(People people);
	public void update(People people);

}
