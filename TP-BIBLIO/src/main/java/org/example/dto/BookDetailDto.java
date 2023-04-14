package org.example.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class BookDetailDto extends BookDto{
	
	private String description;
	
	@JsonManagedReference
	private List<AuthorDto> authors;
	
	

	public BookDetailDto() {}

	public BookDetailDto(String title, LocalDate dateParution, String description, List<AuthorDto> authors) {
		this.description = description;
		this.authors = authors;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AuthorDto> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AuthorDto> authors) {
		this.authors = authors;
	}
	
	

}
