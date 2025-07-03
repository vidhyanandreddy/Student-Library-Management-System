package com.example.student_library_management_system.converter;

import com.example.student_library_management_system.model.Book;
import com.example.student_library_management_system.requestdto.BookRequestDto;
import com.example.student_library_management_system.responsedto.BookResponseDto;

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
    public static BookResponseDto entityToDto(Book book) {
        BookResponseDto dto = new BookResponseDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setPublisherName(book.getPublisherName());
        dto.setPublishedDate(book.getPublishedDate());
        dto.setPages(book.getPages());
        dto.setPrice(book.getPrice());
        dto.setAvailability(book.isAvailability());
        dto.setRackNo(book.getRackNo());
        dto.setCategory(book.getCategory().toString());

        if (book.getAuthor() != null) {
            dto.setAuthorName(book.getAuthor().getName());
        } else {
            dto.setAuthorName("Unknown");
        }

        return dto;
    }
}
