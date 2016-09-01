package com.common.Repository;

import com.common.model.Projects;
import com.common.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
public interface ProjectsRepository extends JpaRepository<Projects,Long>{

    @Query("select  p from Projects p where p.projectid=?1")
    public List<Projects> findByTProjectId(int projectid);
}
