package com.java.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.dto.BookDTO;

public class BookDAO {
	static ArrayList<BookDTO> bookList = new ArrayList<>();
	static {

		bookList.add(new BookDTO(1, "Chhava", "History"));
		bookList.add(new BookDTO(2, "The Alchemist", "History"));
		bookList.add(new BookDTO(6, "a walk to remember", "horror"));
		bookList.add(new BookDTO(7, "The Alchemist", "horror"));
		bookList.add(new BookDTO(8, "The Alchemist", "horror"));
		bookList.add(new BookDTO(3, "Ancient India", "History"));
		bookList.add(new BookDTO(4, "Mrityunjay", "horror"));
		bookList.add(new BookDTO(5, "IT", "horror"));
		bookList.add(new BookDTO(9, "13 reasons why", "History"));
	}

	public List<BookDTO> getBookList(BookDTO book) {
		return bookList.stream().filter(n -> n.equals(book)).collect(Collectors.toList());
	}
}
