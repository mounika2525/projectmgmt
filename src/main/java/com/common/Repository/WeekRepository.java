package com.common.Repository;

import com.common.model.TimesheetWeekly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by mounika on 02/09/16.
 */
@Repository
public interface WeekRepository extends JpaRepository<TimesheetWeekly,Long> {

@Query("select w from TimesheetWeekly w " + " where w.weekstartdate between ?1 and ?2 and w.weekenddate between ?1 and ?2")
    List<TimesheetWeekly> findByWeek(@Temporal(TemporalType.DATE) Date weekstartdate, @Temporal(TemporalType.DATE) Date weekenddate);
}
