package com.common.Service;

import com.common.model.Dashboard;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by mounika on 24/08/16.
 */
public interface DashboardService {
    public List<Dashboard> findByUserId(int userid);
}
