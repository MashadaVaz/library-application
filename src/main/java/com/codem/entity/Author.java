package com.codem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
public class Author {

    @Id
    @GeneratedValue
    private Integer aid;

    @NotNull(message = "Enter the author name!")
    @NotEmpty(message = "Enter the author name!")
    private String aName;

    @Email(message = "Enter a valid email")
    private String aEmail;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<>();
}
