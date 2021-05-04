
public class Loop_1 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50}; // 배열 - 동일한 데이터 타입을 가지고 연속적인 공간을 가지는 것
		//배열의 이름은 배열의 시작 주소값이다.
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		int j = 0;
		while (j < arr.length) {
			System.out.print(arr[j] + " ");
			j++;
		}
		int k = 0;
		do {
			System.out.print(arr[k] + " ");
			k++;
		} while (k < arr.length);
		
		// 향상된 for
		for (int num : arr) {// arr <- 배열의 주소값
			System.out.print(num + " ");
		}
	}

}
