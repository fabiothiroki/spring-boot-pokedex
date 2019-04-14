package com.example.pokemon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    private int id;

    @Column
    private String name;

}
