package com.common.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mounika on 24/08/16.
 */
@Entity
@Table(name="TIMESHEET_DETAIL")
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int timesheetdetailid;
    @Column
    private int userid;
    @Column
    private int hours;
    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date workday;

    public Dashboard() {
    }

    public Dashboard(int userid, int hours, Date workday) {
        this.userid = userid;
        this.hours = hours;
        this.workday = workday;
    }

    public int getTimesheetdetailid() {
        return timesheetdetailid;
    }

    public void setTimesheetdetailid(int timesheetdetailid) {
        this.timesheetdetailid = timesheetdetailid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Date getWorkday() {
        return workday;
    }

    public void setWorkday(Date workday) {
        this.workday = workday;
    }
}
