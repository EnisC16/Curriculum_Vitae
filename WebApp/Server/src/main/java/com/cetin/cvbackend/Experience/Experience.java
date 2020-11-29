package com.cetin.cvbackend.Experience;

import java.util.Objects;
import java.util.UUID;

public class Experience {
    private UUID experienceId;
    private String customerName;
    private String description;


    public Experience(UUID experienceId,
                        String customerName,
                        String description)
    {
        this.experienceId = experienceId;
        this.customerName = customerName;
        this.description = description;
    }

    public UUID getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(UUID experienceId) {
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
        return Objects.hash(experienceId, customerName, description);
    }
}