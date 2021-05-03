package javaTest0503;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		//EX_1
		Scanner sc = new Scanner(System.in);
//		System.out.println("--------------------------");
//		System.out.println("홀짝 판단 프로그램 v1.0");
//		System.out.println("--------------------------");
//		System.out.println("숫자 입력 : ");
//		int num = sc.nextInt();
//		
//		if (num%2 == 0) { System.out.printf("%d는 짝수입니다",num); }
//		else {System.out.printf("%d는 홀수입니다",num); }
//		
//		sc.close();
		//Ex_2
//		System.out.println("--------------------------");
//		System.out.println("대소 비교 프로그램 v1.0");
//		System.out.println("--------------------------");
//		System.out.println("num1 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("num1 입력 : ");
//		int num2 = sc.nextInt();
//		if (num1 > num2)
//		{
//			System.out.printf("%d가 %d보다 크다",num1,num2);
//		}
//		else if (num1 < num2)
//		{
//			System.out.printf("%d가 %d보다 크다",num2,num1);
//		}
//		else
//		{
//			System.out.printf("%d와 %d가 같다",num1,num2);
//		}
		
		//Ex_3
		System.out.println("--------------------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("--------------------------");
		System.out.println("1. num1 입력");
		double num1 = sc.nextDouble();
		System.out.println("2. num2 입력");
		double num2 = sc.nextDouble();
		System.out.println("3. 연산자 입력");
		String opt = sc.next();
		switch (opt) {
		case "+":
			System.out.printf("%.1f + %.1f = %.1f",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%.1f - %.1f = %.1f",num1,num2,num1-num2);
			break;
		case "x":
			System.out.printf("%.1f X %.1f = %.1f",num1,num2,num1*num2);
			break;
		case "/":
			System.out.printf("%.1f / %.1f = %.1f",num1,num2,num1/num2);
			break;
					
		}
	}

}
