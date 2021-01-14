package com.cetin.cvbackend.Skill;

import com.cetin.cvbackend.datastore.FakeSkillDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cetin.cvbackend.Skill.Skill;

import java.util.List;

@Repository
public class SkillDataAccessService {

    private final FakeSkillDataStore fakeSkillDataStore;

    @Autowired
    public SkillDataAccessService(FakeSkillDataStore fakeSkillDataStore) {
        this.fakeSkillDataStore = fakeSkillDataStore;
    }

    List<Skill> getSkills(){
        return fakeSkillDataStore.getSkills();
    }
}
