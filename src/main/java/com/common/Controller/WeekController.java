package com.common.Controller;

import com.common.Service.WeekService;
import com.common.model.Dashboard;
import com.common.model.TimesheetWeekly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 02/09/16.
 */
@RestController
@RequestMapping(value = "/project_mgmt")
public class WeekController {


    private WeekService weekService;

    @Autowired
    public WeekController(WeekService weekService) {
        this.weekService = weekService;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/week/{weekstartdate}/{weekenddate}/", method = RequestMethod.GET)
    public List<TimesheetWeekly> getByWeek(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date weekstartdate,
                                           @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date weekenddate)
    {
        return weekService.findByWeek(weekstartdate, weekenddate);
    }

}








