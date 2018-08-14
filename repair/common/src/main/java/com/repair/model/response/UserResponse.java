package com.repair.model.response;

/**
 * auther   kangwang
 */
public class UserResponse {
    private String dept;//部门
    private String name;//名字
    private String operator;//操作者

    public UserResponse(String dept, String name, String operator) {
        this.dept = dept;
        this.name = name;
        this.operator = operator;
    }

    public UserResponse() {
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
