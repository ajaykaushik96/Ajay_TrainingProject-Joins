package com.example.demo.BookService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Book.Book;
import com.example.demo.BookRepository.BookRepository;

@Service
public class BookService {
	
	
	@Autowired
	private BookRepository bookrepo;
	
	public List<Book> GetAllBooks() 
	{
		return bookrepo.findAll();
	}

	public Optional<Book> GetBook(Long Book_id)
	{
		return bookrepo.findById(Book_id);
		
		
	}
	
	 public Book AddBook(Book book)
	 {
		 
		 return bookrepo.save(book);
	 }
	 
	 
	 public Optional<Book> UpdateBook (@PathVariable Long Book_id,@RequestBody Book book)
	 {
		 return bookrepo.findById(Book_id);
	 }
	 
	 public Optional<Book> DeleteBook (Long Book_id)
	 {
		 return bookrepo.findById(Book_id);
	 }
	 
	 
	 
	 
	 
	 
}
