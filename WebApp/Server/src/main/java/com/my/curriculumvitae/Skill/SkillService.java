package com.my.curriculumvitae.Skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SkillService {

    private final SkillDataAccessService skillDataAccessService;

    @Autowired
    public SkillService(SkillDataAccessService skillDataAccessService) {
        this.skillDataAccessService = skillDataAccessService;
    }

    public List<Skill> getSkills(){
        return skillDataAccessService.getSkills();
    }

}
