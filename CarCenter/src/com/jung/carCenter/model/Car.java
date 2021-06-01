package com.jung.carCenter.model;

public class Car {

	private String model; // 변수는 가독성을 해치치 않는 선에서 주석으로 설명을 해주자
	private int age;
	
	
	
	public Car(String model, int age) {
		super();
		this.model = model;
		this.age = age;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String str = "수리차량 : " + model + "\n";
		str += "연식 : " + age + "\n";
		return str;
	}
	
}
