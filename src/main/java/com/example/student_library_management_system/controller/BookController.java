package com.example.student_library_management_system.controller;

import com.example.student_library_management_system.requestdto.BookRequestDto;
import com.example.student_library_management_system.responsedto.BookResponseDto;
import com.example.student_library_management_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/apis")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public String saveBook(@RequestBody BookRequestDto bookRequestDto){
        String response = bookService.saveBook(bookRequestDto);
        return response;
    }

    // 2. Get a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDto> getBookById(@PathVariable int id) {
        BookResponseDto responseDto = bookService.getBookById(id);
        return ResponseEntity.ok(responseDto);
    }

    // 3. Search books by title
    @GetMapping("/search")
    public ResponseEntity<List<BookResponseDto>> searchBooksByTitle(@RequestParam String title) {
        List<BookResponseDto> responseDtos = bookService.searchBooksByTitle(title);
        return ResponseEntity.ok(responseDtos);
    }

    // 4. Get all available books
    @GetMapping("/available")
    public ResponseEntity<List<BookResponseDto>> getAvailableBooks() {
        List<BookResponseDto> responseDtos = bookService.getAvailableBooks();
        return ResponseEntity.ok(responseDtos);
    }
}
