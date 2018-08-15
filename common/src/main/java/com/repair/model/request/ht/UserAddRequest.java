package com.repair.model.request.ht;

/**
 * auther   kangwang
 */
public class UserAddRequest {
    private String dept;//部门
    private String name;//名字
    private String password;//登录密码
    private String operator;//操作者

    public UserAddRequest(String dept, String name, String password, String operator) {
        this.dept = dept;
        this.name = name;
        this.password = password;
        this.operator = operator;
    }

    public UserAddRequest() {
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
