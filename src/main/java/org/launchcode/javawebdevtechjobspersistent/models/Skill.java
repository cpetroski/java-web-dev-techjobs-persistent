package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;

@Entity
public class Skill extends AbstractEntity {

    @Max(value = 255, message = "Max description length is 255 characters.")
    private String description;

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}