import java.util.Scanner;

public class Loop_Ex {
	static final int MUNU_FILE_WRITE = 1;
	static final int MUNU_FILE_READ = 2;
	static final int MUNU_FILE_EXIT = 3;
	
	public static void main(String[] args) {
		//Ex1
		Scanner sc = new Scanner(System.in);
//		System.out.println("------------------------");
//		System.out.println(" 짝수, 홀수 구분 프로그램 v1.0");
//		System.out.println("------------------------");
//		
//		for (int i = 1; i <= 3; i++) {
//			System.out.printf("%d. Num%d =>",i,i);
//			int num = sc.nextInt();
//			if (num%2 == 0) {System.out.println("짝수입니다");}
//			else {System.out.println("홀수입니다");}
//		}
		//Ex2
//		for (int i = 0; i <= 100; i++) {
//			if(i % 5 == 0) {
//				System.out.println(i);
//			}
//		}
		//Ex4
//		int total = 0;		
//		int num2 = 0;
//		System.out.println("Num1 입력 => ");
//		int num1 = sc.nextInt();
//		System.out.println("Num2 입력 => ");
//	
//		while(true) { //for(;;)와 같다.
//			num2 = sc.nextInt();
//			if (num1 >= num2) {
//				System.out.println("ERROR!!!!");
//			}
//			else {
//				break;}
//		}
//		for (int i = num1; i <= num2; i++) {
//			total += i;
//		}
//		System.out.printf("%d ~ %d 까지의 합 : %d\n",num1,num2,total);
//		

		//Ex5
//		System.out.println("구구단 입력 : ");
//		int goo = sc.nextInt();
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%d x %d = %d\n",goo,i,goo*i);
//		
		//}
		//Ex7
		
		while(true) {
		System.out.println("-----------------------");
		System.out.println("간단한 파일 관리 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("1. 파일 생성 및 쓰기");
		System.out.println("2. 파일 읽기");
		System.out.println("3. 종료");
		System.out.print("메뉴를 선택하세요: ");
		int opt = sc.nextInt();
		if (opt == MUNU_FILE_WRITE) {
			System.out.println("파일 생성 및 쓰기 실행됩니다");			
		}
		else if (opt == MUNU_FILE_READ) {
			System.out.println("파일 읽기가 실행됩니다");
		}
		else if (opt == MUNU_FILE_EXIT) {
			System.out.println("프로그램이 종료됩니다.");
			System.exit(0); //프로그램 종료 함수
			break;}
		
		else { System.out.println("잘못된 입력입니다.");
		}
		}
		
		
	}

}
