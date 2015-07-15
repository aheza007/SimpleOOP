package com.desire.aheza.item;

public class Pen extends Goods {
	boolean isNew = true;
	boolean isOld;

	public Pen(String description, int quantinty, double price) {
		super(description, quantinty, price);
	}

	@Override
	protected boolean isNew() {

		return isNew;
	}

	@Override
	public void setIsOld(boolean isOld) {
		this.isOld = isOld;

	}

}
