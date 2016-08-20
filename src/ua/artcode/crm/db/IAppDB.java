package ua.artcode.crm.db;

import ua.artcode.crm.model.Dev;
import ua.artcode.crm.model.Manager;
import ua.artcode.crm.model.Project;
import ua.artcode.crm.model.Task;

/**
 * Created by serhii on 20.08.16.
 */
public interface IAppDB {
    Project addProject(Project project);

    Dev addDev(Dev dev);

    Manager addManager(Manager manager);

    Dev getDev(long id);

    Manager getManager(long id);

    Project getProject(String projectId);

    Task[] getAll();

    Project[] getProjects();

    Manager[] getManagers();

    Dev[] getDevs();
}
