package ua.artcode.crm.model;

/**
 * Created by serhii on 14.08.16.
 */
public class Dev extends Worker {

    private Project[] projects;
    private Task[] myTasks;

    public Dev(String fullname, String email) {
        super(fullname,email);
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public Task[] getMyTasks() {
        return myTasks;
    }

    public void setMyTasks(Task[] myTasks) {
        this.myTasks = myTasks;
    }
}
