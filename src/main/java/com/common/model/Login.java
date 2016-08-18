package com.common.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * Created by mounika on 09/08/16.
 */

@Entity
@Table(name="LOGIN")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String username;
    @Column
    private String password;

    public Login() {
    }

    public Login(Long  id,String username, String password) {
        this.id=id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
