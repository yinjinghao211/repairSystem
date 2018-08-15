package com.repair.model.request.ht;

/**
 * auther   kangwang
 */
public class UsereditRequest {
    private String id;
    private String dept;
    private String name;
    private String password;
    private String operator;

    public UsereditRequest(String id, String dept, String name, String password, String operator) {
        this.id = id;
        this.dept = dept;
        this.name = name;
        this.password = password;
        this.operator = operator;
    }

    public UsereditRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
