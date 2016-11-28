package com.crazypig.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crazypig.ssm.service.BaseService;

public class BaseController<T, S extends BaseService<T>> {
	
	@Autowired
	private S service;
	
	@RequestMapping("/insert")
	@ResponseBody
	public AppResult<T> insert(T bean) {
		AppResult<T> result = new AppResult<T>();
		try {
			this.service.insert(bean);
			result.setSuccess(true);
		} catch(Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setErrMsg(e.getMessage());
			return result;
		}
		return result;
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public AppResult<T> delete(Long id) {
		AppResult<T> result = new AppResult<T>();
		try {
			this.service.delete(id);
			result.setSuccess(true);
		} catch(Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setErrMsg(e.getMessage());
			return result;
		}
		return result;
	}
	
	@RequestMapping("/multiDelete")
	@ResponseBody
	public AppResult<T> delete(Long[] ids) {
		AppResult<T> result = new AppResult<T>();
		try {
			this.service.delete(ids);
			result.setSuccess(true);
		} catch(Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setErrMsg(e.getMessage());
			return result;
		}
		return result;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public AppResult<T> update(T bean) {
		AppResult<T> result = new AppResult<T>();
		try {
			this.service.update(bean);
			result.setRow(bean);
			result.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setErrMsg(e.getMessage());
			return result;
		}
		return result;
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public AppResult<T> queryAll() {
		AppResult<T> result = new AppResult<T>();
		try {
			List<T> beanList = this.service.queryAll();
			result.setRows(beanList);
			result.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setErrMsg(e.getMessage());
			return result;
		}
		return result;
	}
	
	@RequestMapping("/query")
	@ResponseBody
	public AppResult<T> query(T bean, int start, int limit) {
		AppResult<T> result = new AppResult<T>();
		try {
			List<T> beanList = this.service.query(bean, start, limit);
			result.setRows(beanList);
			result.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setErrMsg(e.getMessage());
			return result;
		}
		return result;
	}
	
	@RequestMapping("/queryCount")
	@ResponseBody
	public AppResult<Long> queryCount() {
		AppResult<Long> result = new AppResult<Long>();
		try {
			Long count = this.service.queryCount();
			result.setRow(count);
			result.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setErrMsg(e.getMessage());
			return result;
		}
		return result;
	}

	public S getService() {
		return service;
	}

	public void setService(S service) {
		this.service = service;
	}
	

}
