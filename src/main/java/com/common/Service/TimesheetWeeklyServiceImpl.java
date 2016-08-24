package com.common.Service;

import com.common.Repository.TimesheetWeeklyRepository;
import com.common.model.TimesheetWeekly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mounika on 24/08/16.
 */
@Service
public class TimesheetWeeklyServiceImpl implements TimesheetWeeklyService {
    @Autowired
    private TimesheetWeeklyRepository timesheetWeeklyRepository;

    @Override
    public String insert(TimesheetWeekly timesheetWeekly) {

try
{
      TimesheetWeekly timesheetWeekly1=new TimesheetWeekly();
        timesheetWeekly1.setUserid(timesheetWeekly.getUserid());
        timesheetWeekly1.setWeekstartdate(timesheetWeekly.getWeekstartdate());
        timesheetWeekly1.setWeekenddate(timesheetWeekly.getWeekenddate());
     timesheetWeeklyRepository.save(timesheetWeekly1);

        return "User succesfully created!";

    }catch(Exception ex)
      {
    return "Error creating the user...."+ex;
      }

        }
}
