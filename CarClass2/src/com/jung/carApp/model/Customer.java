package com.jung.carApp.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String phone;
	private String addr;
	private Date time;
	private Car car;

	public Customer(String name, String phone, String addr, Car car) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.car = car;
		this.time = setTime();
	}

	public Customer() {

	}

	public Date setTime() {
		Date date = new Date();
		return date;
	}
	public void setTime(Date time) {
		this.time = time;		
	}
	public Date getTime() {
		return time;
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
		System.out.println("계약 시간 : " + time);
		car.printCarInfo();

	}
}
