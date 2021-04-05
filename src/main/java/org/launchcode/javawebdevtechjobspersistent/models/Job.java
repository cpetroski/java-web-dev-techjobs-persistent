package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skill;

    public Job() {
    }

    public Job(Employer employer, List <Skill> skill) {
        super();
        this.employer = employer;
        this.skill = skill;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }
}

