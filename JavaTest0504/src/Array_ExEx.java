
public class Array_ExEx {

	public static void main(String[] args) {
		//Ex1
//		int arr[] = {20, 34, 22, 14, 36, 23, 67};
//		int total= 0;
//		for (int i = 0; i < arr.length; i++) {
//			total += arr[i];
//		}
//		System.out.printf("총합 : %d 평균 : %d",total,total/arr.length);
		//Ex2
//		int arr[] = new int[100];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//		for (int i = 0; i < 90; i++ ) {
//			if(arr[i]%5 ==0) {
//				System.out.println(arr[i]);
//			}
//		}
		//Ex3
//		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		int arr1[] = new int[10];
//		for (int i = 0; i <10; i++) {
//			arr1[i] = arr[9-i];
//		}
//		for (int i = 0; i <10; i++) {
//			System.out.print(arr1[i] + " ");
//		}
		//Ex4
//		int arr[][] = {
//				{1, 2}, {2, 4, 6}, {3, 6}, {4, 8, 10, 12}, {10}
//		};
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.printf("arr[%d][%d] = %d ",i,j,arr[i][j]);			
//			}
//			System.out.println();
//		}
		//Ex5
//		int arr[] = {1,2,3,4,5,6,7,8,9};
//		int arr1[] = {10,20,30,40,50,60,70,80,90};
//		int arr2[] = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			arr2[i] = arr[i]+arr1[i];
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr2[i] + " ");
//			if ((i+1)%3 == 0) { System.out.println();}
		
//		}
		//Ex6
		int arr[][] = new int[9][9];
		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j]= (i+1)*(j+1);
			}
		}
		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		//Ex7
		
	}

}
