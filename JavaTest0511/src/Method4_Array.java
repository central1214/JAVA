
public class Method4_Array {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		int[][] arr2 = {{1,2},{2,3},{3,3}};
		showAddArr(arr);
		showAddArr(arr2);
		int retArr[] = getArr();
		for (int i : retArr) {
			System.out.println(i + " ");
		}
	}
	public static void showAddArr(int[] arr) {//배열 매개변수 받는 법 int[] arr <- 요즘 방식 int arr[] <- 옛날 방식
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void showAddArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[] getArr() { //배열 타입을 반환하니까! int[] 문자열 return 이었으면 String[]
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 100;
		}
		return arr;
	}
}
