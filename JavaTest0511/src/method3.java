
public class method3 {

	public static void main(String[] args) {
		//타입 메소드 이름()
		getAge();
		System.out.println(getAge());
		System.out.println("이름 : "+ getName());
		System.out.println("나이 : " + getAge(30));
		System.out.println("이름 : "+ getName("임"));
	}

	public static int getAge() {
		return 200;
	}
	public static String getName() {
		return "동이동이길동이";
	}
	public static int getHeight() {
		int key = 175;
		return key;
	}
	public static int getAge(int age) {
		return age+100;
	}
	public static String getName(String lastName) {
		return lastName + "길동";
	}
}
