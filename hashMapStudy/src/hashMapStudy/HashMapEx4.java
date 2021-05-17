package hashMapStudy;
import java.util.HashMap;

public class HashMapEx4 {

	public static void main(String[] args) {
		String[] genre = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		solution(genre, plays);

	}
	
	public static int[] solution(String[] genre, int[] plays) {
		int[] answer = new int[4];
		String first = "";
		String second = "";
		HashMap<String, Integer> movie = new HashMap<>(); 
		for (int i = 0; i< genre.length; i++) {
			movie.put(genre[i], movie.getOrDefault(genre[i], 0) + plays[i]);
		}
		int one = movie.get()
		for (String i : movie.keySet()) {
			movie.get(i);
			
		}
		return answer;
	}

}
