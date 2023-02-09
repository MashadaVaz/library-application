package com.codem;

import com.codem.entity.Author;
import com.codem.entity.Book;
import com.codem.entity.Borrower;
import com.codem.repository.AuthorRepo;
import com.codem.repository.BookRepo;
import com.codem.repository.BorrowerRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class LibraryApplication {

//	@Autowired
//	private BookRepo bookRepo;
//	@Autowired
//	private AuthorRepo authorRepo;
//	@Autowired
//	private BorrowerRepo borrowerRepo;
//
//	@PostConstruct
//	public void init() {
//
////		*******************Builder********************
//
//		//Authors
//		Author a1 = Author.builder()
//				.aid(1)
//				.aName("John Green")
//				.aEmail("john@mail.com")
//				.build();
////		authorRepo.save(author);
//
//		Author a2 = Author.builder()
//				.aid(2)
//				.aName("Rick Riordan")
//				.aEmail("rick@mail.com")
//				.build();
//
////		List<Author> authors = new ArrayList<>();
////		authors.add(a1);
////		authors.add(a2);
////
////		authorRepo.saveAll(authors);
//
//		//Books
//		Book b1 = Book.builder()
//				.id(1)
//				.name("All About Python")
//				.authors(List.of(a1))
//				.build();
////		bookRepo.save(b1);
//
//		Book b2 = Book.builder()
//				.id(2)
//				.name("Percy Jackson")
//				.authors(List.of(a1, a2))
//				.build();
////		bookRepo.save(b2);
//
//		Book b3 = Book.builder()
//				.id(3)
//				.name("FullStack Java")
//				.authors(List.of(a2))
//				.build();
////		bookRepo.save(b3);
//
//		List<Book> books = new ArrayList<>();
//		books.add(b1);
//		books.add(b2);
//		books.add(b3);
//
////		bookRepo.saveAll(books);
//
//
//		//Borrowers
//		Borrower bor1 = Borrower.builder()
//				.bid(1)
//				.bName("Tim")
//				.startDate("03-01-2023")
//				.endDate("16-01-2023")
//				.build();
//
//		Borrower bor2 = Borrower.builder()
//				.bid(2)
//				.bName("George")
//				.startDate("03-02-2023")
//				.endDate("16-02-2023")
//				.build();
//
//		Borrower bor3 = Borrower.builder()
//				.bid(3)
//				.bName("Harry")
//				.startDate("03-03-2023")
//				.endDate("16-03-2023")
//				.build();
//
//		List<Borrower> borrowers = new ArrayList<>();
//		borrowers.add(bor1);
//		borrowers.add(bor2);
//		borrowers.add(bor3);
//
////		borrowerRepo.saveAll(borrowers);
//		b1.setBorrowers(List.of(bor1, bor2));
//		b2.setBorrowers((List.of(bor3)));
//
//
//
//
//
//		bookRepo.saveAll(books);
//
//
//
//
//
//		//Borrower List
//		//Creating new list with all the Book b1's borrowers
////		List<Borrower> b1Borrowers = new ArrayList<>();
////		b1Borrowers.add(bor1);
////		b1Borrowers.add(bor2);
////
////		//Creating new list with all the Book b2's borrowers
////		List<Borrower> b2Borrowers = new ArrayList<>();
////		b2Borrowers.add(bor2);
////		b2Borrowers.add(bor3);
////
////		//Book List
////		//Creating new list of the books borrowed by bor1
////		List<Book> bor1Books = new ArrayList<>();
////		bor1Books.add(b2);
////		bor1Books.add(b3);
////
////		//Creating new list of the books borrowed by bor2
////		List<Book> bor2Books = new ArrayList<>();
////		bor2Books.add(b1);
////		bor2Books.add(b3);
//
//
//
//
//
////	public void run(String... args) throws Exception {
//////		*******************GetterSetter********************
////		Author author1 = new Author();
////		author1.setAid(1);
////		author1.setAname("John Green");
////		author1.setAemail("john@gmail.com");
////		authorRepo.save(author1);
////
////		Book book1 = new Book();
////		book1.setId(1);
////		book1.setBname("Fault in our stars");
////		book1.setAuthor(author1);
////		bookRepo.save(book1);
//
////		************saveAll*******************************
////		List<Author> authorList = Stream.of(
////
////				new Author(1, "abc", "abc@mail.com"),
////				new Author(2, "xyz", "xyz@mail.com")
////		).collect(Collectors.toList());
////		authorRepo.saveAll(authorList);
////
////		List<Book> bookList = bookRepo.saveAll(Stream.of(
////				new Book(101, "ABC", authorList.get(1)),
////				new Book(102, "LMN", authorList.get(2)),
////				new Book(103, "PQR", authorList.get(1))
////		).collect(Collectors.toList()));
////		bookRepo.saveAll(bookList);
//	}

	public static void main(String[] args) {SpringApplication.run(LibraryApplication.class, args);}




}
