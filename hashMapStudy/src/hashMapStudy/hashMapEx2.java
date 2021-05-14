package hashMapStudy;

import java.util.HashMap;

public class hashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "119", "97674223", "1195524421" };

		System.out.println(arr[1].substring(0, arr[0].length()));
		System.out.println(solution(arr));

	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		HashMap<Integer, String> map = new HashMap<>();
		int count = 0;
		for(String i : phone_book) {			
			map.put(count, i);
			count++;
		}
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book.length; j++) {
				if (phone_book[i].length() < phone_book[j].length()) {
					if (map.get(i).startsWith(map.get(j))||map.get(j).startsWith(map.get(i))) {
						return false;
					}
				}
			}
		}
		return answer;
	}
//	public static boolean solution(String[] phone_book) {
//		boolean answer = true;
//		for (int i = 0; i < phone_book.length-1; i++) {
//			for (int j = i+1; j < phone_book.length; j++) {
//				if (phone_book[i].startsWith(phone_book[j])) {
//					answer = false;					
//				}
//				if (phone_book[j].startsWith(phone_book[i])) {
//					answer = false;
//				}
//			}
//		}
//
//		return answer;
//	}
//	public static boolean solution(String[] phone_book) { //3차 시도
//		boolean answer = true;
//		HashMap<Integer, String> map = new HashMap<>();
//		int count = 0;
//		for(String i : phone_book) {			
//			map.put(count, i);
//			count++;
//		}
//		for (int i = 0; i < phone_book.length; i++) {
//			for (int j = 0; j < phone_book.length; j++) {
//                if (i==j || phone_book[i].length() >= phone_book[j].length()){
//                    continue;
//                }
//				if (phone_book[i].length() < phone_book[j].length()) {
//					if (map.get(i).startsWith(map.get(j))||map.get(j).startsWith(map.get(i))) {
//						return false;
//					}
//				}
//			}
//		}
//		return answer;
//	}
}
