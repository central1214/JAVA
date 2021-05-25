package com.jung.carApp.car.util;

import java.util.Random;

public class RandPick {
	
	String[] name = {"Ezreal", "Lulu", "Jax", "Graves", "Irelia"};
	String[] phone = {"010-6470-0033", "010-2337-3975",	"010-7281-5678",
			"010-3177-3944","010-9834-9100"};
	String[] addr = {"데마시아", "녹서스", "협곡", "전장", "아이오니아"};
	String[] model = {"SM9","소나타","싼타페","K7","그렌져"};
	String[] color = {"블랙","핑크","레드","그린","블루"};
	int[] age = {2016, 2017, 2018, 2010, 2020};
	String[] maker = {"벤츠","BMW","람보르기니","아우디","현대"};
	Random r = new Random();
	
	public String pName() {		
		return name[r.nextInt(5)];
	}
	
	public String pPhone() {		
		return phone[r.nextInt(5)];
	}
	
	public String pAddr() {		
		return addr[r.nextInt(5)];
	}
	public String pModel() {		
		return model[r.nextInt(5)];
	}
	
	public String pColor() {		
		return color[r.nextInt(5)];
	}
	
	public String pMaker() {
		return maker[r.nextInt(5)];
	}
	
	public int pAge() {
		return age[r.nextInt(5)];
	}
	
	
}
