package com.ioc.wiring;



public class Customer {

	
	private int id;
	private String name;
	private String email;
	private Address home;
	private Address work;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Address getWork() {
		return work;
	}
	public void setWork(Address work) {
		this.work = work;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", home=" + home + ", work=" + work + "]";
	}

	
	
}
