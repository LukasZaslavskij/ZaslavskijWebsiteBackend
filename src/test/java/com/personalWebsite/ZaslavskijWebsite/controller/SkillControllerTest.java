package com.personalWebsite.ZaslavskijWebsite.controller;

import com.personalWebsite.ZaslavskijWebsite.Controller.SkillController;
import com.personalWebsite.ZaslavskijWebsite.DAO.ExperienceRepository;
import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.Repository.skillRepositoryTest;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import com.personalWebsite.ZaslavskijWebsite.service.SkillService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;


@DataJpaTest
public class SkillControllerTest {

    private SkillRepository skillRepository;

    @Autowired
    private ExperienceRepository experienceRepository;


    private SkillService skillService;

    private SkillController skillController;

    @Test
    void savingSkill() {
      //  List<Experience> testList;
        Skill skill;
       // Experience testExp = new Experience(21L, "cour", "proj", any());
       // testList.add(testExp);
        skill = new Skill(82L, "jedna", "dva", "tri",any() );
        Skill result = skillController.saveSkill(skill);
        assertNotNull(result);
        assertTrue(skillRepository.existsById(result.getId()));
    }

    @Test
    public void testSaveSkill() {
        Skill skill = new Skill();
        skill.setId(500L);
        skill.setName("javicka");
        skill.setLevel("nicmoc");
        skill.setPractise("takytak");

        Mockito.when(skillController.saveSkill(skill)).thenReturn(skill);
        assertNotNull(skill);
        assertTrue(skillRepository.existsById(skill.getId()));
    }
}