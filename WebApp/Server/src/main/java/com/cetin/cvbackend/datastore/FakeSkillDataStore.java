package com.cetin.cvbackend.datastore;
import com.cetin.cvbackend.Skill.Skill;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class FakeSkillDataStore {
    private static final List<Skill> SKILLS = new ArrayList<>();

    static {
        //EXPERIENCES.add(new Experience(UUID.randomUUID(), "Unternehmen1", "Created Trigger \n created Interfaces"));
        //EXPERIENCES.add(new Experience(UUID.randomUUID(), "Unternehmen2", "Created more Trigger <br/> created more Interfaces"));
    }

    public List<Skill> getSkills() {
        return MongoDBConnection.getSkillTable();
    }
}
