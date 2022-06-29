package com.personalWebsite.ZaslavskijWebsite.Dto;

import lombok.*;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class OnlySkillDto {

    private Long id;
    private String name;
    private String level;
    private String practise;

}