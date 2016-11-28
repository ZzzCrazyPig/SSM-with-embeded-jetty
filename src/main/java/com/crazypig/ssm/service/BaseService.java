package com.crazypig.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crazypig.ssm.dao.BaseDao;

public abstract class BaseService<T> {

	@Autowired
	private BaseDao<T> dao;
	
	public void insert(T bean) throws Exception {
		dao.insert(bean);
	}

	public void delete(Long id) throws Exception {
		dao.delete(id);
	}
	
	public void delete(Long[] ids) throws Exception {
		dao.delete(ids);
	}
	
	public void update(T bean) throws Exception {
		dao.update(bean);
	}
	
	public List<T> queryAll() throws Exception {
		return dao.queryAll();
	}
	
	public List<T> query(T bean, int start, int limit) throws Exception {
		return dao.query(bean, start, limit);
	}
	
	public Long queryCount() throws Exception {
		return dao.queryCount();
	}

	public BaseDao<T> getDao() {
		return dao;
	}

	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}
	
	
}
