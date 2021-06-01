package com.jung.carCenter.view;

import java.util.Scanner;

import com.jung.carCenter.util.Admin;

public class Menu {

	public static final int MAIN_MENU_ADD = 1;
	public static final int MAIN_MENU_DEL = 2;
	public static final int MAIN_MENU_VIEW = 3;
	public static final int MAIN_MENU_ADMIN = 4;
	public static final int MAIN_MENU_EXIT = 5;

	public static final int SUB_MENU_RANDOM = 1;
	public static final int SUB_MENU_ADD = 2;
	public static final int SUB_MENU_EXIT = 3;

	public static final int ADM_MENU_FIX = 1;
	public static final int ADM_MENU_SALES = 2;
	public static final int ADM_MENU_EXIT = 3;
	Scanner sc = new Scanner(System.in);

	public int mainMenu() {

		System.out.println("-------------------");
		System.out.println("카센터 관리 프로그램 v1.0");
		System.out.println("-------------------");
		System.out.println("1. 고객정보등록");
		System.out.println("2. 고객정보삭제");
		System.out.println("3. 고객정보조회");
		System.out.println("4. 관리자 모드");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("메인 메뉴 선택 : ");
		return sc.nextInt();
	}

	public int addSubMenu() {
		System.out.println("-------------------");
		System.out.println("1. 고객정보 자동 등록");
		System.out.println("2. 고객정보 수동 등록");
		System.out.println("3. 메인 메뉴 이동");
		System.out.println("-------------------");
		System.out.println("메뉴 선택 : ");
		return sc.nextInt();
	}

	public String[] loginManual() {
		System.out.println("-------------");
		System.out.println("관리자 모드 로그인");
		System.out.println("-------------");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PASSWORD : ");
		String password = sc.next();
		String[] info = {id, password};
		return info;
	}

	public int adminMenu() {
		System.out.println(" -------------");
		System.out.println("|   관리자 모드  |");
		System.out.println(" -------------");
		System.out.println("1. 차량 수리 내역");
		System.out.println("2. 일일 매출 합계");
		System.out.println("3. 메인 메뉴 이동");
		return sc.nextInt();
	}

}
