
public class Array_1 {

	public static void main(String[] args) { // 배열의 변수 이름은 주소다!
		int[] num = {10, 20, 30, 40, 50};
		int num2[] = {10, 20};
		int num3[] = new int[10];// 지역변수 외에는 초기화하지 않으면 쓰레기 값이 들어가 있다.
		
		for (int i=0; i<num3.length; i++) {
			num3[i] = 10;
		}
		for (int i=0; i<num3.length; i++) {
			System.out.println(num3[i]);
		}
		int arr1[][] = new int[2][3]; // 비어있는 배열 만들기
		for (int i = 0; i < arr1.length; i++) { //arr1.length= arr1행의 길이 (2)
			for (int j=0; j<arr1[i].length; j++) { //arr1[i].length = arr1[i]행의 길이 (3)
			}
		}
		
		int[][] arr2 = {
				{1, 2}, {4, 5}, {7, 8} //3행 2열
		};
		System.out.println("\n-------------for문 2차배열 출력-----------");
		for (int i = 0; i<3; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n-------------향상된 for문 2차배열 출력-----------");
		for (int[] i : arr2) {
			for (int j : i) {
			System.out.println(j + " ");
			}
		}
		int arr3[][][] = {
				{{1, 2, 4}, {3, 4, 5}},
				{{5, 6, 7}, {6, 7, 9}}
		};
		System.out.println("\n-------------for문 3차배열 출력-----------");
		for (int t = 0; t< arr3.length; t++) {
			for (int j = 0; j <arr3[t].length; j++) {
				for(int k = 0; k <arr3[t][j].length; k++) {
					System.out.print(arr3[t][j][k]+ " ");
				}
			}
		}
		System.out.println("\n-------------향상된 for문 3차배열 출력-----------");
		for (int[][] t : arr3) {
			for (int[] j : t) {
				for (int k : j) {
					System.out.print(k+ " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

