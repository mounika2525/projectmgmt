package com.common.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mounika on 24/08/16.
 */
@Entity
@Table(name = "TIMESHEET_WEEKLY")
public class TimesheetWeekly {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int weeksheetid;
    @Column
    private int userid;
    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date weekstartdate;
    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date weekenddate;

    public TimesheetWeekly() {
    }

    public TimesheetWeekly(int userid, Date weekstartdate, Date weekenddate) {
        this.userid = userid;
        this.weekstartdate = weekstartdate;
        this.weekenddate = weekenddate;
    }

    public int getWeeksheetid() {
        return weeksheetid;
    }

    public void setWeeksheetid(int weeksheetid) {
        this.weeksheetid = weeksheetid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getWeekstartdate() {
        return weekstartdate;
    }

    public void setWeekstartdate(Date weekstartdate) {
        this.weekstartdate = weekstartdate;
    }

    public Date getWeekenddate() {
        return weekenddate;
    }

    public void setWeekenddate(Date weekenddate) {
        this.weekenddate = weekenddate;
    }
}
