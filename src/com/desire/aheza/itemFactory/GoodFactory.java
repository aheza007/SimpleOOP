package com.desire.aheza.itemFactory;

import com.desire.aheza.ItemException.ItemException;
import com.desire.aheza.item.Book;
import com.desire.aheza.item.Item;
import com.desire.aheza.item.Pen;

public class GoodFactory {

	public Item getItem(int itemType, String description, int qty, double price)
			throws ItemException {
		Item item = null;
		if (itemType == Item.TYPE_ITEM_PEN)
			item = new Pen(description, qty, price);
		else if (itemType == Item.TYPE_ITEM_BOOK)
			item = new Book(description, qty, price);
		else
			throw new ItemException("invalid ItemType");

		return item;
	}

}
