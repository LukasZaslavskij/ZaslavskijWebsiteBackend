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