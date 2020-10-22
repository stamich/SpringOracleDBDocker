package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Author;
import io.codeswarm.oracledb.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    List<Book> findBooksByAuthor(Author author);
    Book findBookByTitle(String title);
    Book findBookByIsbn(String isbn);
    void create(Book book);
    void update(Book book);
    void deleteBookByIsbn(String isbn);
    boolean isBookIsbnUnique(Long id, String isbn);
}
