package com.cetin.cvbackend.datastore;
import com.cetin.cvbackend.Experience.Experience;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

@Repository
public class FakeExperienceDataStore {
    private static final List<Experience> EXPERIENCES = new ArrayList<>();

    static {
        EXPERIENCES.add(new Experience(UUID.randomUUID(), "Unternehmen1", "Created Trigger \n created Interfaces"));
        EXPERIENCES.add(new Experience(UUID.randomUUID(), "Unternehmen2", "Created more Trigger <br/> created more Interfaces"));
    }

    public List<Experience> getExperiences() {
        return EXPERIENCES;
    }
}
