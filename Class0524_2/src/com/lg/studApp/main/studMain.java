package com.lg.studApp.main;

import com.lg.studApp.model.Student;
import com.lg.studApp.random.RandMaker;

public class studMain {

	public static void main(String[] args) {

		Student[] students = new Student[10];
		RandMaker ran = new RandMaker();
		for (int i = 0; i < students.length; i++) {
			students[i] =
				new Student(
					ran.randName(),
					ran.randAge(),
					ran.randGender(),
					ran.randAddr());
		}
		students[9].setName("전우치"); // 싱글톤 - 이미 만들어진 객체를 재사용
		students[9].setAge(24);
		students[9].setGender('남');
		students[9].setAddr("두메산골");
		System.out.println("이름\t 나이\t 성별\t 주소");
		System.out.println("---------------------------------");
		for (int i = 0; i < students.length; i++) {
			students[i].showStInfo();
		}

	}

}//NullPointerException 오류 - > 객체가 생성되지 않았는데 사용할 경우 나오는 오류
