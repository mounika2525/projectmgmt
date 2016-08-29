package com.common.Service;

import com.common.Repository.DashboardRepository;
import com.common.Repository.TimesheetRepository;
import com.common.model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 24/08/16.
 */
@Transactional
@Service
  public class DashboardServiceImpl implements DashboardService{


    private DashboardRepository dashboardRepository;


    @Autowired
    public DashboardServiceImpl(DashboardRepository dashboardRepository)
    {
        this.dashboardRepository=dashboardRepository;

    }

    @Override
    public List<Dashboard> findByUserId(int userid)
    {
        return dashboardRepository.findByUserId(userid);
    }

}

