package com.jung.carApp.car;

public class Car {
	private String model;
	private String color;
	private int age;
	private String maker;
	
	public Car(String model, String color, int age, String maker) {
		this.model = model;
		this.color = color;
		this.age = age;
		this.maker = maker;
	}
	public void printCarInfo() {
		System.out.println("모델 : " + model);
		System.out.println("색깔 : " + color);
		System.out.println("연식 : " + age);
		System.out.println("제조사 : " + maker);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
}
