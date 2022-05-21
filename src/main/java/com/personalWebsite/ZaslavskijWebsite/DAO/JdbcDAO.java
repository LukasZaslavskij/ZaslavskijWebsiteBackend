package com.personalWebsite.ZaslavskijWebsite.DAO;

import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Repository
public class JdbcDAO implements DAO<Skill> {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Skill> findAll() {
        return jdbcTemplate.query("SELECT * FROM SKILLS", new BeanPropertyRowMapper<Skill>(Skill.class));
    }

    @Override
    public Skill findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM SKILLS WHERE id=?", new BeanPropertyRowMapper<Skill>(Skill.class), id);
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM SKILLS WHERE id=?", id);
    }

    @Override
    public int save(Skill skill) {
        return jdbcTemplate.update("INSERT INTO SKILLS (name, level , practise) VALUES (?, ?, ?)", new Object[] {skill.getName(), skill.getLevel(), skill.getPractise()});
    }

    @Override
    public int update(Skill skill, int id) {
        return jdbcTemplate.update("UPDATE SKILLS SET name = ?, level = ?, practise = ? WHERE id = ?", new Object[] {skill.getName(), skill.getLevel(), skill.getPractise(), id});
    }
}
