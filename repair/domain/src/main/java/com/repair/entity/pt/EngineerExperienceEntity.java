package com.repair.entity.pt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * auther   kangwang
 */
@Entity
@Table(name = "pt_engineer_experience", schema = "repair", catalog = "")
public class EngineerExperienceEntity {
    private String id;
    private String experience;
    private Timestamp startDate;
    private Timestamp endDate;
    private String status;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "experience")
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Basic
    @Column(name = "start_date")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
