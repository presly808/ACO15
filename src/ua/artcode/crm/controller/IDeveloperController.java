package ua.artcode.crm.controller;

import ua.artcode.crm.model.Task;

/**
 * Created by serhii on 20.08.16.
 */
public interface IDeveloperController {

    Task[] getExecutorTasks(long executorId);

    Task[] filter(long ownerId, long executorId,
                  String projectId, int statusCode,
                  String startDate, String endDate);

    Task getTaskById(String taskId);

    boolean changeStatus(String taskId, int statusCode);

}
