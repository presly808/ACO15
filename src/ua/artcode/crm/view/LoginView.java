package ua.artcode.crm.view;

import ua.artcode.crm.controller.IManagerController;

import java.util.Scanner;

/**
 * Created by serhii on 20.08.16.
 */
public class LoginView {

    private Scanner sc;
    private IManagerController managerController;

    public LoginView(Scanner sc, IManagerController managerController) {
        this.sc = sc;
        this.managerController = managerController;
    }

    public void start(){

        showMenu();
        int choice = -1;
        while ((choice = Integer.parseInt(sc.nextLine())) != 0){
            if(choice == 1){
                showLoginMenu();
            }


            showMenu();
        }

    }

    private void showLoginMenu() {
        System.out.println("Input login");
        String login = sc.nextLine();
        System.out.println("Input pass");
        String pass = sc.nextLine();

        // check if user is in the system

        if("manager".equals(login)){
            ManagerView managerView = new ManagerView(sc,managerController);
            managerView.start();
        } else if("developer".equals(login)){

        }
    }

    private void showMenu(){
        System.out.println("1. Login");
        System.out.println("0. Exit");
    }


}
