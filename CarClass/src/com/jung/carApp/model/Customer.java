package com.jung.carApp.model;


public class Customer {
	private String name;
	private String phone;
	private String addr;
	private Car car;
	
	public Customer(String name, String phone, String addr, Car car) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public void custmInfo() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
		System.out.println("주소 : " + addr);
		car.printCarInfo();
		
	}
}
