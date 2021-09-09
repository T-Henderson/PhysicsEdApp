package com.me.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.me.dao.FactsDAO;

public class FactsManagerImpl {
	@Autowired
	private FactsDAO dao;
}
