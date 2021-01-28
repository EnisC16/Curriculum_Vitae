package com.my.curriculumvitae.Experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExperienceDataAccessService {

    private final ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceDataAccessService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    List<Experience> getExperiences(){
        return experienceRepository.findAll();
    }
}
