package com.my.curriculumvitae.Skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SkillDataAccessService {

    private final SkillRepository skillRepository;

    @Autowired
    public SkillDataAccessService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    List<Skill> getSkills(){
        return skillRepository.findAll();
    }
}
