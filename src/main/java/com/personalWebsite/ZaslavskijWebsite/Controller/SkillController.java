package com.personalWebsite.ZaslavskijWebsite.Controller;


import com.personalWebsite.ZaslavskijWebsite.DAO.DAO;
import com.personalWebsite.ZaslavskijWebsite.DAO.JdbcDAO;
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

    @GetMapping("/skills")
    public List<Skill> findAll() {
        return dao.findAll();
    }

    @GetMapping("/skills/{id}")
    public Skill findById(@PathVariable int id) {
        return dao.findById(id);
    }

    @DeleteMapping("/skills/{id}")
    public String deleteById(@PathVariable int id) {
        return dao.deleteById(id) + " Employee(s) delete from the database";
    }

    @PostMapping("/add")
    public String save(@RequestBody Skill skill) {
        return dao.save(skill) + " Employee(s) saved successfully";
    }

    @PutMapping("/skills/{id}")
    public String update(@RequestBody Skill skill, @PathVariable int id) {
        return dao.update(skill, id) + " Employee(s) updated successfully";
    }
}
