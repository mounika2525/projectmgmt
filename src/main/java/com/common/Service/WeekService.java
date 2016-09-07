package com.common.Service;

import com.common.model.TimesheetWeekly;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 02/09/16.
 */
public interface WeekService {
    List<TimesheetWeekly> findByWeek(Date weekstartdate, Date weekenddate);
}
