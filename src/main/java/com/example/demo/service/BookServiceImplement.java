package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.BookService;
@Service
public class BookServiceImplement implements BookService {
	static List<Book> ListOfBooks;//global variable
	public BookServiceImplement() {
		GetBookList();  
		System.out.println("constructor is called");
	}
	
	private List<Book> GetBookList() {
		Book B1=new Book("Java",100,"Nalla Sivam",1000);
		Book B2=new Book("Wings of fire",102,"Adil",500);
		Book B3=new Book("One indian Girl",101,"Chethan Bhagath",2000);
		Book B4=new Book("Java Training",103,"Nalla Sivam",100);
		
	    ListOfBooks =new ArrayList<Book>( Arrays.asList(B1,B2,B3,B4));
		return ListOfBooks;
	}
	
	@Override
	public Book GetBookById(int BookId) {
		Book BookById =ListOfBooks.stream().filter(B->B.getBookId()==BookId).findAny().orElse(new Book());
		return BookById;
	}

	@Override
	public List<Book> GetAllBooksByAuthor(String bs) {
		
		List<Book> BookByAuthor =ListOfBooks.stream().filter(B->B.getBookAutor().equals(bs)).collect(Collectors.toList());
		return BookByAuthor;
	}
	@Override
	public boolean AddBook(Book b1) {
		return ListOfBooks.add(b1);
		//return GetBookList().stream().toList();
	}
	@Override
	public List<Book> UpdateBookData(Book b2) {
		if (ListOfBooks.contains(b2.getBookId())) {
			DeleteBook(b2.getBookId());
			AddBook(b2);
		}
		return ListOfBooks.stream().toList();
	}
	@Override
	public boolean DeleteBook(int BookId) {
		Book B1 =ListOfBooks.stream().filter(B->B.getBookId()==BookId).findAny().orElse(new Book());
		System.out.println(B1);
		return ListOfBooks.remove(B1);
		//return GetBookList().stream().toList();
	
	}

}
