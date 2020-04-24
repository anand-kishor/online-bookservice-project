package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BookCategory;

@Service
public interface BookCategoryService {
	public BookCategory saveBookCategory(BookCategory bookCategory);

}
