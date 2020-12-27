package com.cetin.cvbackend.Experience;

import org.bson.types.ObjectId;
import java.util.Objects;
//import java.util.UUID;


public class Experience {
    private ObjectId experienceId;
    private String customerName;
    private String description;
    private String note;
    private Double duration; //in months


    public Experience(ObjectId experienceId,
                        String customerName,
                        String description,
                        String note,
                        Double duration)
    {
        this.experienceId = experienceId;
        this.customerName = customerName;
        this.description = description;
        this.note = note;
        this.duration = duration;
    }

    public ObjectId getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(ObjectId experienceId) {
        this.experienceId = experienceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experience that = (Experience) o;
        return Objects.equals(experienceId, that.experienceId) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experienceId, customerName, description, note, duration);
    }
}