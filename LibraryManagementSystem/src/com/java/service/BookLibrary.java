package com.java.service;

import java.util.List;

import com.java.dto.BookDTO;

public interface BookLibrary {

	public List<BookDTO> searchByCategoryList(BookDTO book);
}
