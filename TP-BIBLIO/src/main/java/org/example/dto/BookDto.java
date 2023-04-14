package org.example.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BookDto {
	
	private String title;
	
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateParution;
	
	public BookDto(String title, LocalDate dateParution) {
		this.title = title;
		this.dateParution = dateParution;
	}
	
	public BookDto() {
	}


	public String getTitle() {
		
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDateParution() {
		return dateParution;
	}
	public void setDateParution(LocalDate dateParution) {
		this.dateParution = dateParution;
	}
	
	

}
