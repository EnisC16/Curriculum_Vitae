package com.cetin.cvbackend.Skill;

import org.bson.types.ObjectId;
import java.util.Objects;
//import java.util.UUID;


public class Skill {
    private ObjectId skillId;
    private String name;
    private Double rating;


    public Skill(ObjectId skillId,
                        String name,
                        Double rating)
    {
        this.skillId = skillId;
        this.name = name;
        this.rating = rating;
    }

    public ObjectId getSkillId() {
        return skillId;
    }

    public void setExperienceId(ObjectId skillId) {
        this.skillId = skillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill that = (Skill) o;
        return Objects.equals(skillId, that.skillId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, name, rating);
    }
}