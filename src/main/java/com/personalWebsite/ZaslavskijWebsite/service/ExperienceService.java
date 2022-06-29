package com.personalWebsite.ZaslavskijWebsite.service;

import com.personalWebsite.ZaslavskijWebsite.DAO.ExperienceRepository;
import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {
    @Autowired
    private ExperienceRepository experienceRepository;
    @Autowired
    private SkillRepository skillRepository;

    public void updateExperience(Experience experience, Long id){
        Experience myExperience = experienceRepository.findExperience(id);
        myExperience.setCourse(experience.getCourse());
        myExperience.setProject(experience.getProject());

        experienceRepository.save(myExperience);
    }

    public void addExperience(Experience experience,Long id){
        List<Experience> experienceList=experienceRepository.findExperiencesOfSkill(id);
        experienceList.add(experience);

        Skill mySkill=skillRepository.findSkillById(id);
        mySkill.getExperiences().clear();
        mySkill.getExperiences().addAll(experienceList);
        skillRepository.save(mySkill);
    }

}
