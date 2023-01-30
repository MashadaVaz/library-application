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
public class Author {

    @Id
    @GeneratedValue
    private Integer aid;
    private String aname;
    private String aemail;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<>();
}
