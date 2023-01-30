package com.codem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
    private String name;
    private String startDate;
    private String endDate;

    @ManyToMany(mappedBy = "borrowers")
    private List<Book> books = new ArrayList<>();
}
