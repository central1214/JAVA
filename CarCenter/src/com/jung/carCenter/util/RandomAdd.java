package com.jung.carCenter.util;

import java.util.Random;

import com.jung.carCenter.model.Car;
import com.jung.carCenter.model.CarModify;

public class RandomAdd {
	
	private boolean[] mCard = {true, false}; //멤버쉽 카드 유무
	private String[] birth = {"1982", "434","1251","1045"};
	private String[] email = {"central1@nate.com"};
	private String[] name = {"Ezreal", "Lulu", "Jax", "Graves", "Irelia"};
	private String[] tel = {"010-6470-0033", "010-2337-3975",	"010-7281-5678",
			"010-3177-3944","010-9834-9100"};	
	private String[] model = {"SM9","소나타","싼타페","K7","그렌져"};	
	private int[] age = {2016, 2017, 2018, 2010, 2020};
	private String[] cause = {"침수","범퍼교체","에어컨 악취"};
	private String[] dateIn = {"1122.5.22","1997.8.9","2000.1.1","2020.3.17"};
	private String[] dateOut = {"1122.5.22","1997.8.9","2000.1.1","2020.3.17"};
	private int[] price = {3030,20202,1021034,19344,49451};
	private boolean[] fix = {true, false};
	
	Random r = new Random();
	
	public boolean getFix() {
		return fix[r.nextInt(fix.length)];
	}
	public int getPrice() {
		return price[r.nextInt(price.length)];
	}

	public boolean getmCard() {
		return mCard[r.nextInt(mCard.length)];
	}

	public String getBirth() {
		return birth[r.nextInt(birth.length)];
	}

	public String getEmail() {
		return email[r.nextInt(email.length)];
	}

	public String getName() {
		return name[r.nextInt(name.length)];
	}

	public String getTel() {
		return tel[r.nextInt(tel.length)];
	}

	public String getModel() {
		return model[r.nextInt(model.length)];
	}

	public int getAge() {
		return age[r.nextInt(age.length)];
	}

	public String getCause() {
		return cause[r.nextInt(cause.length)];
	}

	public String getDateIn() {
		return dateIn[r.nextInt(dateIn.length)];
	}

	public String getDateOut() {
		return dateOut[r.nextInt(dateOut.length)];
	}

	
	
}
