package com.repair.entity.pt;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * auther   kangwang
 */
@Entity
@Table(name = "pt_user", schema = "repair", catalog = "")
public class UserEntity {
    private String id;
    private String tel;
    private String username;
    private String wechat;
    private String password;
    private String address;
    private Timestamp createDate;
    private String version;
    private String paymentPassword;
    private String status;
    private String grade;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "wechat")
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "payment_password")
    public String getPaymentPassword() {
        return paymentPassword;
    }

    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(username, that.username) &&
                Objects.equals(wechat, that.wechat) &&
                Objects.equals(password, that.password) &&
                Objects.equals(address, that.address) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(version, that.version) &&
                Objects.equals(paymentPassword, that.paymentPassword) &&
                Objects.equals(status, that.status) &&
                Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, tel, username, wechat, password, address, createDate, version, paymentPassword, status, grade);
    }
}
