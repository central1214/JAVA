package hashMapStudy;

import java.util.HashMap;

public class HashMapEx3 {//입는 옷 별로 선택을 안 할 때의 조건은 0으로 생각하자
						// 프로그래머스에 나오는 스트림 풀이도 스트림 공부후 다시 풀기!

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}
	
	public static int solution(String[][] arr) {
		int answer = 1;
		
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i][1], map.getOrDefault(arr[i][1], 1)+1);			
		}
	
		for (String key : map.keySet()) {
			answer *= map.get(key);			
		}
		answer -= 1;
        return answer;
		
	}

}
