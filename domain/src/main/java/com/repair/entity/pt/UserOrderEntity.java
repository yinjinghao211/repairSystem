package com.repair.entity.pt;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * auther   kangwang
 */
@Entity
@Table(name = "pt_user_order", schema = "repair", catalog = "")
public class UserOrderEntity {

    private String id;
    private String type;
    private String version;
    private String tradeName;
    private String reason;
    private Timestamp createDate;
    private String tel;
    private String address;
    private String city;
    private String currentStatus;
    private Timestamp leadTime;
    private Timestamp deliverDate;
    private String examineStatus;
    private String tradeNumber;
    private String paytype;
    private String evaluate;
    private String returnBack;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "id")
    @GenericGenerator(strategy = "uuid",name="uuid")
    @GeneratedValue(generator = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "trade_name")
    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "current_status")
    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Basic
    @Column(name = "lead_time")
    public Timestamp getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(Timestamp leadTime) {
        this.leadTime = leadTime;
    }

    @Basic
    @Column(name = "deliver_date")
    public Timestamp getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Timestamp deliverDate) {
        this.deliverDate = deliverDate;
    }

    @Basic
    @Column(name = "examine_status")
    public String getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(String examineStatus) {
        this.examineStatus = examineStatus;
    }

    @Basic
    @Column(name = "trade_number")
    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    @Basic
    @Column(name = "paytype")
    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    @Basic
    @Column(name = "evaluate")
    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    @Basic
    @Column(name = "return_back")
    public String getReturnBack() {
        return returnBack;
    }

    public void setReturnBack(String returnBack) {
        this.returnBack = returnBack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOrderEntity that = (UserOrderEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(version, that.version) &&
                Objects.equals(tradeName, that.tradeName) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(address, that.address) &&
                Objects.equals(city, that.city) &&
                Objects.equals(currentStatus, that.currentStatus) &&
                Objects.equals(leadTime, that.leadTime) &&
                Objects.equals(deliverDate, that.deliverDate) &&
                Objects.equals(examineStatus, that.examineStatus) &&
                Objects.equals(tradeNumber, that.tradeNumber) &&
                Objects.equals(paytype, that.paytype) &&
                Objects.equals(evaluate, that.evaluate) &&
                Objects.equals(returnBack, that.returnBack);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, type, version, tradeName, reason, createDate, tel, address, city, currentStatus, leadTime, deliverDate, examineStatus, tradeNumber, paytype, evaluate, returnBack);
    }
}
