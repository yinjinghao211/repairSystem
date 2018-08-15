package com.repair.entity.ht;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * auther   kangwang
 */
@Entity
@Table(name = "ht_user", schema = "repair", catalog = "")
public class UserEntity {
    private String id;
    private String dept;
    private String name;
    private String password;
    private String operator;

    @Id
    @Column(name = "id")
    @GenericGenerator(strategy = "uuid" ,name = "uuid")
    @GeneratedValue(generator = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dept")
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Basic
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dept, that.dept) &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(operator, that.operator);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dept, name, password,operator);
    }
}
