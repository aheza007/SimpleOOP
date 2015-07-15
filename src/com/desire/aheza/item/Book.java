package com.desire.aheza.item;

public class Book extends Goods {

	boolean isOld;
	boolean isNew = true;

	public Book(String description, int quantinty, double price) {
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
