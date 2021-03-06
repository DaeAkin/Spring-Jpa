package com.donghyeon.springJpa.global.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @Embedded
    private Address address;

//    @ManyToOne
//    @JoinColumn(name = "team_id")
//    Team team;
//
//    public void setTeam(Team team) {
//        this.team = team;
//        team.getHumans().add(this);
//    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
