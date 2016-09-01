package com.common.model;

import javax.persistence.*;

/**
 * Created by mounika on 01/09/16.
 */
@Entity
@Table(name="PROJECTS")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int projectid;
    @Column
    private int clientid;
    @Column
    private String projectname;
    @Column
    private int createdby;

    public Projects() {
    }

    public Projects(int clientid, String projectname, int createdby) {
        this.clientid = clientid;
        this.projectname = projectname;
        this.createdby = createdby;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }
}
