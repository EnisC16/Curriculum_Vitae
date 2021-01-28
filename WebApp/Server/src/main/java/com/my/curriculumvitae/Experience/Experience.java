package com.my.curriculumvitae.Experience;

import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Experience")
public class Experience {
    @Id
    private String experienceId;
    @Field("Customer")
    private String customerName;
    @Field("Description")
    private String description;
    @Field("StartDate")
    private String startDate;
    @Field("EndDate")
    private String endDate;
    @Field("Date")
    private String date;
    @Field("Title")
    private String title;
    @Field("Notes")
    private String note;


    public Experience(String experienceId, String customerName, String description, String startDate, String endDate, String date, String title, String note) {
        this.experienceId = experienceId;
        this.customerName = customerName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.date = date;
        this.title = title;
        this.note = note;
    }

    public String getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(String experienceId) {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experience that = (Experience) o;
        return experienceId.equals(that.experienceId) && Objects.equals(customerName, that.customerName) && Objects.equals(description, that.description) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(date, that.date) && Objects.equals(title, that.title) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experienceId, customerName, description, startDate, endDate, date, title, note);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "experienceId='" + experienceId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}