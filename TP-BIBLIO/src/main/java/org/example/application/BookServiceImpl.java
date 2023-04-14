package org.example.application;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.example.domaine.Book;
import org.example.infrastructure.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	IBookRepository repo;
	
	@Override
	public Book findById(Long id) {
		Optional<Book> optional=repo.findById(id);
		if(!optional.isPresent()) {
			throw new EntityNotFoundException();
		}
		return optional.get();
	}

	@Override
	public List<Book> findAll() {
		
		return repo.findAll();
	}

}
