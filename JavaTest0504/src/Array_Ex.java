import java.util.Scanner;

public class Array_Ex {

	public static void main(String[] args) {
		//1. 입력받는 값의 범위 1 ~ 65535
		//2. int 배열크키 16으로 사용하여 각각의 공간에
		//   이진수 0, 1 저장
		//3. 10진수를 2진수로 변경하여 2번 배열에 저장하여 출력
		//4. 8을 입력하면 00001000출력
		//   255를 입력하면 1111111 출력
		//   256을 입력하면 0000001 00000000 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오 : ");
		int num = sc.nextInt();
		int sol = num;
		int arr[] = new int[16]; //초기화시 0으로 채워진다.
		
		for (int i = 15; i > 0; i--) {
			if (num<1) { break;}
			arr[i]= num % 2;
			num = num /2;			
		}
		
		if (sol >= 256) {		
			for (int i = 0; i < arr.length; i++)
			{
				if (i==8) { System.out.print(" ");}
				System.out.print(arr[i]);
			}
		}
		else {
			for (int i = 8; i < arr.length; i++)
			{
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}

}
