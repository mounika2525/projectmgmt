package com.common.Service;

import com.common.Repository.ProjectsRepository;
import com.common.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
@Service
public class ProjectsServiceImpl implements ProjectsService{
    @Autowired
    private ProjectsRepository projectsRepository;

    @Override
    public List<Projects> findByprojectId(int projectid) {
        return projectsRepository.findByTProjectId(projectid);
    }

    @Override
    public List<Projects> finAll() {
        return null;
    }
}
