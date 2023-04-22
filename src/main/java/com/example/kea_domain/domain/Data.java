package com.example.kea_domain.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Data {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

    private String email;
}
