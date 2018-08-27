package com.java.serviceImpl;

import java.util.List;

import com.java.dao.BookDAO;
import com.java.dto.BookDTO;
import com.java.service.BookLibrary;

public class HistoryBook implements BookLibrary {
	public HistoryBook() {

	}

	@Override
	public List<BookDTO> searchByCategoryList(BookDTO book) {
		BookDAO bd = new BookDAO();
		List<BookDTO> bookList = bd.getBookList(book);
		return bookList;
	}

}
