package com.jung.carCenter.util;

import java.text.DecimalFormat;

public class CommUtil {
	
	public String getKorMoney(int money) {
		DecimalFormat dc= new DecimalFormat("###,###,###,###");
		return "￦" + dc.format(money) + "원";
	}

}
