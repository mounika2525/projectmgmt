package com.common.Repository;

import com.common.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mounika on 24/08/16.
 */
@Repository
public interface DashboardRepository extends JpaRepository<Dashboard,Long> {

@Query("select t from TIMESHEET_DETAIL t where t.userid=?1 and t.workday=sysdate")
    public List<Dashboard>findByUserId(@Param("userid") int userid);

}