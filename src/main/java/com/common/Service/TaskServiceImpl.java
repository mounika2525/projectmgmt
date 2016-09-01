package com.common.Service;

import com.common.Repository.TaskRepository;
import com.common.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
@Transactional(readOnly=true)
@Service
public class TaskServiceImpl implements TaskService {
@Autowired
    private TaskRepository taskRepository;


    @Override
    public List<Task> findByTaskId(int taskid)
    {
        return taskRepository.findByTaskId(taskid);
    }

    @Override
    public List<Task> finAll() {
        return null;
    }


}
