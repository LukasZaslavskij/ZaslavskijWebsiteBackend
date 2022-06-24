package com.personalWebsite.ZaslavskijWebsite.service;

import com.personalWebsite.ZaslavskijWebsite.DAO.DAO;
import com.personalWebsite.ZaslavskijWebsite.DAO.SkillRepository;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;


}
