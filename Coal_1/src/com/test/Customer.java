package com.test;

import java.io.Serializable;

public class Customer implements Serializable{
	

	private static final long serialVersionUID = 698735768431721125L;
	private String id;
	private String name;
	private Integer orderQuanty;
	private String email;
	private String address;
	private String transport;
	private String status;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrderQuanty() {
		return orderQuanty;
	}
	public void setOrderQuanty(Integer orderQuanty) {
		this.orderQuanty = orderQuanty;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTransport() {
		return transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderQuanty=" + orderQuanty + ", email=" + email
				+ ", address=" + address + ", transport=" + transport + ", status=" + status + "]";
	}
}
