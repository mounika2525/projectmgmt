package com.common.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mounika on 24/08/16.
 */
@Entity
@Table(name="TIMESHEET_DETAIL")
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int timesheetdetailid;
    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date workday;
    @Column
    private int hours;
    @Column
    private int userid;

    public Timesheet() {
    }

    public Timesheet(Date workday, int hours, int userid) {
        this.workday = workday;
        this.hours = hours;
        this.userid = userid;
    }

    public int getTimesheetdetailid() {
        return timesheetdetailid;
    }

    public void setTimesheetdetailid(int timesheetdetailid) {
        this.timesheetdetailid = timesheetdetailid;
    }

    public Date getWorkday() {
        return workday;
    }

    public void setWorkday(Date workday) {
        this.workday = workday;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
