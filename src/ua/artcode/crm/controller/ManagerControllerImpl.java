package ua.artcode.crm.controller;

import ua.artcode.crm.db.IAppDB;
import ua.artcode.crm.model.Project;
import ua.artcode.crm.model.Task;

/**
 * Created by serhii on 14.08.16.
 */
public class ManagerControllerImpl implements IManagerController {

    private IAppDB appDB;

    public ManagerControllerImpl(IAppDB appDB) {
        this.appDB = appDB;
    }

    public Project createProject(long creatorId, String title, String desc) {

        Project project = new Project(title, desc);
        Project created = appDB.addProject(project);

        return created;
    }

    public Task createTask(long creatorId, String title,
                                  String desc, long executorId, int workHours){

        return null;
    }

    public  boolean assignTask(String taskId, long devId){
        return false;
    }

    public  Task[] getExecutorTasks(long executorId){
        return null;
    }

    public  Task[] getProjectTasks(long projectId){
        return null;
    }

    // 23, 34, ABC-23
    // -1, -1,
    public  Task[] filter(long ownerId, long executorId,
                                String projectId, int statusCode,
                                String startDate, String endDate){
        return null;
    }

    public  Task getTaskById(String taskId){
        return null;
    }

    public  boolean changeStatus(String taskId, int statusCode){
        return false;
    }


}
