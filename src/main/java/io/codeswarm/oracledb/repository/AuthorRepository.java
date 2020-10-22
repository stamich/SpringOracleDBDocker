package io.codeswarm.oracledb.repository;

import io.codeswarm.oracledb.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findAll();
    List<Author> findAllByLastName(String lastName);
    Author findOneById(Long id);
    void deleteAuthorById(Long id);
}
