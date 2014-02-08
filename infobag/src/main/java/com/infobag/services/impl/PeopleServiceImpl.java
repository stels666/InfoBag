package com.infobag.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infobag.dao.AbstractDAO;
import com.infobag.dao.PeopleDAO;
import com.infobag.models.People;
import com.infobag.services.PeopleService;

@Service
@Transactional(readOnly = true)
public class PeopleServiceImpl extends AbstractServiceImpl<People> implements PeopleService {

	@Autowired
	private PeopleDAO peopleDAO;

	@Override
	public AbstractDAO<People> getDAO() {
		return peopleDAO;
	}

}
