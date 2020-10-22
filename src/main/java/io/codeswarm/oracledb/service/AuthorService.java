package io.codeswarm.oracledb.service;

import io.codeswarm.oracledb.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    List<Author> findAllByLastName(String lastName);
    Author findOneById(Long id);
    void create(Author author);
    void update(Author author);
    void deleteAuthorById(Long id);
    boolean isAuthorEmailUnique(Long id, String email);
}
