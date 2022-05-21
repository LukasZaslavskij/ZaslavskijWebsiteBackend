package com.personalWebsite.ZaslavskijWebsite.DAO;

import com.personalWebsite.ZaslavskijWebsite.entity.Skill;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    public List<Skill> findAll();

    public Skill findById(int id);

    public int deleteById(int id);

    public int save(Skill skill);

    public int update(Skill skill, int id);
}

