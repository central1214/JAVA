import java.util.Scanner;
import java.util.Random;
public class Array_Name {

	private static final String FileOuputStream = null;

	public static void main(String[] args) {
		
		
		System.out.println("---------------------");
		System.out.println("  파일 제어 프로그램 v1.1");
		System.out.println("---------------------");
		System.out.println("1. 이름 생성하여 파일에 저장하기");
		System.out.println("2. 파일에서 이름 읽어오기");
		System.out.println("3. 프로그램 종료");
		System.out.println("---------------------");
		System.out.print("메뉴 선택 : ");
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		String arr[][] = {
				{"김","박","이","최","장"},
				{"바","사","아","자","차"},
				{"가","나","다","라","마"}
		};
		String name[] = new String[50];
		for (int i = 0; i < 50; i++) {
			name[i] = arr[0][ran.nextInt(5)] + arr[1][ran.nextInt(5)] + arr[2][ran.nextInt(5)];
		}
		String name = FileOuputStream fos = new FileOutputStream("저장할 파일경로");

				출처: https://hashcode.tistory.com/entry/자바에서-배열에-저장된-값-텍스트-파일로-저장하려면-어떻게-해야하나요 [hashcode]

				출처: https://hashcode.tistory.com/entry/자바에서-배열에-저장된-값-텍스트-파일로-저장하려면-어떻게-해야하나요 [hashcode]
		for (int i = 0; i < 50; i++) {
			System.out.println(name[i]);
		}

	}

}
