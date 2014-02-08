package com.infobag.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infobag.dao.PeopleDAO;
import com.infobag.models.People;

@Repository
public class PeopleDAOImpl implements PeopleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(People people) {
		sessionFactory.getCurrentSession().save(people);
	}

	public void delete(People people) {
		sessionFactory.getCurrentSession().delete(people);
	}

	public void update(People people) {
		sessionFactory.getCurrentSession().update(people);
	}

}
