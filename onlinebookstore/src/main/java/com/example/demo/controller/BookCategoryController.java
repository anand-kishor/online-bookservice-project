package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookCategory;
import com.example.demo.service.BookCategoryService;
@RestController
@RequestMapping("/bookcategory")
public class BookCategoryController {
	@Autowired
	private BookCategoryService service;

	@PostMapping("/category")
	public BookCategory saveBookCategory(@RequestBody BookCategory bookCategory)
	{
		return service.saveBookCategory(bookCategory);
	}
}
