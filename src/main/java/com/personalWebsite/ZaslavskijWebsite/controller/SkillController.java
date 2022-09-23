package com.personalWebsite.ZaslavskijWebsite.controller;



import com.personalWebsite.ZaslavskijWebsite.DAO.ExperienceRepository;
import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.Dto.OnlySkillDto;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import com.personalWebsite.ZaslavskijWebsite.kafka.kafkaSettings;
import com.personalWebsite.ZaslavskijWebsite.service.ExperienceService;
import com.personalWebsite.ZaslavskijWebsite.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillRepository skillRepository;
    @Autowired
    private SkillService skillService;
    @Autowired
    private ExperienceRepository experienceRepository;
    @Autowired
    private ExperienceService experienceService;
    @Autowired
    private kafkaSettings kafkaSettings;

    @PutMapping("/edit/{id}")
    public void updateSkill(@RequestBody Skill skill, @PathVariable Long id) {
       skillService.updateSkill(skill,id);
    }

    @PostMapping("/add")
    public Skill saveSkill(@RequestBody Skill skill){
        return skillRepository.save(skill);
    }

    @GetMapping("/getList")
    public List<Skill> findAllOSkills(){
        return skillRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @GetMapping("/getSkill/{id}")
    public Skill findById(@PathVariable Long id) {
        return skillRepository.findSkillById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
         skillRepository.deleteById(id);
    }

    @GetMapping("/getOnlySkills")
    public List<OnlySkillDto> findAllOnlySkills(){
        return skillRepository.findAllOnlySkillDto();
    }

    @PutMapping("/editExperience/{id}")
    public void findAllExperience(@RequestBody Experience experience, @PathVariable Long id) {
        experienceService.updateExperience(experience,id);
    }

    @GetMapping("/getExperiencesOfSkill/{id}")
    public List<Experience> findAllExperiencesOfSkill(@PathVariable Long id){
        return experienceRepository.findExperiencesOfSkill(id);
    }

    @PutMapping("/addExperience/{id}")
    public void addExperience(@RequestBody Experience experience, @PathVariable Long id) {
        experienceService.addExperience(experience,id);
    }

    @DeleteMapping("/deleteExperience/{id}")
    public void deleteExperienceById(@PathVariable Long id) {
        experienceRepository.deleteExperience(id);
    }

    @PostMapping(path = "send/hello")
    public ResponseEntity<String> sendHello(@RequestBody String json) {
        return kafkaSettings.sendJson("skill", json);
    }

/*@GetMapping("/getList")
    public List<Skill> findAll() {
        return dao.findAll();
    }

    @GetMapping("/getSkill/{id}")
    public Skill findById(@PathVariable int id) {
        return dao.findById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return dao.deleteById(id) + " skill delete from the database";
    }

    @PostMapping("/add")
    public String save(@RequestBody Skill skill) {
        return dao.save(skill) + " skill saved successfully";
    }

    /*@PutMapping("/edit/{id}")
    public String update(@RequestBody Skill skill, @PathVariable int id) {
        return dao.update(skill, id) + " skill updated successfully";
    }*/
}
