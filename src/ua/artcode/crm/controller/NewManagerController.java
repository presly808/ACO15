package ua.artcode.crm.controller;

import ua.artcode.crm.db.IAppDB;
import ua.artcode.crm.model.Project;
import ua.artcode.crm.model.Task;

/**
 * Created by serhii on 20.08.16.
 */
public class NewManagerController implements IManagerController {
    public NewManagerController(IAppDB appDB) {
    }

    @Override
    public Project createProject(long creatorId, String title, String desc) {
        return null;
    }

    @Override
    public Task createTask(long creatorId, String title, String desc, long executorId, int workHours) {
        return null;
    }

    @Override
    public boolean assignTask(String taskId, long devId) {
        return false;
    }

    @Override
    public Task[] getExecutorTasks(long executorId) {
        return new Task[0];
    }

    @Override
    public Task[] filter(long ownerId, long executorId, String projectId, int statusCode, String startDate, String endDate) {
        return new Task[0];
    }

    @Override
    public Task getTaskById(String taskId) {
        return null;
    }

    @Override
    public boolean changeStatus(String taskId, int statusCode) {
        return false;
    }
}
