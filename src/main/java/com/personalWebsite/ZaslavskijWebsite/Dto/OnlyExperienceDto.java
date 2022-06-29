package com.personalWebsite.ZaslavskijWebsite.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OnlyExperienceDto {

    private Long id;
    private Long skillId;
    private String course;
    private String project;
}
