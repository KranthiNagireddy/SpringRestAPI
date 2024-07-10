package com.example.demo.model;

public class Book {
	private String BookName;
	
	private int BookId;
	private String BookAutor;
	private int BookPrice;
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookAutor() {
		return BookAutor;
	}
	public void setBookAutor(String bookAutor) {
		BookAutor = bookAutor;
	}
	public int getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	public Book(String bookName, int bookId, String bookAutor, int bookPrice) {
		super();
		BookName = bookName;
		BookId = bookId;
		BookAutor = bookAutor;
		BookPrice = bookPrice;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [BookName=" + BookName + ", BookId=" + BookId + ", BookAutor=" + BookAutor + ", BookPrice="
				+ BookPrice + "]";
	}
	
}
