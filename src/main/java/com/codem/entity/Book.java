package com.codem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String bname;

//    @OneToOne
//    private Author author = new Author();
//
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
//    private List<Author> authors = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Borrower> borrowers = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> authors = new ArrayList<>();


}
