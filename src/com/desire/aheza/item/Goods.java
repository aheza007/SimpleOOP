package com.desire.aheza.item;

import com.desire.aheza.ItemException.ItemException;
import com.desire.aheza.tax.Tax;

/**
 * As an abstract parent class Goods will promote code reuse for all the
 * subclasses(i.e. BOOK, PEN and others that extends it)
 */
public abstract class Goods implements Item {

	// lets define attributes
	private String description;
	private int quantinty;
	private double price;
	private Tax tax = new Tax();

	public Goods(String description, int quantinty, double price) {
		this.description = description;
		this.quantinty = quantinty;
		this.price = price;
	}

	protected abstract boolean isNew();

	/*
	 * get items taxes
	 * 
	 * @see com.desire.aheza.item.Item#getItemTax()
	 */
	public double getItemTax() {
		tax.calculate(isNew(), price);
		return this.tax.getTotalItemTax() * quantinty;
	}
	
	/*
	 * get item price + taxes
	 * @see com.desire.aheza.item.Item#getItemPriceWithTax()
	 */

	public double getItemPriceWithTax() throws ItemException {
		if (tax == null) {
			throw new ItemException("Tax should be calculated first:");
		}
		return (tax.getTotalItemTax() + price) * quantinty;
	}

	// getters and setters go here for attributes like description
	public double getItemPrice() {
		return this.price;
	}

	public int getItemQuantinty() {
		return this.quantinty;
	}

	public String getItemDescription() {
		return description;
	}

	public String toString() {
		return quantinty + " " + description + " : ";
	}
}
