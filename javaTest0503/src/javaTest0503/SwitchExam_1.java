package javaTest0503;

import java.util.Scanner;

public class SwitchExam_1 {

	public static void main(String[] args) {
	
		//--------------------------
		//식당메뉴 자동 주문 프로그램 v1.0
		//--------------------------
		//원하는 식사를 선택하세요
		//1. 김치찌개 : 5000원
		//2. 된장찌개 : 5000원
		//3. 돈까스 : 8000원
		//4. 해장국 : 8500원
		//5. 맘스터치 : 9000원
		// 메뉴 션택 : 
		//[출력형태] 
		// 해장국을 주문했습니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("식당 메뉴 자동 주문 프로그램");
		System.out.println("---------------------");
		System.out.println("1. 김치찌개");
		System.out.println("2. 된장찌개");
		System.out.println("3. 돈까스");
		System.out.println("4. 헤장국");
		System.out.println("---------------------");
		System.out.println("메뉴 선택 : ");
		int sel = sc.nextInt();
		switch (sel) {
		case 1 :
			System.out.println("김치찌개를 주문했습니다");
			break;
		case 2 :
			System.out.println("된장찌개를 주문했습니다");
			break;
		case 3 :
			System.out.println("돈까스를 주문했습니다");
			break;
		case 4 :
			System.out.println("해장국을 주문했습니다");
			break;
		default :
			System.out.println("잘못된 번호입니다");
			break;		
		}
		//콘솔프로그램 = UI를 사용하지 않는 프로그램
		//하드코딩 =? 
		
		
	}

}
