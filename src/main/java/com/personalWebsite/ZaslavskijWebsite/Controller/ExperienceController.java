package com.personalWebsite.ZaslavskijWebsite.Controller;


import com.personalWebsite.ZaslavskijWebsite.DAO.DAO;
import com.personalWebsite.ZaslavskijWebsite.DAO.ExperienceRepository;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    @Autowired
    private DAO dao;

    @Autowired
    private ExperienceRepository experienceRepository;

    @GetMapping("/getAll")
    public List<Skill> findAllExperience() {
        return dao.findAllExperience();
    }
    @PostMapping("/add")
    public String saveExperience(@RequestBody Experience experience) {
        return dao.saveExperience(experience) + " skill saved successfully";
    }
    @GetMapping("/findAllExp")
    public List<Experience> findAllOrders(){
        return experienceRepository.findAll();
    }
}
