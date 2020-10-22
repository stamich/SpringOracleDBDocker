package io.codeswarm.oracledb.model;

import lombok.Data;
import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Entity
@Table(name = "store.staff")
@Data
public class Staff extends AbstractPerson<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean active;

    @ElementCollection
    @SortNatural
    @JoinTable(name = "store_staff_role")
    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 25, nullable = false)
    private Set<StaffRole> staffRoles = new HashSet<>();
}
