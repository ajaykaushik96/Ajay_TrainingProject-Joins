package com.example.demo.BookController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Book.Book;
import com.example.demo.BookService.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/books")
	public List<Book> GetAllBooks()
	{
		return bookservice.GetAllBooks(); 
	}
	
	@GetMapping("/books/{Book_id}")
	public Optional<Book> GetBook(@PathVariable Long Book_id)
	{
		return bookservice.GetBook(Book_id);
	}
	
	@PostMapping("/books")
    public Book AddBook(@RequestBody Book book)
    {
    	return bookservice.AddBook(book);
    }
	
	@PutMapping("/books/{id}")
	public Optional<Book> UpdateBook(@RequestBody Book book , @PathVariable Long Book_id )
	{
		return bookservice.UpdateBook(Book_id, book);
	}
	
	@DeleteMapping("/books/{Book_id}")
	public Optional<Book> DeleteBook (@PathVariable Long Book_id)
	{
		return bookservice.DeleteBook(Book_id);
	}
	
	
	
	
	
	
	

}