package com.zzzexample.zzz.controller;

import com.zzzexample.zzz.entyties.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "rest")
public class SimpleBookRestController {

	@GetMapping(value = "/{id}", produces = "application/json")
	public Book getBook(@PathVariable int id) {
		System.out.println("\ngetBook " + id + ";\n");
		return findBookById(id);
	}

	private Book findBookById() {
		return findBookById(0);
	}

	private Book findBookById(int id) {
		System.out.println("\nfindBookById " + id + ";\n");
		return new Book(id);
	}

}
