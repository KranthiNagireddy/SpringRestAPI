package com.example.demo.model;

import java.util.List;

public interface BookService {
	public Book GetBookById(int BookId);
	public List<Book> GetAllBooksByAuthor(String BookAutor);
	public boolean AddBook(Book b1);
	public List<Book> UpdateBookData(Book b2);
	public boolean DeleteBook(int BookId);
}
