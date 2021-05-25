package com.jung.carApp.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.jung.carApp.car.util.RandPick;
import com.jung.carApp.controller.CarSellMgr;
import com.jung.carApp.model.Car;
import com.jung.carApp.model.Customer;
import com.jung.carApp.view.Menu;

public class CarMain {

	public static void main(String[] args) {
		Menu menu = new Menu();		
		CarSellMgr mgr = new CarSellMgr();
		while(true) {
			switch(menu.mainMenu()) {
			case Menu.MAIN_MENU_VIEW: 
				mgr.showSellInfo();
				break;
			case Menu.MAIN_MENU_RANDOM_INS:
				mgr.randInsData();
				break;
			case Menu.MAIN_MENU_INS:
				mgr.insData();
				break;
			case Menu.MAIN_MENU_EXIT:				
				mgr.mainExit();
				break;
			}
		}
	}

}
