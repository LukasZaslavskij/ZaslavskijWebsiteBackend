package com.personalWebsite.ZaslavskijWebsite.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="skills")
public class Skill {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column( nullable = false)
    private String name;
    private String level;
    private String practise;

    @OneToMany(targetEntity = Experience.class, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id")
    private List<Experience> experiences;



}
