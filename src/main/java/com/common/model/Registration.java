package com.common.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by mounika on 19/08/16.
 */
@Entity
@Table(name = "USERS")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long userid;
    @NotNull
    @Column
    private String email;
    @NotNull
    @Column
    private String password;

    public Registration() {
    }

    public Registration(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
