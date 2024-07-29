package com.graphql.bookdata;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {
	
	@Autowired
	private BookReposistory bookReposistory;
	
	
	
	@MutationMapping("createBook")
	public Book saveBook(@Argument BookInput book) {
		
		
		Book b  = new Book();
		
		b.setTitle(book.getTitle());
		b.setAuthor(book.getAuthor());
		b.setDes(book.getDes());
		b.setPage(book.getPage());
		b.setPrice(book.getPrice());
		Book save = bookReposistory.save(b);
		
		return save;
	}
	
	
	@QueryMapping("getBook")
	public Optional<Book> getBook(@Argument int id){
		
		Optional<Book> byId = bookReposistory.findById(id);
		
		return byId;
	}
	
	@QueryMapping("allBooks")
	public List<Book> getBooks(){
		
		List<Book> all = bookReposistory.findAll();
		return all;
		
	}
	

}
