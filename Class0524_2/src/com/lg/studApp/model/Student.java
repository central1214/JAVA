package com.lg.studApp.model;

public class Student {
	private String name;
	private int age;
	private char gender;
	private String addr;

	public Student(String name, int age, char gender, String addr) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
	}

	@Override
	public String toString() {
		String str = "이름 : " + name + "\n";
		str += "성별 : " + gender + "\n";
		str += "나이 : " + age + "\n";
		str += "주소 : " + addr + "\n";
		return str;
	}

	public void showStInfo() {
		
		System.out.printf("%s\t %d\t %s\t %s\n", name, age, gender, addr);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
