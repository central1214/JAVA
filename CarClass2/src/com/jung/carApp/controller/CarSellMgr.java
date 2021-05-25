package com.jung.carApp.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.jung.carApp.car.util.RandPick;
import com.jung.carApp.model.Car;
import com.jung.carApp.model.Customer;

public class CarSellMgr {
	Scanner sc = new Scanner(System.in);
	RandPick r = new RandPick();
	ArrayList<Customer> cuList = 
			new ArrayList<Customer>();
	
	public void showSellInfo() {
		for (Customer cu : cuList) {
			cu.custmInfo();
		}
	}
	public int dataNum() {
		int menu = 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("생성할 데이터의 갯수를 입력하세요. :");
			menu = sc.nextInt();				
		}
		catch(InputMismatchException e) {
			System.out.println("숫자 정보를 다시 입력하세요");
		}
		return menu;
		
	}
	
	public void randInsData() {		
		int num = dataNum();
		for(int i = 0; i < num; i++) {
		cuList.add(
				new Customer(
						r.pName(),
						r.pPhone(),
						r.pAddr(),
						new Car(
								r.pModel(),
								r.pColor(),
								r.pAge(),
								r.pMaker())));		
		}
	}
	
	public void insData() {
		int num = dataNum();
		for (int i = 0; i < num; i++) {
			System.out.println("이름 입력 : ");
			String name = sc.nextLine();
			System.out.println("번호 입력 : ");
			String phone = sc.next();
			System.out.println("주소 입력 : ");
			String addr = sc.next();
			System.out.println("모델 입력 : ");
			String model = sc.next();
			System.out.println("색깔 입력 : ");
			String color = sc.next();
			System.out.println("연식 입력 : ");
			int age = sc.nextInt();
			System.out.println("제조자 입력 : ");
			String maker = sc.next();
			
			cuList.add(
				new Customer(
						name,
						phone,
						addr,
						new Car(
								model,
								color,
								age,
								maker)));
		}

	}

	public void mainExit() {
		System.exit(0);
	}
}
