import java.util.Random;
public class Lotto {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int lotto[] = new int[6];
		System.out.println("-------------------");
		System.out.println("간단한 로또 프로그램 v1.0");
		System.out.println("-------------------");
		
		for (int i =0; i < 6; i++) {
			lotto[i] = rand.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		
		
		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}

}
