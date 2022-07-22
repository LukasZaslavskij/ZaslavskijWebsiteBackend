package com.personalWebsite.ZaslavskijWebsite.Repository;

import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
public class skillRepositoryTest {
    @Mock
    SkillRepository skillRepository;

    @Test
    void findById(){
        Skill testSkill = new Skill(1L,"jedna","dva","tri",null);
        when(skillRepository.findSkillById(anyLong())).thenReturn(testSkill);

        //test
        final Long testId=20L;
        Skill resultSkill=skillRepository.findSkillById(testId);
        assertNotNull(resultSkill);
        assertEquals(resultSkill.getId(),testSkill.getId());
        
    }
}
