package com.java.factory;

import com.java.service.BookLibrary;
import com.java.serviceImpl.HistoryBook;
import com.java.serviceImpl.HorrorBook;

public class BookCategoryFactory {
	public static BookLibrary getBookCategory(String category) {
		if (category.equalsIgnoreCase("horror"))
			return new HorrorBook();
		else if (category.equalsIgnoreCase("history")) {
			return new HistoryBook();
		}
		return null;
	}

}
