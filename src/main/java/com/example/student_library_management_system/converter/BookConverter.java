package com.example.student_library_management_system.converter;

import com.example.student_library_management_system.model.Book;
import com.example.student_library_management_system.requestdto.BookRequestDto;

public class BookConverter {

    public static Book convertBookRequestDtoIntoBook(BookRequestDto bookRequestDto){
        Book book=new Book();

        book.setTitle(bookRequestDto.getTitle());
        book.setAvailability(bookRequestDto.isAvailability());
        book.setPrice(bookRequestDto.getPrice());
        book.setPages(bookRequestDto.getPages());
        book.setRackNo(bookRequestDto.getRackNo());
        book.setCategory(bookRequestDto.getCategory());
        book.setPublishedDate(bookRequestDto.getPublishedDate());
        book.setPublisherName(bookRequestDto.getPublisherName());

        // foreign keys should not use in converters

        return book;
    }
}
