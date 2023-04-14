package org.example.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class AuthorDto {
	
	private String name;
	
	@JsonBackReference
	private List<BookDto> books;
	
	public AuthorDto(String name, List<BookDto> dto) {
		this.name = name;
		this.books=dto;
	}
	

	public AuthorDto() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}


	public List<BookDto> getBooks() {
		return books;
	}


	public void setBooks(List<BookDto> books) {
		this.books = books;
	}
	
	

	
	
	

}
