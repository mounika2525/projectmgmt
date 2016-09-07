package com.common.Repository;

import com.common.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 07/09/16.
 */
@Repository
public interface TodayRepository extends JpaRepository<Dashboard,Long>{

    @Query("select t from Dashboard t where t.workday=?1")
    List<Dashboard>findbydate(@Param("workday") Date workday);


}
