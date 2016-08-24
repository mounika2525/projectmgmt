package com.common.Repository;

import com.common.model.TimesheetWeekly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mounika on 24/08/16.
 */
@Repository
public interface TimesheetWeeklyRepository extends JpaRepository<TimesheetWeekly,Long> {

}
