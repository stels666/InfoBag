package com.infobag.services;

import com.infobag.models.People;

public interface PeopleService {
	
	public void save(People people);
	public void delete(People people);
	public void update(People people);

}
