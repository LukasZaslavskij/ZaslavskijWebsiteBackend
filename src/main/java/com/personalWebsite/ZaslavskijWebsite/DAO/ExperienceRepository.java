package com.personalWebsite.ZaslavskijWebsite.DAO;

import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience,Long> {
}