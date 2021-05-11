import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ArrayNameMethod {

	private static final String FileOuputStream = null;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arr[][] = { { "김", "박", "이", "최", "장" }, { "바", "사", "아", "자", "차" }, { "가", "나", "다", "라", "마" } };
		String totalName = "";

		while (true) {

			manual();
			int opt = sc.nextInt();
			switch (opt) {
			case 1: {
				for (int i = 0; i < 50; i++) {
					totalName += mixName(arr);
				}
				saveName(totalName);
				break;
			}
			case 2: {
				System.out.println("파일을 읽어옵니다.");
				break;
			}
			case 3: {
				System.exit(0);
				break;
			}
			}
		}

	}

	public static void manual() {

		System.out.println("---------------------");
		System.out.println("  파일 제어 프로그램 v1.1");
		System.out.println("---------------------");
		System.out.println("1. 이름 생성하여 파일에 저장하기");
		System.out.println("2. 파일에서 이름 읽어오기");
		System.out.println("3. 프로그램 종료");
		System.out.println("---------------------");
		System.out.print("메뉴 선택 : ");

	}

	public static String mixName(String[][] arr) {
		Random ran = new Random();
		String name = arr[0][ran.nextInt(5)] + arr[1][ran.nextInt(5)] + arr[2][ran.nextInt(5)] + "\n";
		return name;
	}

	public static void saveName(String name) {

		try {
			FileOutputStream output = new FileOutputStream("testJava.txt");
			output.write(name.getBytes());
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
