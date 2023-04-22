package com.example.kea_domain.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@Table(name = "datas")
@NoArgsConstructor
@Entity
public class Data {

    @Id
    @Column(name = "datas_id")
    private Long id;

    private String name;

    private int age;

    private String email;
}
