package com.common.Controller;

import com.common.Service.TimesheetWeeklyService;
import com.common.model.TimesheetWeekly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mounika on 24/08/16.
 */
@RestController
@RequestMapping("/timesheetweekly")
public class TimesheetWeeklyController {
    @Autowired
    private TimesheetWeeklyService timesheetWeeklyService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value="/trackTime/", method = RequestMethod.PUT)
    public String insertTimesheetWeekly(@RequestBody TimesheetWeekly timesheetWeekly)
    {
        return timesheetWeeklyService.insert(timesheetWeekly);
    }


}
