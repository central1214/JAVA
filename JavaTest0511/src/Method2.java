import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		//간단한 사칙연산 계산기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 항 입력! ");
		int num1 = sc.nextInt();
		System.out.print("두번째 항 입력! ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력(+,-,*,/)");
		String op = sc.next();
		calcu(num1,num2,op);
		
		
	}
	
	//
	public static void calcu(int num1, int num2, String op) {
		switch(op) {
		case "+":
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);
			break;
		case "/":
			System.out.printf("%d / %d = %d", num1, num2, num1/num2);
			break;
		}
	}
	
}
