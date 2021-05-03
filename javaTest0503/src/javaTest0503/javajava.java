package javaTest0503;

import java.util.Scanner;

public class javajava {

	public static void main(String[] args) {
		//출력
//		System.out.print("dlkjd");
//		System.out.println("222"+"333");
//		System.out.printf("%d",200);
//		//입력 
//		// 첫글자가 대문자 <ㅡ 대게 클래스 구나~
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이 입력 : ");
//		int num = sc.nextInt();
//		System.out.println("이름 입력 : ");
//		String name = sc.next();
//		System.out.println("나이 : " + num);
//		System.out.println("이름 : " + name);
//		
//		
//		//국어, 영어, 수학 점수를 입력 받고 
//		//총점과 평균을 구하는 프로그램 작성.
//		System.out.println("국어 성적 : ");
//		int kor = sc.nextInt();
//		System.out.println("영어 성적 : ");
//		int eng = sc.nextInt();
//		System.out.println("수학 성적 : ");
//		int mat = sc.nextInt();
//		System.out.printf("총점 : %d\n",kor+eng+mat);
//		System.out.printf("평균 : %d",(kor+eng+mat)/3);
//		
//		sc.close();
//		
		//동전은 각각 500, 100, 50, 10원 사용
		//특정 금액 입력 ex)1250
		//-------------------
		//동전 교환 프로그램 v1.0
		//-------------------
		//오백원 개수 : 2 -----
		System.out.println("-------------------");
		System.out.println("동전 교환 프로그램 v1.0");
		System.out.println("-------------------");
		System.out.println("교환할 금액 : ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		System.out.printf("오백원 개수 : %d\n", money / 500);
		System.out.printf("일백원 개수 : %d\n", money % 500 / 100);
		System.out.printf("오십원 개수 : %d\n", money % 100 / 50);
		System.out.printf("일십원 개수 : %d\n", money % 50 / 10);
		
		scan.close();
		
	}

}
