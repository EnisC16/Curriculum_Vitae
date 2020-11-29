package com.cetin.cvbackend.Experience;

import com.cetin.cvbackend.Experience.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("api/v1/experiences")
@CrossOrigin("*")
public class ExperienceController {

    private final ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }


    @GetMapping
    public List<Experience> getExperiences() {
        return experienceService.getExperiences();
    }
}