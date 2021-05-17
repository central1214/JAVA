package hashMapStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMapEx {//https://vaert.tistory.com/107 해시맵 메서드 정리

	public static void main(String[] args) {
		// HashMap 선언
		HashMap<String, String> map1 = new HashMap<String, String>(); // HashMap 생성
		HashMap<String, String> map2 = new HashMap<>(); // new에서 타입 파라미터 생략 가능
		// HashMap 값 추가
		map1.put("사과", "맛있어!");
		map1.put("포도1", "씨1많아!");
		map1.put("포도2", "씨3많아!");
		map1.put("포도3", "씨2많아!");
		map1.put("포도4", "씨5많아!");
		System.out.println("키값" + map1.keySet());
		// HashMap 값 제거
		map1.remove("사과");
		System.out.println(map1);
		System.out.println(map1.get("포도1")); // 포도1 밸류 값 출력

		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[key] : " + entry.getKey() + " [Value] : " + entry.getValue());
		}
		for (String i : map1.keySet()) { // 저장된 key 값 확인
			System.out.println(i + map1.get(i));
		}
		System.out.println("List 생성");
		ArrayList list = new ArrayList();
		list.add("일");
		list.add("월");
		list.add("수");
		Iterator iter = list.iterator();
		while (iter.hasNext() == true) {
			String day = (String) iter.next();
			if (day == "수") {
				iter.remove();
			}
			System.out.println("Day : " + day);
		}
		System.out.println("-------------------");
		iter = list.iterator();
		while (iter.hasNext() == true) {
			String day = (String) iter.next();
			System.out.println("Day : " + day);
		}

	}

}
