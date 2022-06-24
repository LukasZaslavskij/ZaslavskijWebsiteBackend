package com.personalWebsite.ZaslavskijWebsite.Controller;


import com.personalWebsite.ZaslavskijWebsite.DAO.DAO;
import com.personalWebsite.ZaslavskijWebsite.DAO.JdbcDAO;
import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private DAO dao;
    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("/getList")
    public List<Skill> findAll() {
        return dao.findAll();
    }

    @GetMapping("/getSkill/{id}")
    public Skill findById(@PathVariable int id) {
        return dao.findById(id);
    }

    @GetMapping("/getSkillByName/{name}")
    public List<Skill> findByName(@PathVariable String name) {
        return dao.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return dao.deleteById(id) + " skill delete from the database";
    }

    @PostMapping("/add")
    public String save(@RequestBody Skill skill) {
        return dao.save(skill) + " skill saved successfully";
    }

    @PutMapping("/edit/{id}")
    public String update(@RequestBody Skill skill, @PathVariable int id) {
        return dao.update(skill, id) + " skill updated successfully";
    }
    @PostMapping("/addSkillJpa")
    public Skill placeOrder(@RequestBody Skill skill){
        return skillRepository.save(skill);
    }
    @GetMapping("/findAllSkillsJpa")
    public List<Skill> findAllOrders(){
        return skillRepository.findAll();
    }
    @GetMapping("/getSkillJpa/{id}")
    public Skill findByIdJpa(@PathVariable int id) {
        return dao.findById(id);
    }

}
