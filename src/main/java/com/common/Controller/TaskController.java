package com.common.Controller;

import com.common.Repository.TaskRepository;
import com.common.Service.TaskService;
import com.common.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
@RestController
@RequestMapping(value = "/project_mgmt")
public class TaskController {
@Autowired
    private TaskRepository taskRepository;



    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/task/",method = RequestMethod.GET)
    public List<Task> find(){

        return taskRepository.findAll();
    }

}
