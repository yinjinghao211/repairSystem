package com.repair.model.request.ht;

/**
 * auther   kangwang
 */
public class EngineerAuthRequest {
    private String id;
    private String status;

    public EngineerAuthRequest(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public EngineerAuthRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
