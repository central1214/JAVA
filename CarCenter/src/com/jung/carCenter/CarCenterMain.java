package com.jung.carCenter;

import java.util.Scanner;

import com.jung.carCenter.controller.CarController;
import com.jung.carCenter.model.CarModify;
import com.jung.carCenter.util.Admin;
import com.jung.carCenter.view.Menu;

public class CarCenterMain {
	public static void main(String[] args) {

		Menu m = new Menu();
		CarController cCon = new CarController();
		Scanner sc = new Scanner(System.in);
		CarModify cMo = new CarModify(cCon);

		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				System.out.println("고객정보 등록");
//				boolean bool = true;//플래그 변수는 사용 안하는 편이 좋다~
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_MENU_RANDOM) {
						System.out.println("고객정보 자동 등록");
						cCon.addRanCust();

					} else if (menu == Menu.SUB_MENU_ADD) {
						System.out.println("고객정보 수동 등록");
						cCon.addCust();
					} else if (menu == Menu.SUB_MENU_EXIT) {
						System.out.println("메인 메뉴 이동");
						break;
					}
				}
				break;

			case Menu.MAIN_MENU_DEL:
				System.out.println("고객정보 삭제");
				break;
			case Menu.MAIN_MENU_VIEW:
				System.out.println("고객정보 조회");
				cCon.viewCustData();
				break;
			case Menu.MAIN_MENU_ADMIN:

				String info[] = m.loginManual();
				if (info[0].equals(Admin.ADMIN_ID) && info[1].equals(Admin.ADMIN_PASSWD)) {
					System.out.println("\n###관리자 모드 접속###\n");
					while (true) {
						int menu = m.adminMenu();
						if (menu == Menu.ADM_MENU_FIX) {
							System.out.println("수리차량 대수 : " + cMo.fixNum() + "대");							
						} else if (menu == Menu.ADM_MENU_SALES) {
							System.out.print("일 매출 : ");
							System.out.println(cMo.salesSum());
						} else if (menu == Menu.ADM_MENU_EXIT) {
							System.out.println("메인 메뉴로 이동");
							break;
						}
					}

				} else {
					System.out.println("잘못된 정보입니다.");
				}
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("###프로그램 종료###");
				System.exit(0);
				break;

			}

		}

	}

}
