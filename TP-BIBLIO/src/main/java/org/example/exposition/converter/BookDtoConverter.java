package org.example.exposition.converter;

import java.util.ArrayList;

import org.example.domaine.Book;
import org.example.dto.AuthorDto;
import org.example.dto.BookDetailDto;
import org.example.dto.BookDto;
import org.example.domaine.Author;
import java.util.*;

public class BookDtoConverter {
	
	public static Book convertToEntity(BookDto dto) {
		Book b=new Book();
		b.setPublicationDate(dto.getDateParution());
		b.setTitle(dto.getTitle());
		
		return b;
	}
	
	public static BookDto convertToDto(Book book) {
		BookDto b=new BookDto();
		b.setDateParution(book.getPublicationDate());
		b.setTitle(book.getTitle());
		
		return b;
	}
	
	public static Book convertDetailToEntity(BookDetailDto dto) {
		Book b=new Book();
		b.setPublicationDate(dto.getDateParution());
		b.setTitle(dto.getTitle());
		b.setDescription(dto.getDescription());
		
		List<Author> authorsEntity=new ArrayList<>();
		for(AuthorDto a:dto.getAuthors()) {
			Author author=new Author();
			author.setName(a.getName());
			authorsEntity.add(author);
		}
		b.setAuthors(authorsEntity);
		
		return b;
	}
	
	public static BookDetailDto convertEntityToDetailDto(Book entity) {
		
		BookDetailDto dto=new BookDetailDto();
		
		List<AuthorDto> authorsDto=new ArrayList<>();
		
		List<BookDto> bookDtos=new ArrayList<>();
		for(Author author:entity.getAuthors()) {
			AuthorDto aDto=new AuthorDto();
			aDto.setName(author.getName());
			for(Book b:author.getBooks()) {
				bookDtos.add(convertToDto(b));
			}
			aDto.setBooks(bookDtos);
			authorsDto.add(aDto);
		}
		
		dto.setTitle(entity.getTitle());
		dto.setDateParution(entity.getPublicationDate());
		dto.setDescription(entity.getDescription());
		dto.setAuthors(authorsDto);
		return dto;
		
	}

}
