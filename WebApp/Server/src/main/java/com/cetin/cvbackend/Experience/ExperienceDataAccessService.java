package com.cetin.cvbackend.Experience;

import com.cetin.cvbackend.datastore.FakeExperienceDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cetin.cvbackend.Experience.Experience;

import java.util.List;

@Repository
public class ExperienceDataAccessService {

    private final FakeExperienceDataStore fakeExperienceDataStore;

    @Autowired
    public ExperienceDataAccessService(FakeExperienceDataStore fakeExperienceDataStore) {
        this.fakeExperienceDataStore = fakeExperienceDataStore;
    }

    List<Experience> getExperiences(){
        return fakeExperienceDataStore.getExperiences();
    }
}
