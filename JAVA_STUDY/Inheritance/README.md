# 클래스의 상속

### 상속이란?
 - 말 그대로 부모로 부터 자식이 무언가를 물려받는 것!
 - 즉 부모 클래스를 자식 클래스가 선택하여 부모클래스의 멤버를 상속 받는 것이다.
 - 
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

