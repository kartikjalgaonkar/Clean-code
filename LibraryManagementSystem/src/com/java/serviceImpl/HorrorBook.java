package com.java.serviceImpl;

import java.util.List;

import com.java.dao.BookDAO;
import com.java.dto.BookDTO;
import com.java.service.BookLibrary;

public class HorrorBook implements BookLibrary {
	public HorrorBook() {

	}

	@Override
	public List<BookDTO> searchByCategoryList(BookDTO book) {
		BookDAO bd = new BookDAO();
		List<BookDTO> bList = bd.getBookList(book);
		return bList;
	}

}
