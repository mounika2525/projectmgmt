package com.common.Service;

import com.common.model.Dashboard;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 07/09/16.
 */
public interface TodayService {
    List<Dashboard> findbydate(Date workday);
}
