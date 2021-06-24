# 오버라이딩
 - 부모클래스의 메소드를 자식 클래스가 __재정의__ 하여 사용하는 것을 뜻한다.
 
### 사용법
 - 부모클래스와 동일한 메소드명, 메소드 반환형, 메소드 매개변수 선언을 해야 한다.
 - 맛있는 우유로 예를 들어보자

```java
class Milk {	
	String brand = "서울우유";
	public void taste() {
		System.out.println("고소해~");
	}
}

class ChocoMilk extends Milk { //Milk클래스 상속

	String addFlavor = "Choco";
	public void taste() {		// 메소드 오버라이딩 - 부모클래스의 taste메소드와 메소드명, 반환형, 매개변수 선언이 같다.
		System.out.println("달콤해~"); // 고소해~를 출력하는 부모클래스의 메소드를 달콤해~ 출력으로 재정의
	}
}

public static void main(String[] args) {
		
		Milk milk = new Milk(); //Milk 객체 생성
		ChocoMilk cMilk = new ChocoMilk(); //ChocoMilk 객체 생성
		Milk cMilk2 = new ChocoMilk(); // 자식클래스 인스턴스는 부모클래스형 참조변수로 참조가 가능하다
		milk.taste();
		cMilk.taste();		
		cMilk2.taste();
		
    System.out.println("-------");
    
		System.out.println(milk.brand);
		System.out.println(cMilk.brand);
		System.out.println(cMilk.addFlavor);
		System.out.println(cMilk2.brand); 
    //System.out.println(cMilk2.addFlavor);  Milk형 참조변수로 참조했기 때문에 chocoMilk에만 정의된 메소드, 변수 사용 불가능
	}
```
- 출력결과

```java
고소해~ 
달콤해~
달콤해~ 
-------
서울우유
서울우유
Choco
서울우유

```
### 부모클래스형 참조변수의 자식클래스 참조
 - __부모클래스형 참조변수로 자식클래스 인스턴스의 참조가 가능하다__
 - cMilk2의 경우 부모클래스인 Milk형 참조변수가 ChocoMlik 인스턴스를 참조한다.
 - 즉 
 
```java
new ChocoMilk();
```
- 는 __Milk인스턴스이면서 동시에 chocoMilk인스턴스이다!__
- 하지만 Milk형 참조변수로 chocoMilk 인스턴스를 참조할 경우 chocoMilk에만 정의된 메소드와 변수는 사용하지 못한다.
