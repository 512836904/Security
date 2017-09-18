package com.spring.service;

import java.util.List;

import com.spring.model.Authority;


public interface AuthorityService {
	void save(Authority authority);
	void saveResource(Authority authority);
	boolean update(Authority authority);
	boolean delete(int id);
	String findByResourceId(Integer id);
	Authority findById(Integer id);
	List<Authority> findAll();
	List<Authority> findAllResource();
	List<Authority> findResource(Integer id);
}
