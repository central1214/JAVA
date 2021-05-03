package javaTest0503;

import java.util.Scanner;

public class JavaExam_3 {

	public static void main(String[] args) {
		//---------------------
		//학점 관리 프로그램 v1.0
		//---------------------
		//100 ~ 90 : A학점
		//89 ~ 80 : B학점 ~ 59~0 : F학점
		//국어 , 수학, 영어
		//[출력형태] 총점, 평균 , 학점

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 :");
		double kor = sc.nextDouble();
		System.out.println("수학 점수 입력 :");
		double math = sc.nextDouble();
		System.out.println("영어 점수 입력 :");
		double eng = sc.nextDouble();
		double total = kor + math + eng;
		double avg = (kor + math + eng) / 3;
		String grade = "";
		if (avg >= 90) {
			grade = "A";
		}
		else if (avg >= 80) {
			grade = "B";
		}
		else if (avg >= 70) {
			grade = "C";
		}
		else if (avg >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.printf("총점 : %.1f\n", total);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.printf("등급 : %s", grade);
		sc.close();
	}

}
