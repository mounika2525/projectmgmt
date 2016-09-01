package com.common.Controller;

import com.common.Repository.DashboardRepository;
import com.common.Service.DashboardService;
import com.common.model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 24/08/16.
 */
@RestController
@RequestMapping(value = "/dashboard")
public class DashboardController {

   // private DashboardRepository dashboardRepository;
    private DashboardService dashboardService;


//    @Autowired
//    public DashboardController(DashboardRepository dashboardRepository,DashboardService dashboardService) {
//        this.dashboardRepository = dashboardRepository;
//        this.dashboardService=dashboardService;
//
//    }

    @Autowired
    public DashboardController(DashboardService dashboardService) {
        this.dashboardService=dashboardService;

    }



    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/user/{userid}/{workday}", method = RequestMethod.GET)
    public List<Dashboard> getByUserId(@PathVariable int userid,@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date workday) {

        return dashboardService.findByUserId(userid,workday);

    }

}