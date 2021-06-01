package com.jung.carCenter.model;

public class Customer {
	
	private String name;
	private String tel;
	private boolean mCard; //멤버쉽 카드 유무
	private String birth;
	private String email;
	private Car car;
	private CarModify carModify;
	

	
	public Customer(String name, String tel, boolean mCard, String birth, String email, Car car, CarModify carModify) {
		super();
		this.name = name;
		this.tel = tel;
		this.mCard = mCard;
		this.birth = birth;
		this.email = email;
		this.car = car;
		this.carModify = carModify;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean ismCard() {
		return mCard;
	}
	public void setmCard(boolean mCard) {
		this.mCard = mCard;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}

	@Override
	public String toString() {
		
		String str = "이름 : " + name + "\n";
		str += "번호 : " + tel + "\n";
		str += "멤버쉽 유무 : " + mCard + "\n";
		str += "생일 : " + birth + "\n";
		str += "E-mail : " + email + "\n";
		str += car.toString();
		str += carModify.toString();
		
		
		return str;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarModify getCarModify() {
		return carModify;
	}

	public void setCarModify(CarModify carModify) {
		this.carModify = carModify;
	}

}
