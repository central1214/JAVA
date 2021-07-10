# 클래스의 상속 

### 상속이란?
 - 말 그대로 부모로 부터 자식이 무언가를 물려받는 것!
 - 즉 부모 클래스를 자식 클래스가 선택하여 부모클래스의 멤버를 상속 받는 것이다.

### 상속의 사용 이유
 - 이미 마련되어 있는 클래스를 재사용할 수 있고, 그러므로 개발시간을 단축시킬 수 있다.
 - BUT 상속을 단순히 재활용을 목적으로 사용할 겨우 무의미하게 코드만 복잡해 질 수 있다.
 - 연관된 일련의 클래스들에 대해 공통적인 규약을 정의할 수 있다. <- __요놈이 더 좋은 대답!__

### 사용법
 - 클래스명 뒤에 extends 키워드를 붙이고 상속받을 클래스명을 쓴다
 - 자바는 다중 상속을 허용하지 않는다!

### 예시
 - 부모 클래스
```java
public class Man {
	String name = "정훈";
	
	public void call() {
		System.out.println("네?");
	}
}
```
 - 자식 클래스

```java
public class Student extends Man {
	String subject = "AI를 활요한 뭐시기 반";
	
	public void study() {
		System.out.println("Zzzzz...");
	}
}
```
```java
public static void main(String[] args) {
		
		 Student st = new Student();
		 st.study();		 
		 System.out.println(st.name+"!!");
		 st.call();
	}
```
- 출력결과
```
Zzzzz...
정훈!!
네?
```
 - 포함관계를 봤을 때 예시가 좋지는 않지만 main함수에서 자식클래스 student 객체만 생성해도 부모클래스의 변수와 메소드를 사용할 수 있단 걸 알 수 있다!

## 부모 클래스 생성자 호출

 ```java
public class Man {
	String name;
	
	public void call() {
		System.out.println("네?");
	}
}
```
 - 위 클래스의 name변수를 자식 클래스에서 값을 넣어주려면 어떻게 해야할까?
 
 ```java
public class Student extends Man {
	String subject = "AI를 활요한 뭐시기 반";
	
	public Student(String name){ //<< 자식클래스 생성자에 입력
		super(name); //상위 클래스의 생성자 지정 및 호출
	}
	
	public void study() {
		System.out.println("Zzzzz...");
	}
	
}
```
## 참조변수의 참조 범위
 - Man man = new Man()은 Man 인스턴스를 생성하여 Man클래스형 참조변수가 참조하는 것이다. 익숙할 것이다.
 - Man man = new Student()  !!!!>#!>!?! 뭔가 이상하다 Student인스턴스를 Man클래스형 참조변수로 받네?
 - 상속관계에서는 부모클래스형의 참조변수로 자식클래스의 인스턴스를 참조하는 것이 가능하다.
 - But, 자식클래스형의 참조변수로 부모클래스 인스턴스를 참조하는 것은 불가능하다.
 - 그럼 자연스럽게 궁금해진다. 자식클래스 인스턴스를 부모클래스형으로 참조하면 __부모클래스의 멤버는? 자식클래스의 멤버는? 어디까지 사용가능하고 어디까지 사용하지 못할까?__
 ```java
 class Man{
	
	public void talk() {
		System.out.println("건장한 성인입니다요");
	}
	public void company() {
		System.out.println("백수입니다");
	}
}

class Student extends Man{
	
	public void talk() { //메소드 오버라이딩
		System.out.println("덜 건장한 학생입니다요");
	}
	public void school() {
		System.out.println("경구고 다녀요");
	}
}

public static void main(String[] args) {
		Man man = new Man(); // talk(), company()
		Man man1 = new Student(); //company(), 오버라이딩 된 talk()
		Student man2 = new Student(); //의 멤버 - school(), company(), 오버라이딩 된 talk()
		
		man.talk();		
		man.company();
		
		man1.talk();
		man1.company();
		//man1.school(); students 클래스의 메소드 사용 불가능!
		
		man2.company();
		man2.school();
		man2.talk();
		//Student 클래스 메소드 전부 사용 가능!

	}
 ```
```java
건장한 성인입니다요 //man.talk();의 출력결과
백수입니다 //man.company();의 출력결과
덜 건장한 학생입니다요 // man1.talk(); 출력결과
백수입니다 // man1.company(); 출력결과
백수입니다 // man2.company(); 출력결과
경구고 다녀요 // man2.school(); 출력결과
덜 건장한 학생입니다요 // man2.talk(); 출력결과
```
- man1을 통해 접근 가능한 멤버는 Man에 정의되어 있는 멤버로 제한된다. (혹시 Man클래스가 상속을 받은 상태라면 그 부모도 되겠지요)

## instanceof 연산자
 - 참조변수가 참조하는 클래스나 상속하는 클래스를 묻는 연산자이다. 
 - if(cake instanceof Cake)
 - cake 참조변수가 Cake의 인스턴스인가를 묻는 것이다. 맞으면 true, 틀리면 false를 반환한다.
```java
class Box{
	public void simpleWrap() {
		System.out.println("간단하게 포장~");
	}
}
class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("종이로 포장!");
		
	}
}
class GoldBox extends PaperBox {
	public void goldWrap() {
		System.out.println("금으로 포장!!!!");
	}
}

public class JavaStudy {

	public static void main(String[] args) {
				
		Box1 box4 = new Box1();
		Box1 box5 = new PaperBox1(); //Box를 상속하는 PaperBox
		Box1 box6 = new GoldBox1(); // Box를 상속하는 PaperBox를 상속하는 GoldBox

		wrapBox1(box4);
		wrapBox1(box5);
		wrapBox1(box6);
	}
	public static void studyBox(Box box) {
		if (box instanceof Box) { //box가 참조하는 class가 Box일 경우 true
			System.out.println("Box_Box");
		}
		if (box instanceof PaperBox) {//box가 참조하는 class가 Box일 경우, PaperBox일 경우 true
			System.out.println("Paper_Paper");
		}
		if (box instanceof GoldBox) { //box가 참조하는 class가 Box일 경우, PaperBox일 경우, GoldBox일 경우 true
			System.out.println("Gold_Gold");
		}
		System.out.println();
	}
```
```java
Box_Box

Box_Box
Paper_Paper

Box_Box
Paper_Paper
Gold_Gold
```
 
