package com.crazypig.ssm.dao;

import java.util.List;

public interface BaseDao<T> {
	
	void insert(T bean) throws Exception;

	void delete(Long id) throws Exception;
	
	void delete(Long[] ids) throws Exception;
	
	void update(T bean) throws Exception;
	
	List<T> queryAll() throws Exception;
	
	List<T> query(T bean, int start, int limit) throws Exception;
	
	Long queryCount() throws Exception;

}
