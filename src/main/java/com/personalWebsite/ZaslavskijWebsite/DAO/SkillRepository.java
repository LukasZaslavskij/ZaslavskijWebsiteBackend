package com.personalWebsite.ZaslavskijWebsite.DAO;

import com.personalWebsite.ZaslavskijWebsite.Dto.OnlyExperienceDto;
import com.personalWebsite.ZaslavskijWebsite.Dto.OnlySkillDto;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

        @Query("SELECT s FROM Skill s WHERE s.id = ?1")
        Skill findSkillById(Long id);

        @Query("SELECT new com.personalWebsite.ZaslavskijWebsite.Dto.OnlySkillDto(s.id, s.name, s.level, s.practise)  from Skill s")
        List<OnlySkillDto> findAllOnlySkillDto();





}
