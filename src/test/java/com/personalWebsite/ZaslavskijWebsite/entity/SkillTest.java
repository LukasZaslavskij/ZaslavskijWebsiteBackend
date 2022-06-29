package com.personalWebsite.ZaslavskijWebsite.entity;

import com.personalWebsite.ZaslavskijWebsite.Controller.SkillController;
import com.personalWebsite.ZaslavskijWebsite.DAO.JdbcDAO;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SkillTest {

    @Autowired @MockBean
    JdbcDAO jdbcDAO;
    @Mock
    JdbcTemplate jdbcTemplate;
    @Mock
    SkillController controller;



   /* @Test
    public void testSaveSkill() {

        Skill skill = new Skill();

        skill.setName("javicka");
        skill.setLevel("nicmoc");
        skill.setPractise("takytak");

        ReflectionTestUtils.setField(jdbcDAO, "jdbcTemplate", jdbcTemplate);
        Mockito.when(jdbcDAO.save(skill)).thenReturn(3);
        Skill testSkill = new Skill (23,"javka","lavka","pavka");
        Mockito.when(jdbcDAO.findById(63)).thenReturn(testSkill);
        testSkill=jdbcDAO.findById(63);
        assertEquals(testSkill.getName(),"javicka");
        }
*/

   /* @Test
    public void testFindByID(){
        Skill skill = jdbcDAO.findById(48);
        assertEquals(skill.getId(),48);


    }

    @Test
    public void testGettingAllSkills(){
        List<Skill> list = jdbcDAO.findAll();
        assertTrue(jdbcDAO.findAll().size()>0);
    }*/
}