import java.util.Random;

public class ArrayExam {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random ran = new Random();
		int cou = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100)             + 1;
		}
		holJjak(arr);
		for (String i : holJjakPrint(arr)) {
			System.out.printf("arr[%d] = %s \n", cou, i);
			cou++;
		}

	}

	public static void holJjak(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.printf("arr[%d] = %d \t 짝수입니다.\n", i, arr[i]);
			}
			else {
				System.out.printf("arr[%d] = %d \t 홀수입니다.\n", i, arr[i]);
			}
		}	
		
	}
	public static String[] holJjakPrint(int[] arr) {
		String strArr[] = new String[10];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				strArr[i] = "짝수";
			}
			else {
				strArr[i] = "홀수";
			}
		}	
		return strArr;
	}

}
