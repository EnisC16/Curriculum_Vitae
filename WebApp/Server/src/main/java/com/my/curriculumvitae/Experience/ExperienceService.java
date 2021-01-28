package com.my.curriculumvitae.Experience;

import com.my.curriculumvitae.Experience.ExperienceDataAccessService;
import com.my.curriculumvitae.Experience.Experience;
import org.springframework.beans.factory.annotation.Autowired;
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
