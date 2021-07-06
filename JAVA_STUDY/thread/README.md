# thread란?<br><br>
- 자바 쓰레드의 정의를 알기 전에 __프로세스__ 에 대해 알아야 한다. 
보통 우리가 만드는 프로그래밍 언어Java, C/C++ 등로 소스를 짜서 만든 것을 __프로그램__ 이라고 한다.
그리고 이 프로그램을 "실행" 시켜서 동작하게 만들면 이것을 __프로세스__ 라고 한다. 이 프로세스는 보통 하나의 루틴프로그램 처리 경로을 가지고 있다.
이 루틴은 직렬적이며, 즉 어떠한 일을 수행하는 것에 있어 프로그래머가 원하는 순서대로 일을 처리한다. 
그러나 생각해보면 굳이 앞뒤 순서가 필요 없는 일들이 있을 때 분리해서 동시에 처리하고 때가 있는데, 이 때 자바에서 사용할 수 있는 것이 __쓰레드Thread__ 다.
- 즉 직렬적으로 일을 수행하는 것이 아닌 병렬적, __동시에 여러가지 일을 수행하게 하는 것이 thread__ 이다
자바 쓰레드를 이용하면 하나의 프로세스에서도 병렬적으로 처리, 즉 여러 개의 처리 루틴을 가질 수 있다.
단순 반복의 코드를 실행할 때도 여러 개의 쓰레드를 만들어서 분리 시킨 뒤 결과 데이터를 받아 합치면 그만큼 시간을 절약할 수 있다.

### thread 사용법
#### Thread클래스 상속받기
```java
import java.util.Iterator;

public class ThreadEx extends Thread { //Thread클래스를 상속
	int seq;

	public ThreadEx(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println(this.seq + "thread 시작");
		try {
			Thread.sleep(100);
		} catch (Exception e) {

		}
		System.out.println(this.seq + "thread 끝!");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			ThreadEx ex = new ThreadEx(i);
			ex.start(); // 스레드를 상속받으면 run함수를 start로 수행한다
		}
		System.out.println("메인 끝!");

	}

}

```
- 실행결과
```java
1thread 시작
0thread 시작
2thread 시작
5thread 시작
3thread 시작
6thread 시작
4thread 시작
7thread 시작
메인 끝!
9thread 시작
8thread 시작
1thread 끝!
0thread 끝!
8thread 끝!
2thread 끝!
4thread 끝!
6thread 끝!
7thread 끝!
9thread 끝!
5thread 끝!
3thread 끝!
```
- 동시에 수행하기 때문에 인덱스 순서대로 나오지 않고 심지어 스레드가 종료되기 전에 메인메소드가 종료됐다
#### join
- 스레드가 모두 종료되고 메인함수를 종료 시키려면 어떻게 해야할까?
```java
public static void main(String[] args) {
		ArrayList<Thread> th = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			ThreadEx ex = new ThreadEx(i);
			ex.start();
			th.add(ex);
		}
		for(int i = 0; i < 10; i++) {
			Thread t = th.get(i);
			try {
				t.join();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("메인 끝!");
		

	}
```
- join 함수는 join함수를 사용한 스레드들이 모두 종료될 때까지 대기한다

#### 잘 정리되어 있는 곳! [여기](https://dailyworker.github.io/java-thread/)
