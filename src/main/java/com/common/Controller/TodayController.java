package com.common.Controller;

import com.common.Service.TodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mounika on 07/09/16.
 */
@RestController
@RequestMapping(value = "/project_mgmt")
public class TodayController {
    private TodayService todayService;

@Autowired
    public TodayController(TodayService todayService) {
        this.todayService = todayService;
    }


    @RequestMapping(value = "/tday/",method = RequestMethod.GET)

    public String toDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date).toString();
    }

}
