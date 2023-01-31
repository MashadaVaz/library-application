package com.codem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Borrower {

    @Id
    private Integer id;

    @NotNull(message = "Enter the author's name!")
    @NotEmpty(message = "Enter the author's name!")
    private String name;
    
    private String startDate;
    private String endDate;

    @ManyToMany(mappedBy = "borrowers")
    private List<Book> books = new ArrayList<>();
}
