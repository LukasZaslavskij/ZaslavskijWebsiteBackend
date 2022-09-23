package com.personalWebsite.ZaslavskijWebsite.entity;

import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.service.SkillService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@DataJpaTest
@EnableJpaRepositories(basePackages="com.personalWebsite.ZaslavskijWebsite.DAO")
@EntityScan("packages")
class SkillTest {

    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private SkillService skillService;



    @Test
    void findByIdSkill() {

        Skill skill = new Skill(82L, "jedna", "dva", "tri",any() );
        Skill result = skillRepository.save(skill);
        assertNotNull(result);
        String resultName = skillRepository.findSkillById(1L).getName();
        assertEquals(resultName,"jedna");
    }

    @Test
    void updateSkillService() {
        Skill skill = new Skill(82L, "jedna", "dva", "tri",any() );
        Skill result = skillRepository.save(skill);
        Skill updatedSkill = new Skill(82L, "sto", "stojedna", "stodva",any() );
        skillService.updateSkill(updatedSkill,1L);
        assertEquals(result.getName(),"sto");
    }
}