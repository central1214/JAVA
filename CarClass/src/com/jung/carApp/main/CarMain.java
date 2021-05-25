package com.jung.carApp.main;

import java.util.ArrayList;

import com.jung.carApp.car.util.RandPick;
import com.jung.carApp.model.Car;
import com.jung.carApp.model.Customer;

public class CarMain {

	public static void main(String[] args) {
		
		RandPick r = new RandPick();
		Customer[] customers = new Customer[10];
		// 제네릭 + 컬렉션 클래스
		ArrayList<Customer> arrList = 
				new ArrayList<Customer>();
		for (int i = 0; i < customers.length; i++) {
			System.out.println("--------------------");
			customers[i] =
					new Customer(
							r.pName(),
							r.pPhone(),
							r.pAddr(),
							new Car(
									r.pModel(),
									r.pColor(),
									r.pAge(),
									r.pMaker()));			
			customers[i].custmInfo();
			arrList.add(customers[i]);
		}
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("#################");
			System.out.println(" ArrayList 고객정보");
			System.out.println("#################");
			arrList.get(i).custmInfo();
		}
		
	}

}
