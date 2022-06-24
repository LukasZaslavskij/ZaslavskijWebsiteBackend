package com.personalWebsite.ZaslavskijWebsite.DAO;

import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {

        @Query("select s from skill s"+"where s.id=?1")
        Skill findSkillByIdJpa(Long id);
}
