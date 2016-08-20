package ua.artcode.crm.view;

import ua.artcode.crm.controller.IManagerController;
import ua.artcode.crm.model.Project;

import java.util.Scanner;

/**
 * Created by serhii on 20.08.16.
 */
public class ManagerView {

    private Scanner sc;
    private IManagerController managerController;

    public ManagerView(Scanner sc, IManagerController iManagerController) {
        this.sc = sc;
        this.managerController = iManagerController;
    }

    public void start(){
        showMainMenu();
        int choice = -1;
        while ((choice = Integer.parseInt(sc.nextLine())) != 0){
            if(choice == 1){
                addProjectMenu();
            }

            showMainMenu();
        }
    }

    private void addProjectMenu() {
        System.out.println("Input your id");
        String ownerId = sc.nextLine();
        System.out.println("Input project name");
        String projectName = sc.nextLine();
        System.out.println("Input project description");
        String projectDesc = sc.nextLine();

        Project created =
                managerController.createProject(Long.parseLong(ownerId),
                        projectName, projectDesc);

        System.out.println(created.asString());
    }

    private void showMainMenu(){
        System.out.println("1.Add project");
        System.out.println("2.Get projects");
        System.out.println("3.Add Task");
        System.out.println("4.Assign Task");
        System.out.println("5.Get All Task");
        System.out.println("6.Get task by id");
    }

}
