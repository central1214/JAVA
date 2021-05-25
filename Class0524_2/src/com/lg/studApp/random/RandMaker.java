package com.lg.studApp.random;

import java.util.Random;

public class RandMaker {
	String[] name = {"Ezreal", "Lulu", "Jax", "Graves", "Irelia"};
	int[] age = {20, 23, 40, 55, 22};
	char[] gender = {'남','여'};
	String[] addr = {"데마시아", "녹서스", "협곡", "전장", "아이오니아"};
	
	Random ran = new Random();
	
	public String randName() {

		return name[ran.nextInt(name.length)];
	}

	public int randAge() {

		return age[ran.nextInt(age.length)];
	}

	public char randGender() {

		return gender[ran.nextInt(gender.length)];
	}
	public String randAddr() {

		return addr[ran.nextInt(addr.length)];
	}

}
