package com.java.main;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.java.dto.BookDTO;
import com.java.factory.BookCategoryFactory;
import com.java.service.BookLibrary;

public class BookMain {
	public static void main(String[] args) {

		System.out.println("Please enter a book category to get details");

		Scanner scanner = new Scanner(System.in);
		String categoryToBeSearched = scanner.next();
		BookDTO bookDto = new BookDTO();
		bookDto.setBookCategory(categoryToBeSearched);

		BookLibrary bookLibrary = BookCategoryFactory.getBookCategory(categoryToBeSearched);
		Optional<BookLibrary> optional = Optional.ofNullable(bookLibrary);
		if (optional.isPresent()) {
			List<BookDTO> listOfBooks = bookLibrary.searchByCategoryList(bookDto);
			listOfBooks.stream().forEach(System.out::println);
			System.out.println("Please enter a book id to get details");
			int bbokIdToDisplay = scanner.nextInt();
			bookDto.setBookId(bbokIdToDisplay);
			listOfBooks.stream().filter(n -> n.getBookId() == bookDto.getBookId()).forEach(System.out::println);

		} else
			System.out.println("This category does not exist");

		scanner.close();
	}
}
