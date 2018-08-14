package com.repair.entity.pt;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * auther   kangwang
 */
@Entity
@Table(name = "pt_engineer_skillauthentication", schema = "repair", catalog = "")
public class EngineerSkillauthenticationEntity {
    private String id;
    private String skill;
    private byte[] certificatePicture;
    private String skillIntroduction;
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
    @Column(name = "skill")
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Basic
    @Column(name = "certificate_picture")
    public byte[] getCertificatePicture() {
        return certificatePicture;
    }

    public void setCertificatePicture(byte[] certificatePicture) {
        this.certificatePicture = certificatePicture;
    }

    @Basic
    @Column(name = "skill_introduction")
    public String getSkillIntroduction() {
        return skillIntroduction;
    }

    public void setSkillIntroduction(String skillIntroduction) {
        this.skillIntroduction = skillIntroduction;
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
