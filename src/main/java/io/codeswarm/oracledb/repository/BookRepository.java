package io.codeswarm.oracledb.repository;

import io.codeswarm.oracledb.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();
//    Book findBookByAuthor(String author);
//    Book findBookByTitle(String title);
//    Book findBookByIsbn(String isbn);
//    void deleteByAuthor(String author);
}
