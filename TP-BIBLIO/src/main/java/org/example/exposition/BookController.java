package org.example.exposition;

import java.util.ArrayList;
import java.util.List;


import org.example.application.IBookService;
import org.example.domaine.Book;
import org.example.dto.BookDetailDto;
import org.example.dto.BookDto;
import org.example.exposition.converter.BookDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
	
	@Autowired
	IBookService service;
	
	@GetMapping("/findAll")
	public List<BookDto> getBookAll() {
		
		//return service.findAll()
		//		.stream()
		//		.map(book ->BookDtoConverter.convertToDto(book))
		//		.collect(Collectors.toList());
		
		List<Book> books=service.findAll();
		List<BookDto> dtos=new ArrayList<>();
		for(Book b:books) {
			dtos.add(BookDtoConverter.convertToDto(b));
		}
		return dtos;
	}
	
	@GetMapping("/findById/{id}")
	public BookDetailDto findById(@PathVariable("id") long id) {
		
		Book bookEntity=service.findById(id);
		BookDetailDto dto=BookDtoConverter.convertEntityToDetailDto(bookEntity);
		
		return dto;
		
	}
	

}
