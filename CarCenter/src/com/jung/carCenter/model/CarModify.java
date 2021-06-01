package com.jung.carCenter.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.jung.carCenter.controller.CarController;
import com.jung.carCenter.util.CommUtil;

public class CarModify {
	
	private String cause;
	private String dateIn;
	private String dateOut; 
	private boolean fix;
	private int price;
	private CarController carCon;
	CommUtil dc = new CommUtil();
	
	public CarModify(CarController carCon) {
		this.carCon = carCon;
	}
	public CarModify(String cause, String dateIn, String dateOut, int price, boolean fix) {
		super();
		this.cause = cause;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.price = price;
		this.fix = fix;
	}
	public CarModify(String cause, String dateIn, String dateOut, int price) {
		super();
		this.cause = cause;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.price = price;
	}
	
	
	public boolean isFix() {
		return fix;
	}
	public void setFix(boolean fix) {
		this.fix = fix;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	public String getDateOut() {
		return dateOut;
	}
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int fixNum() {
		int fixNum = 0;
		for(int i = 0; i < carCon.getCustList().size(); i++) {
			if(carCon.getCustList().get(i).getCarModify().isFix()) {
				fixNum++;
			};			
		}
		return fixNum;
	}
	
	public String salesSum() {
		int salesSum = 0;
		for(int i = 0; i < carCon.getCustList().size(); i++) {
			salesSum += carCon.getCustList().get(i).getCarModify().getPrice();
		}
		return dc.getKorMoney(salesSum);
	}
	
	@Override
	public String toString() {
		
		String str = "원인 : " + cause + "\n";
		str += "접수날짜 : " + dateIn + "\n";
		str += "출고 : " + dateOut + "\n";		
		str += "비용 : " + dc.getKorMoney(price) + "\n";
		str += "수리 유무 : " + fix + "\n";
		return str;
	}
	
	

}
