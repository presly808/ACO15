package ua.artcode.crm.controller;

import ua.artcode.crm.model.Project;
import ua.artcode.crm.model.Task;

/**
 * Created by serhii on 20.08.16.
 */
public interface IManagerController extends IDeveloperController {

    Project createProject(long creatorId, String title, String desc);

    Task createTask(long creatorId, String title,
                    String desc, long executorId, int workHours);

    boolean assignTask(String taskId, long devId);



}
