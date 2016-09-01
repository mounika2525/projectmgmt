package com.common.Controller;

import com.common.Repository.ProjectsRepository;
import com.common.model.Projects;
import com.common.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
@RestController
@RequestMapping(value = "/Projects")
public class ProjectsController {
    @Autowired
    private ProjectsRepository projectsRepository;


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/project/",method = RequestMethod.GET)
    public List<Projects> find(){

        return projectsRepository.findAll();
    }
}
