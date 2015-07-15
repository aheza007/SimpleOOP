package com.desire.aheza.tax;

public class Tax {
	private static final double BASIC_SALES_TAX = 0.10; // 10%
	private static final double ROUND_OFF = 0.05;
	private static final double OLD_ITEM_EXEMPTION=0.5;
	private double salesTax = 0.0;
	
	public void calculate(boolean isNew, double price) {
		if(isNew)
			salesTax = roundOffTax(BASIC_SALES_TAX * price);
		else
			salesTax = roundOffTax(BASIC_SALES_TAX *OLD_ITEM_EXEMPTION* price);
	}

	public double getTotalItemTax() {
		return this.salesTax;
	}

	private double roundOffTax(double tax) {
		 return Math.round(tax/ROUND_OFF)*ROUND_OFF;
	}
}
