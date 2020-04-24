package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@Component
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepo;


	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	

}
