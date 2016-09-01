package com.common.model;

import javax.persistence.*;

/**
 * Created by mounika on 01/09/16.
 */
@Entity
@Table(name="TASKS")
public class Task {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column
    private int taskid;
    @Column
    private  String taskname;
    @Column
    private int createdby;

    public Task() {
    }

    public Task(String taskname, int createdby) {
        this.taskname = taskname;
        this.createdby = createdby;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }
}
