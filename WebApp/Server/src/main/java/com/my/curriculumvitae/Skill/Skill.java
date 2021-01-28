package com.my.curriculumvitae.Skill;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document(collection = "Skill")
public class Skill {
    @Id
    private String skillId;
    @Field("Name")
    private String name;
    @Field("Rating")
    private Double rating;

    public Skill(String skillId,
                        String name,
                        Double rating)
    {
        this.skillId = skillId;
        this.name = name;
        this.rating = rating;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
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

    @Override
    public String toString() {
        return "Skill{" +
                "skillId='" + skillId + '\'' +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}