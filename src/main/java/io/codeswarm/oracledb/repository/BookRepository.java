package io.codeswarm.oracledb.repository;

import io.codeswarm.oracledb.model.Author;
import io.codeswarm.oracledb.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();
    List<Book> findBooksByAuthor(Author author);
    Book findBookByTitle(String title);
    Book findBookByIsbn(String isbn);
    void deleteBookByIsbn(String isbn);
}
