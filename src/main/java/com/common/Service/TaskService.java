package com.common.Service;

import com.common.model.Task;

import java.util.List;

/**
 * Created by mounika on 01/09/16.
 */
public interface TaskService {
    List<Task> findByTaskId(int taskid);

    List<Task> finAll();
}
