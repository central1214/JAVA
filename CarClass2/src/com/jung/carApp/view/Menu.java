package com.jung.carApp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public static final int MAIN_MENU_VIEW = 1;
	public static final int MAIN_MENU_RANDOM_INS = 2;
	public static final int MAIN_MENU_INS = 3;
	public static final int MAIN_MENU_EXIT = 4;
	

	public int mainMenu() {
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("-----------------------");
		System.out.println("중고차 매매 관리 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("1. 중고차 매매 현황 보기");
		System.out.println("2. 중고차 매매 랜덤 자료 추가");
		System.out.println("3. 중고차 매매 수동 자료 추가");
		System.out.println("4. 프로그램 종료");
		System.out.println("-----------------------");		
		System.out.print("메인메뉴를 선택하세요. :");
		menu = sc.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("###숫자 정보를 다시 입력하세요.");
		}
		return menu;
	}
}
