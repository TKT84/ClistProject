package com.app.clist.project.dao;

import java.util.List;


public interface Dao<T, S> {

	T create(T t);
	
	T update(T t);
	
	T find(S s);
	
	List <T> findAll();
	
	boolean delete(T t);
	
}
