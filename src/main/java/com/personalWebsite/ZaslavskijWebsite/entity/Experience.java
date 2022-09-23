package com.personalWebsite.ZaslavskijWebsite.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(name="exp course")
    private String course;
    @Column(name="exp project")
    private String project;

    private Integer skill_id;

   // @ToString.Exclude
    //@EqualsAndHashCode.Exclude
    //@ManyToOne
    //private Skill skill;
}
