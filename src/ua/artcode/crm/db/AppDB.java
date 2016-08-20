package ua.artcode.crm.db;

import ua.artcode.crm.model.Dev;
import ua.artcode.crm.model.Manager;
import ua.artcode.crm.model.Project;
import ua.artcode.crm.model.Task;
import ua.artcode.crm.utils.Array;

import java.time.LocalDate;

/**
 * Created by serhii on 14.08.16.
 */
public class AppDB implements IAppDB {

    private Array projects = new Array();

    private Array managers = new Array();

    private Array devs = new Array();

    @Override
    public Project addProject(Project project) {
        LocalDate now = LocalDate.now();
        String projectId = project.getTitle() + "-"
                + now.getMonth() + now.getDayOfMonth();

        project.setId(projectId);
        projects.add(project);

        return project;
    }

    @Override
    public Dev addDev(Dev dev) {
        return null;
    }

    @Override
    public Manager addManager(Manager manager) {
        return null;
    }

    @Override
    public Dev getDev(long id) {
        return null;
    }

    @Override
    public Manager getManager(long id) {
        return null;
    }

    @Override
    public Project getProject(String projectId) {
        Object[] objects = projects.getAll();

        for (int i = 0; i < objects.length; i++) {
            Object el = objects[i];
            Project project = (Project) el;

            if(project.getId().equals(projectId)){
                return project;
            }
        }

        return null;
    }

    @Override
    public Task[] getAll() {
        return null;
    }

    @Override
    public Project[] getProjects() {

        Object[] objects = projects.getAll();
        Project[] projectsRet = new Project[objects.length];

        for (int i = 0; i < objects.length; i++) {
            projectsRet[i] = (Project) objects[i];
        }

        return projectsRet;
    }

    @Override
    public Manager[] getManagers() {

        Object[] objects = managers.getAll();
        Manager[] projectsRet = new Manager[objects.length];

        System.arraycopy(objects,0,projectsRet,0,objects.length);

        return projectsRet;
    }

    @Override
    public Dev[] getDevs() {
        return null;
    }

}
