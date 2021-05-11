
public class Method {

	public static void main(String[] args) { // ()가 있다? 메소드다~ main <- 진입자
		// void 존재하면 실행후 종료 (반환값이 없다)
		// 1. void method1() : 매개변수 x
		// 2. void method2(매개변수...) : 매개변수가 n개

		// 타입이 존재하면 반드시 return이 필요
		// 3. 타입 method3() : 타입과 일치하는 return값이 필요 (int double String 등등.. Class 도 타입이라고
		// 볼 수 있다!)
		// 4. 타입 method4(매개변수...) : return 필요, 매개변수 필요

		// 5. 재귀함수
		
		// method 호출~
		method1();
		showName(20);
		showAge();

	}
	//메소드 정의 (Main method의 바깥쪽에 있어야 한다, class 안에는 있어야하고!)
	public static void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method() 호출");
		}
		showName();
		showName("Ezreal", 3030);
	}
	public static void showName() { // 첫 글이 소문자면서 이어지는 단어를 대문자로 시작 : 카멜 방식(자바) 첫글이 대문자 면서 '' : 파스칼방식 (C#) show_name(c)
		System.out.println("홍길동");
	}
	public static void showAge() { // 1번 타입
		System.out.println("24");
	}
	
	// !!!***오버로딩(중복정의)***!!!! 중요!!!
	// 조건 1. 매개변수 타입이 달라야 한다
	// 조건 2. 매개변수 개수가 달라야 한다
	public static void showName(String name) {
		System.out.println(name);
	}
	public static void showName(String name, int age) {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	public static void showName(int age) {
		System.out.println("홍길동의 나이는 " + age);
	}

}
