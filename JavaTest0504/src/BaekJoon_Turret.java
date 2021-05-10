
import java.util.Scanner;

public class BaekJoon_Turret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		for (int q = 0; q < T; q++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			int clength = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
			int rlength = (r1 + r2) * (r1 + r2);
			if (clength != 0) {
				if (clength == rlength) {
					arr[q] = 1;
				} else if (clength < rlength) {
					arr[q] = 2;
				} else if (((clength + r1) * (clength + r1) == r2 * r2) || ((clength + r2) * (clength + r2) == r1 * r1)) {
					arr[q] = 1;
				}
				else {
					arr[q] = 0;
				}
			} else {
				if (r1 == r2) {
					arr[q] = -1;
				} else {
					arr[q] = 0;
				}
			}
			
		}
		sc.close();
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
//		int arr1[][] = new int[1000][2];
//		int arr2[][] = new int[1000][2];
//		
//		
//		for (int i = x1-r1; i <= x1+r1; i++) {
//			for (int j = y1-r1; j <= y1+r1; j++) {
//				if ((i-x1) * (i-x1) + (j-y1) * (j-y1) == r1 * r1) {
//					arr1[count1][0] = i;
//					arr1[count1][1] = j;
//					count1++;
//				}
//			}
//		}
//		for(int i = 0; i < count1; i++) { System.out.println("arr1= " + arr1[i][0]+","+arr1[i][1]);}
//		
//		for (int i = x2-r2; i <= x2+r2; i++) {
//			for (int j = y2-r2; j <= y2+r2; j++) {
//				if ((i-x2) * (i-x2) + (j-y2) * (j-y1) == r2 * r2) {
//					arr2[count2][0] = i;
//					arr2[count2][1] = j;
//					count2++;
//				}
//			}
//		}
//		for(int i = 0; i < count2; i++) { System.out.println("arr2 = " + arr2[i][0]+","+arr2[i][1]);}
//		for (int i = 0; i < count1; i++) {
//			for (int j = 0; j < count2; j++) {
//				if (Arrays.equals(arr1[i], arr2[j])) {
//					ans++;
//				}
//			}
//		}
//		
//		System.out.println("\n" + ans);
//		}
