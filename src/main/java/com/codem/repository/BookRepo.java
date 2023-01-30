package com.codem.repository;

import com.codem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepo extends JpaRepository<Book, Integer> {
//    List<Book> findByBname(@Param("bname") String bname);
}
