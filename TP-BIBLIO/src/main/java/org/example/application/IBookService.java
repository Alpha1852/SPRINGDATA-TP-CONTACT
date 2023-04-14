package org.example.application;

import java.util.List;

import org.example.domaine.Book;

public interface IBookService {
	
	Book findById(Long id);
	
	List<Book>findAll();

}
