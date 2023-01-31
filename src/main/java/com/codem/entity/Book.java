package com.codem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Enter the book name!")
    @NotEmpty(message = "Enter the book name!")
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
