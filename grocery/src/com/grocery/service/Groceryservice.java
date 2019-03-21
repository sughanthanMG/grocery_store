package com.grocery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.dao.Grocerydao;
import com.grocery.model.Signup;

@Service
public class Groceryservice {
	@Autowired
	static
	Grocerydao dao;
	
	public static void addData(Signup signup)
	{
		dao.insertion(signup);
	}
	public static void login(Signup signup)
	{
		dao.insertion(signup);
	}

}
