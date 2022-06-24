package com.personalWebsite.ZaslavskijWebsite.entity;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceDto {
    private Long id;
    private Long skillId;
    private String course;
    private String project;
}
