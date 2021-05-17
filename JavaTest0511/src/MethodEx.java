import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MethodEx {

	public static void main(String[] args) {

		// ex1();
		// ex4();
		ex6();
		// ex7();
		// ex8();
		// ex9();
		// ex10();
		//ex11();

	}

	public static void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비교할 수를 입력해주세요.(3개)");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sortNumber(num1, num2, num3);

	}

	public static void sortNumber(int num1, int num2, int num3) {

		int arr[] = { num1, num2, num3 };
		int tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] <= arr[j + 1]) {
					tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static void ex4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력할까요? : ");
		int dan = sc.nextInt();
		googoo(dan);
		sc.close();
	}

	public static void googoo(int num) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
	}

	public static void ex6() {

		lottoIntro();
		int lottoNum[] = lotto();
		Arrays.sort(lottoNum);
		for (int i : lottoNum) {
			System.out.println(i);
		}

	}

	public static void lottoIntro() {

		System.out.println("-------------------");
		System.out.println("간단한 로또 프로그램 v1.0");
		System.out.println("-------------------");

	}

	public static int[] lotto() {
		Random rand = new Random();
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			System.out.println("랜덤 숫자 발생 : " + lotto[i]);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.println("!!!!!!!!!!중복!!!!!!!!!!!\n숫자 제거 : " + lotto[i]);
					i--;
					break;
				}
			}
		}
		return lotto;
	}

	public static void ex7() {
		System.out.printf("홀수들의 합 : %d, 짝수들의 합 : %d", holJakSum()[0], holJakSum()[1]);
	}

	public static int[] holJakSum() {

		int arr[] = new int[2];
		int holTotal = 0;
		int jakTotal = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				jakTotal += i;
			} else {
				holTotal += i;
			}
		}
		arr[0] = jakTotal;
		arr[1] = holTotal;
		return arr;
	}

	public static void ex8() {
		googooHol();
	}

	public static void googooHol() {

		for (int i = 2; i < 10; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
			}
		}
	}

	public static void ex9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기를 비교할 수를 입력하세요. :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("최대값 : " + maxMin(num1, num2, num3)[0]);
		System.out.println("최소값 : " + maxMin(num1, num2, num3)[1]);
	}

	public static int[] maxMin(int num1, int num2, int num3) {
		int[] arr = new int[2];
		int[] nums = { num1, num2, num3 };
		int max = num1;
		int min = num1;
		for (int i = 0; i < 3; i++) {
			if (max >= nums[i]) {
				max = nums[i];
			} else if (min <= nums[i]) {
				min = nums[i];
			}
		}
		arr[0] = max;
		arr[1] = min;
		return arr;
	}

	public static void ex10() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(facto(num));
		sc.close();
	}

	public static int facto(int num) {

		if (num == 1) {
			System.out.print(1 + " = ");
			return 1;
		}
		System.out.print(num + " X ");
		return num * facto(num - 1);

	}

	public static void ex11() {
		
		int[][] score = scanScore();
		System.out.println("학생번호\t 총점\t 평균\t 등급");
		for (int i = 0; i < 5; i++) {
			int total = 0;
			for (int j = 0; j <3; j++) {
				total += score[i][j];
			}
			System.out.printf("%d번: \t %d\t %d\t %s\n", i, total, total/3, grade(total/3));
		}
	}

	public static int[][] scanScore() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[][] scoreArr = new int[5][3];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {		
				scoreArr[i][j] = rand.nextInt(101);
			}
		}
		sc.close();
		return scoreArr;
	}
	public static String grade(int num) {
		if (num >= 90) {
			return "A";
		}
		else if (num >= 80) {
			return "B";
		}
		else if (num >= 70) {
			return "C";
		}
		else if (num >= 60) {
			return "D";
		}
		else {
			return "F";
		}
	}

}
