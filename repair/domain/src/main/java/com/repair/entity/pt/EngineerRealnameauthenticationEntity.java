package com.repair.entity.pt;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * auther   kangwang
 */
@Entity
@Table(name = "pt_engineer_realnameauthentication", schema = "repair", catalog = "")
public class EngineerRealnameauthenticationEntity {
    private String id;
    private String name;
    private String idNumber;
    private byte[] frontal;
    private byte[] otherSide;
    private String engineerId;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "id_number")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Basic
    @Column(name = "frontal")
    public byte[] getFrontal() {
        return frontal;
    }

    public void setFrontal(byte[] frontal) {
        this.frontal = frontal;
    }

    @Basic
    @Column(name = "other_side")
    public byte[] getOtherSide() {
        return otherSide;
    }

    public void setOtherSide(byte[] otherSide) {
        this.otherSide = otherSide;
    }

    @Basic
    @Column(name = "engineer_id")
    public String getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(String engineerId) {
        this.engineerId = engineerId;
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
