package com.personalWebsite.ZaslavskijWebsite.service;

import com.personalWebsite.ZaslavskijWebsite.DAO.ExperienceRepository;
import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private ExperienceRepository experienceRepository;



    public void updateSkill(Skill skill,Long id){
        Skill mySkill = skillRepository.findSkillById(id);
        mySkill.setName(skill.getName());
        mySkill.setLevel(skill.getLevel());
        mySkill.setPractise(skill.getPractise());

        skillRepository.save(mySkill);
    }

}
