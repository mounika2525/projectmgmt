package com.common.Service;

import com.common.model.Projects;
import com.common.model.Task;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
public interface ProjectsService {
    List<Projects> findByprojectId(int projectid);

    List<Projects> finAll();
}
