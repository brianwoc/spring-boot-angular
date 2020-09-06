package com.example.springbootangular.model;

import javax.persistence.*;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private String name;

    public State() {
    }

    public State(Country country, String name) {
        this.country = country;
        this.name = name;
    }
}
