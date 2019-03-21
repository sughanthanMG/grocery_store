package com.grocery.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.grocery.model.Signup;

public class Grocerydao {
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Transactional
	public void insertion(Signup signup) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(signup);
		
	}

}
