package com.desire.aheza.item;

import com.desire.aheza.ItemException.ItemException;

/**
 * Define properties of Item
 * @author desire.aheza
 *
 */
public interface Item {
	public static final int TYPE_ITEM_BOOK=1;
	public static final int TYPE_ITEM_PEN=2;	
	
	double getItemPriceWithTax() throws ItemException ;
	double getItemPrice();
	double getItemTax();
	int getItemQuantinty();
	String getItemDescription();	
	void setIsOld(boolean isOld);
	
}
