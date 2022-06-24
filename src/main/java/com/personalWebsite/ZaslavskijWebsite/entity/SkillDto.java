package com.personalWebsite.ZaslavskijWebsite.entity;

import lombok.*;

import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkillDto {

    private Long id;
    private String name;
    private String practise;
    private List<ExperienceDto> experiences;
}
