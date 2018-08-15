package com.repair.entity.pt;

import javax.persistence.*;
import java.util.Objects;

/**
 * auther   kangwang
 */
@Entity
@Table(name = "pt_user_cancel", schema = "repair", catalog = "")
public class UserCancelEntity {
    private String id;
    private String orderId;
    private String version;
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCancelEntity that = (UserCancelEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, orderId, version);
    }
}
