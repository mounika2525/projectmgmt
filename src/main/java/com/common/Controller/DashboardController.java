package com.common.Controller;

import com.common.Repository.DashboardRepository;
import com.common.model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mounika on 24/08/16.
 */
@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    private DashboardRepository dashboardRepository;
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/userid/", method = RequestMethod.GET)
    public List<Dashboard> find()
    {
        return dashboardRepository.findAll();
    }
}
