/*
package com.personalWebsite.ZaslavskijWebsite.DAO;

import com.personalWebsite.ZaslavskijWebsite.entity.Experience;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcDAO implements DAO<Skill>  {


@Autowired
    JdbcTemplate jdbcTemplate;

    @Override
       public List<Skill> findAll(){
                return jdbcTemplate.query("SELECT * FROM SKILLS ",new BeanPropertyRowMapper<Skill>(Skill.class));
                }

    @Override
public Skill findById(int id){
        return jdbcTemplate.queryForObject("SELECT * FROM SKILLS WHERE id=?",new BeanPropertyRowMapper<Skill>(Skill.class),id);
        }

@Override
public List<Skill> findByName(String name){
        return jdbcTemplate.query("SELECT * FROM SKILLS WHERE name=?",new BeanPropertyRowMapper<>(Skill.class),name);
        }

@Override
public int deleteById(int id){
        return jdbcTemplate.update("DELETE FROM SKILLS WHERE id=?",id);
        }

@Override
public int save(Skill skill){
        return jdbcTemplate.update("INSERT INTO SKILLS (name, level , practise, experiences) VALUES (?, ?, ?,?)",new Object[]{skill.getName(),skill.getLevel(),skill.getPractise(),skill.getExperiences()});
        }

@Override
public int update(Skill skill,int id){
        return jdbcTemplate.update("UPDATE SKILLS SET name = ?, level = ?, practise = ? WHERE id = ?",new Object[]{skill.getName(),skill.getLevel(),skill.getPractise(),id});
        }

    @Override
    public List<Skill> findAllExperience(){
        return jdbcTemplate.query("SELECT id, name FROM skills JOIN experience", new BeanPropertyRowMapper<Skill>(Skill.class));
    }

@Override
public int saveExperience(Experience experience){
        return jdbcTemplate.update("INSERT INTO experience (course,project ) VALUES (?,?)",new Object[]{experience.getCourse(),experience.getProject()});
        }
        }
*/
