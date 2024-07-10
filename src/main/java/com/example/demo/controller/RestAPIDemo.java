package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.model.BookService;

@RestController
public class RestAPIDemo {
	@Autowired
	BookService Bs;
	
	@PostMapping("/welcome1")//http://localhost:8080/welcome2
	public String welcome1(){
		return "Hello welcome to post method";
	}
	@GetMapping("/welcome2") //http://localhost:8080/welcome2
	public String welcome2(){
		return "Hello welcome Get method";
	}
	@GetMapping("/") 
	public String welcome3(){
		return "welcome to home page";
	}
	@GetMapping("/GetBookById") //request parameter must be id
	public Book GetBookId(int BookId){
		Book b1;
		b1=Bs.GetBookById(BookId);
		return b1;
	}
	@GetMapping("/GetBookByAuthorName") //request parameter must be id
	public List<Book> GetBookAuthorName(String BookAuthor){
		List<Book> b2;
		b2=Bs.GetAllBooksByAuthor(BookAuthor);
		return b2;
	}
	@PostMapping("/AddBook") //request parameter must be id
	public boolean AddBook(@RequestBody Book b1){
		//List<Book> b2;
		return Bs.AddBook(b1);
		//return b2;
	}
	@PutMapping("/UpdateBook") //request parameter must be id
	public List<Book> UpdateBook(@RequestBody Book b3){
		List<Book> b2;
		b2=Bs.UpdateBookData(b3);
		return b2;
	}
	@DeleteMapping("/DeleteBook") //request parameter must be id
	public boolean DeleteBook(int BookId){
		//List<Book> b2;
		return Bs.DeleteBook(BookId);
		//return b2;
	}
}
