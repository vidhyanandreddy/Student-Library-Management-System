package com.example.student_library_management_system.service;

import com.example.student_library_management_system.converter.BookConverter;
import com.example.student_library_management_system.model.Author;
import com.example.student_library_management_system.model.Book;
import com.example.student_library_management_system.model.Card;
import com.example.student_library_management_system.repository.AuthorRepository;
import com.example.student_library_management_system.repository.BookRepository;
import com.example.student_library_management_system.repository.CardRepository;
import com.example.student_library_management_system.requestdto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private CardRepository cardRepository;

    public String saveBook(BookRequestDto bookRequestDto){
        Book book=BookConverter.convertBookRequestDtoIntoBook(bookRequestDto);

        // authorId  --> FK
        // cardId    --> FK

        // using authorId fetch the complete object  of author from authorRepository

        Author author=authorRepository.findById(bookRequestDto.getAuthorId()).get();
        if(author==null){
            book.setAuthor(null);
        }else{
            book.setAuthor(author);
        }

        // using cardid fetch the complete object of card from cardRepository

        Card card=cardRepository.findById(bookRequestDto.getCardId()).get();
        if(card==null){
            book.setCard(null);
        }else{
            book.setCard(card);
        }
        bookRepository.save(book);
        return "Book Saved Successfully";
    }
}
