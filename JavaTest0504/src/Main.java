import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

			int rdiff = r1 - r2 > 0 ? (r1 - r2) : (-1) * (r1 - r2);

			if ((d == 0) && (r1 == r2)) {
				System.out.println(-1);
			} else if ((d > r1 + r2) || (d < rdiff)) {
				System.out.println(0);
			} else if ((d == r1 + r2) || (d == rdiff)) {
				System.out.println(1);
			} else if (d < r1 + r2) {
				System.out.println(2);
			}

		}
		sc.close();
		
	}

}
