package com.travis.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String username;

    private String pwd;
}
