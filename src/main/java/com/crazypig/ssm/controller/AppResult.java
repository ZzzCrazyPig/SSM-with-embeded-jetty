package com.crazypig.ssm.controller;

import java.io.Serializable;
import java.util.List;

public class AppResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean success;
	private int errCode;
	private String errMsg;
	
	private T row;
	private List<T> rows;
	
	private int start;
	private int limit;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getErrCode() {
		return errCode;
	}
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public Object getRow() {
		return row;
	}
	public void setRow(T row) {
		this.row = row;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> list) {
		this.rows = list;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
}
