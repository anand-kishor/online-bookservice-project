package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.BookCategory;
import com.example.demo.repository.BookCategoryRepository;
import com.example.demo.service.BookService;

public abstract class BookCategoryServiceImpl implements BookService{

	@Autowired
	private BookCategoryRepository bookCategoryRepo;
	public BookCategory saveBookCategory(BookCategory bookCategory) {
		// TODO Auto-generated method stub
		return bookCategoryRepo.save(bookCategory);
	}	

}
