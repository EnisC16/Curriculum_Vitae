package com.cetin.cvbackend.Experience;

import com.cetin.cvbackend.Experience.ExperienceDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import com.cetin.cvbackend.Experience.Experience;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExperienceService {

    private final ExperienceDataAccessService experienceDataAccessService;

    @Autowired
    public ExperienceService(ExperienceDataAccessService experienceDataAccessService) {
        this.experienceDataAccessService = experienceDataAccessService;
    }

    List<Experience> getExperiences(){
        return experienceDataAccessService.getExperiences();
    }

}
