package com.cetin.cvbackend.Skill;

import com.cetin.cvbackend.Skill.SkillDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import com.cetin.cvbackend.Skill.Skill;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SkillService {

    private final SkillDataAccessService skillDataAccessService;

    @Autowired
    public SkillService(SkillDataAccessService skillDataAccessService) {
        this.skillDataAccessService = skillDataAccessService;
    }

    List<Skill> getSkills(){
        return skillDataAccessService.getSkills();
    }

}
