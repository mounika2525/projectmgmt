package com.common.Controller;

import com.common.Service.TimesheetService;
import com.common.model.Timesheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mounika on 23/08/16.
 */
@RestController
@RequestMapping("/project_mgmt")
public class TimeSheetController {
    @Autowired
    private TimesheetService timesheetService;


    @CrossOrigin(origins = "*")
    @RequestMapping(value="/tracktime/", method = RequestMethod.PUT)
    public String insertTimesheet(@RequestBody Timesheet timesheet)
    {
        return timesheetService.insert(timesheet);
    }

}
