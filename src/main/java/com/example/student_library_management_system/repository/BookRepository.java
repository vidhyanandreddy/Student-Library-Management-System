package com.example.student_library_management_system.repository;

import com.example.student_library_management_system.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByAvailabilityTrue();

    List<Book> findByTitleContainingIgnoreCase(String title);
}
