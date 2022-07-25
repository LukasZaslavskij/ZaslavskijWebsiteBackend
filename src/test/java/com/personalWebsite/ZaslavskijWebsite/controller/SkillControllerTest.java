package com.personalWebsite.ZaslavskijWebsite.controller;

import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;


@DataJpaTest
public class SkillControllerTest {
    @Autowired
    private SkillRepository skillRepository;

    @Test
    void findByIdSkill() {

        Skill skill = new Skill(82L, "jedna", "dva", "tri",any() );
        Skill result = skillRepository.save(skill);
        assertNotNull(result);
        String resultName = skillRepository.findSkillById(1L).getName();
        assertEquals(resultName,"jedna");
    }

//    @Test
//    public void testSaveSkill() {
//        Skill skill = new Skill();
//        skill.setId(500L);
//        skill.setName("javicka");
//        skill.setLevel("nicmoc");
//        skill.setPractise("takytak");
//
//        Mockito.when(skillController.saveSkill(skill)).thenReturn(skill);
//        assertNotNull(skill);
//        assertTrue(skillRepository.existsById(skill.getId()));
//    }
}