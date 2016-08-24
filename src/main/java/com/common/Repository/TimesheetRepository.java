package com.common.Repository;

import com.common.model.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mounika on 23/08/16.
 */
@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet,Long>{


}
