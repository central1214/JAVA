package javaTest0503;

import java.util.Random;

public class SwitchTest_1 {

	public static void main(String[] args) {
		//0~3 사이의 랜덤한 숫자 발생
		//int time = (int)(Math.random()*4);
		Random r = new Random();
		int time = r.nextInt(4) + 8;
		System.out.println(time);
		switch (time) {
		case 8:
			System.out.println("출근");
			break;
		case 9 :
			System.out.println("회의 시작");
			break;
		case 10 : 
			System.out.println("업무 시간");
			break;
		default :
			System.out.println("외근중");
			break;
		}
	}

}
