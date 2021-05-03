package javaTest0503;

import java.util.Scanner;

public class JavaExam_2 {

	public static void main(String[] args) {
		//--------------------
		//윤년 구하는 프로그램 v1.0
		//--------------------
		//윤년을 구하는 년도 입력 :
		//출력결과 : 2020년도는 윤년입니다.
		
		//윤년조건 1. 입력한 년도를 4로 나누면 나머지고 0이고, 100으로 나누면 0이 아니다.
		//윤년조건 2. 입력한 년도를 400으로 나누면 나머지가 0이다.
		Scanner sc = new Scanner(System.in);
		System.out.println("윤년을 구하는 년도 입력 : ");
		int year = sc.nextInt();
		
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
			System.out.printf("%d는 윤년입니다", year);
		else
			System.out.printf("%d는 윤년이 아닙니다", year);
		sc.close();
		
	}


}
