package com.codem.repository;

import com.codem.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepo extends JpaRepository<Borrower, Integer> {
}
