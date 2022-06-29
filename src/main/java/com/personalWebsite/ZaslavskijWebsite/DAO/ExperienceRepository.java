package com.personalWebsite.ZaslavskijWebsite.DAO;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    @Query("SELECT e from Skill s JOIN s.experiences e WHERE e.id = ?1")
    Experience findExperience(Long id);

    @Query("SELECT e from Skill s JOIN s.experiences e WHERE s.id = ?1")
    List<Experience> findExperiencesOfSkill(Long id);
    @Modifying
    @Transactional
    @Query("DELETE from Experience e WHERE e.id = ?1")
    void deleteExperience(Long id);
}
