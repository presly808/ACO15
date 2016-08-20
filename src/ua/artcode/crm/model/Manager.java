package ua.artcode.crm.model;

/**
 * Created by serhii on 14.08.16.
 */
public class Manager extends Worker {

    private Project[] projects;
    private Task[] createdTasks;

    public Manager(String fullname, String email) {
        super(fullname, email);
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public Task[] getCreatedTasks() {
        return createdTasks;
    }

    public void setCreatedTasks(Task[] createdTasks) {
        this.createdTasks = createdTasks;
    }
}
