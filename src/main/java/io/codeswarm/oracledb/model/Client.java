package io.codeswarm.oracledb.model;

import lombok.Data;
import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "store.client")
@Data
public class Client extends AbstractPerson<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean active;

    @ElementCollection
    @SortNatural
    @JoinTable(name = "store_client_type")
    @Enumerated(EnumType.STRING)
    @Column(name = "type", length = 25, nullable = false)
    private Set<ClientType> clientTypes = new TreeSet<>();

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    private Set<Order> orders = new HashSet<>();
}
