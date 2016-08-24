package com.common.Service;

import com.common.Repository.TimesheetRepository;
import com.common.model.Timesheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.persistence.TemporalType;

/**
 * Created by mounika on 23/08/16.
 */
@Service
public class TimesheetServiceImpl implements TimesheetService {
    @Autowired
    private TimesheetRepository timesheetRepository;

    @Override
    public String insert(Timesheet timesheet) {

try {

    Timesheet timesheet1 = new Timesheet();
    timesheet1.setHours(timesheet.getHours());
    timesheet1.setWorkday(timesheet.getWorkday());
    timesheet1.setUserid(timesheet.getUserid());
    timesheetRepository.save(timesheet1);
    return "User succesfully created!";

}catch (Exception ex)
    {
        return "Error creating the user...."+ex;
    }

    }
}




