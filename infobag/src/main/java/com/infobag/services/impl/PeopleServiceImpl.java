package com.infobag.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infobag.dao.PeopleDAO;
import com.infobag.models.People;
import com.infobag.services.PeopleService;

@Service
@Transactional(readOnly = true)
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private PeopleDAO peopleDAO;
	
	@Transactional(readOnly = false)
	public void save(People people) {
		peopleDAO.save(people);
	}

	@Transactional(readOnly = false)
	public void delete(People people) {
		peopleDAO.delete(people);
	}

	@Transactional(readOnly = false)
	public void update(People people) {
		peopleDAO.update(people);
	}

}
