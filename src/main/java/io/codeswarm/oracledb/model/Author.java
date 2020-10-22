package io.codeswarm.oracledb.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "store.author")
@Data
public class Author extends AbstractPerson<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    private Set<Book> books = new HashSet<>();
}
