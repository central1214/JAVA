package javaTest0503;

import java.util.Scanner;

public class javaExam_1 {

	public static void main(String[] args) {
		//간단한 계산기 프로그램
		//1. 숫자 1 입력 : 20
		//2. 숫자 2 입력 : 10
		//3. 연산자 입력(+,-,*,/) : +
		//출력 결과 : 20 + 10 = 30
		double ans = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 숫자 입력 : ");
		double num1 = (double)sc.nextInt();
		System.out.println("2. 숫자 입력 : ");
		double num2 = (double)sc.nextInt();
		System.out.println("3. 연산자 입력 : ");
		String plus = sc.next();//nextLine은 Enter를 입력받기 때문에 next()로 입력
		if (plus.equals("+"))
			System.out.printf("%.1f + %.1f = %.1f",num1,num2,(num1+num2));
		else if (plus.equals("-"))
			ans = num1 - num2;
		else if (plus.equals("*"))
			ans = num1 * num2;
		else if (plus.equals("/"))
			ans = num1 / num2;
		
		
//		System.out.println(num1 + "+" + num2 + " = " + (num1+num2)); println을 쓰면 귀찮!
		sc.close();
		
			
	}

}
