package com.repair.model.request.pt;

import java.sql.Timestamp;

/**
 * auther   kangwang
 */
public class UserAddOrdrerRequest {
    private String type;//类型
    private String version;//型号
    private String tradeName;//订单名字
    private String reason;//原因
    private String tel;//电话
    private String address;//地址
    private String city;//城市




    public UserAddOrdrerRequest(String type, String version, String tradeName, String reason, String tel, String address, String city) {
        this.type = type;
        this.version = version;
        this.tradeName = tradeName;
        this.reason = reason;
        this.tel = tel;
        this.address = address;
        this.city = city;
    }

    public UserAddOrdrerRequest() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
