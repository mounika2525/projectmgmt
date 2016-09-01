package com.common.Repository;

import com.common.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task,Long>
{

 @Query("select  t from Task t where t.taskid=?1")
public List<Task> findByTaskId(int taskid);
}
