

public class Loop_2 {

	public static void main(String[] args) { //i=0으로 시작하는 이유? 배열 인덱스가 0부터 시작해서
		
		//2x1=2 3x1=3 ... 9x1=9
		//2x2=4 3x2=6 ... 9x2=18
		//...
		//2x9=18 ...      9x9=81
		for (int i = 1; i < 10; i++) { // 기준
			for (int j = 2; j < 10; j++) {
				System.out.printf("%dx%d=%d\t",j,i,i*j);
			}
			System.out.println("\n");
		}

	}

}
