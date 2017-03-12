package com.test;

import java.io.Serializable;
import java.util.List;

public class CustomerResponse implements Serializable {
	private static final long serialVersionUID = -826346448837088039L;
	String status;
	List<Customer> list;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Customer> getList() {
		return list;
	}

	public void setList(List<Customer> list) {
		this.list = list;
	}

}
