package com.infobag.services;

import org.springframework.beans.factory.annotation.Autowired;

public class Registry {
	
	private static final Registry singleton = new Registry();
	
	@Autowired
	private PeopleService peopleService;
	
	public static PeopleService getPeopleService(){
		return getInstance().peopleService;
	}

	public static Registry getInstance() {
		return singleton;
	}
	

}
