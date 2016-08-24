package com.common.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * Created by mounika on 09/08/16.
 */

@Entity
@Table(name="USERS")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long userid;
    @Column
    private String email;
    @Column
    private String password;

    public Login() {
    }

    public Login(String email, String password) {
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
