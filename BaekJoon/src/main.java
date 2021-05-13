import java.util.Arrays;
import java.util.HashMap;

public class main {

	public static void main(String[] args) {

		String[] man = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		System.out.println(man[0] == completion[2]);
//		String a = new String("abc");
//		String b = new String("abc");
//		String c = "abc";
//		String d = "abc";
//		System.out.println(c == d);
//		System.out.println(a == b);
//		String answer = "";
//        for (int i = 0; i < man.length; i++){
//            for(int j = 0; j < completion.length; j++){
//                if (man[i] == completion[j]) {
//                    man[i] = "0";
//                    completion[j] = "0";
//                }
//            }
//        }
//        for (int i = 0; i < man.length; i++){
//            if (man[i] != "0"){
//                answer = man[i];
//            }
//        }
//        System.out.println(answer);

		System.out.println(hashMap(man, completion));
	}

	public static String solution(String[] participant, String[] completion) {

		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		String[] man = participant;
		String[] fin = completion;
		for (int i = 0; i < man.length; i++) {
			if (man[i].equals(fin[i])) {
				continue;
			} else {
				answer = man[i];
				break;
			}

		}

		return answer;
	}
	public static String hashMap(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (String players : participant) map.put(players, map.getOrDefault(players, 0) + 1);
		for (String players : completion) map.put(players, map.get(players)-1);
		for (String i : map.keySet()) {
			if (map.get(i) != 0) {
				answer = i;
			}
		}
		return answer;
	}
}
