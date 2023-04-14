package org.example.domaine;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<Book> books;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Adresse ad;



    public Author(String name, List<Book> books,Adresse ad) {
        this.name = name;
        this.books = books;
        this.ad=ad;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

	public Adresse getAd() {
		return ad;
	}

	public void setAd(Adresse ad) {
		this.ad = ad;
	}
    
    
}
