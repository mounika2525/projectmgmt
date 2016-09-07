package com.common.Service;

import com.common.Repository.WeekRepository;
import com.common.model.TimesheetWeekly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 02/09/16.
 */
@Transactional
@Service
public class WeekServiceImpl implements WeekService {
    private WeekRepository weekRepository;
@Autowired
    public WeekServiceImpl(WeekRepository weekRepository) {
        this.weekRepository = weekRepository;
    }

    @Override
    public List<TimesheetWeekly> findByWeek(Date weekstartdate, Date weekenddate)
    {
        return weekRepository.findByWeek(weekstartdate, weekenddate);
    }

}
