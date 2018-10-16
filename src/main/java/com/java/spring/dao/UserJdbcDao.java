package com.java.spring.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("userJdbcDao")
public class UserJdbcDao implements UserDao{

	@Override
	public int addUser(Map map) {
		
		return 0;
	}
	
}
