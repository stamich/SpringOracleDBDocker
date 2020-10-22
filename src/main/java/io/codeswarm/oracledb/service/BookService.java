package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> findAll();
//    Book findBookByAuthor(String author);
//    Book findBookByTitle(String title);
//    Book findBookByIsbn(String isbn);
//    void deleteByAuthor(String author);
}
