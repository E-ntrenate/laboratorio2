package com.Ingsoft2.laboratorio2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(nullable = false, length = 10)
    private String username;
    @Column(nullable = false, length = 256)
    private String password;
    @Column(nullable = false, length = 100)
    private String names;
    @Column(nullable = false, length = 100)
    private String surnames;

    @OneToMany(mappedBy = "user")
    Collection<UserRole> roles;
}
