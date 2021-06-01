package com.jung.carCenter.controller;

import java.util.ArrayList;
import java.util.Scanner;
import com.jung.carCenter.model.Car;
import com.jung.carCenter.model.CarModify;
import com.jung.carCenter.model.Customer;
import com.jung.carCenter.util.CommUtil;
import com.jung.carCenter.util.RandomAdd;
import com.jung.carCenter.view.Menu;

public class CarController {

	Scanner sc = new Scanner(System.in);
	ArrayList<Customer> custList = new ArrayList<Customer>();
	CommUtil dc = new CommUtil();
	Menu m = new Menu();
	


	public void addRanCust() {

		System.out.print("몇명을 등록하시겠습니까? :");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			RandomAdd r = new RandomAdd();
			custList.add(new Customer(r.getName(), r.getTel(), r.getmCard(), r.getBirth(), r.getEmail(),
					new Car(r.getModel(), r.getAge()),
					new CarModify(r.getCause(), r.getDateIn(), r.getDateOut(), r.getPrice(), r.getFix())));
		}
	}

	public void addCust() {
		System.out.print("고객이름 : ");
		String name = sc.next();
		System.out.print("전화번호 : ");
		String tel = sc.next();
		System.out.print("멤버쉽 유무[true/false] :");
		boolean mCard = sc.nextBoolean();
		System.out.print("생일 : ");
		String birth = sc.next();
		System.out.print("E-mail : ");
		String eMail = sc.next();
		System.out.print("차종 :");
		String model = sc.next();
		System.out.print("연식 :");
		int age = sc.nextInt();
		System.out.print("원인 : ");
		String cause = sc.next();
		System.out.print("입고 : ");
		String dateIn = sc.next();
		System.out.print("출고 : ");
		String dateOut = sc.next();
		System.out.print("비용 : ");
		int price = sc.nextInt();
		System.out.println("수리유무 : ");
		boolean fix = sc.nextBoolean();

		custList.add(new Customer(name, tel, mCard, birth, eMail, new Car(model, age),
				new CarModify(cause, dateIn, dateOut, price, fix)));
	}

	public void viewCustData() {
		for (int i = 0; i < custList.size(); i++) {
			System.out.println(custList.get(i).toString());
		}
	}

	public ArrayList<Customer> getCustList() {
		return custList;
	}

	public void setCustList(ArrayList<Customer> custList) {
		this.custList = custList;
	}

	public void doAddWork() {
		while (true) {
			int menu = m.addSubMenu();
			if (menu == Menu.SUB_MENU_RANDOM) {
				System.out.println("고객정보 자동 등록");
				addRanCust();

			} else if (menu == Menu.SUB_MENU_ADD) {
				System.out.println("고객정보 수동 등록");
				addCust();
			} else if (menu == Menu.SUB_MENU_EXIT) {
				System.out.println("메인 메뉴 이동");
				break;
			}

		}

	}
	
}
