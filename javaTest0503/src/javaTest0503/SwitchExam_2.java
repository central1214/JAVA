package javaTest0503;

import java.util.Scanner;

public class SwitchExam_2 {

	public static void main(String[] args) {
	
		//------------------------------
		//담배 자판기 프로그램 v1.0
		//------------------------------
		//원하는 아이스크림을 메뉴에서 선택하세요.
		//1. 죠스바	: 900원
		//2. 구구콘	: 1,500원
		//3. 메로나	: 900원
		//4. 뽕따		: 800원
		//5. 탱크보이	: 1,000원
		//------------------------------
		//아이스크림을 선택하세요. : 5
		//탱크보이를 선택하였습니다.
		//Insert Coin... : 10000
		//탱크보이를 구매하였습니다
		//거스름돈 : 9000원을 받으세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("담배 자판기 프로그램 v1.0");
		System.out.println("----------------------------");
		System.out.println("원하는 아이스크림을 메뉴에서 선택하세요");
		System.out.println("1. 죠스바		: 900원");
		System.out.println("2. 구구콘		: 1,500원");
		System.out.println("3. 메로나		: 900원");
		System.out.println("4. 탱크보이	: 1,200원");
		System.out.println("아이스크림을 선택하세요. : ");
		int ice = sc.nextInt();                                                                                
		System.out.println("Insert Coin...");
		int coin = sc.nextInt();
		switch (ice) {
		case 1 :
			System.out.println("죠스바를 구매했습니다.");
			System.out.printf("거스름돈 %d를 받으세요",coin-900);
			break;
		case 2 :
			System.out.println("구구콘을 구매했습니다.");
			System.out.printf("거스름돈 %d를 받으세요",coin-1500);
			break;
		case 3 :
			System.out.println("메로나를 구매했습니다.");
			System.out.printf("거스름돈 %d를 받으세요",coin-900);
			break;
		case 4 :
			System.out.println("탱크보이를 구매했습니다.");
			System.out.printf("거스름돈 %d를 받으세요",coin-1200);
			break;
		}
		
		
		sc.close();
	}

}
