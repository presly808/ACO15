package ua.artcode.crm.run;

import ua.artcode.crm.db.AppDB;
import ua.artcode.crm.db.IAppDB;
import ua.artcode.crm.controller.IManagerController;
import ua.artcode.crm.controller.ManagerControllerImpl;
import ua.artcode.crm.model.Dev;
import ua.artcode.crm.model.Manager;
import ua.artcode.crm.model.Project;
import ua.artcode.crm.view.LoginView;

import java.util.Scanner;

/**
 * Created by serhii on 14.08.16.
 */
public class RunProgram {


    public static void main(String[] args) {
        IAppDB appDB = new AppDB();
        appDB.addDev(new Dev("Ivan", "sdfsd"));
        appDB.addDev(new Dev("Yura", "2323"));
        appDB.addDev(new Dev("Rick", "234sfjjsd"));
        appDB.addManager(new Manager("Ira", "sdfsdfs"));
        appDB.addManager(new Manager("Serafima", "sdfsdfs"));


        IManagerController managerController = new ManagerControllerImpl(appDB);

        LoginView loginView =
                new LoginView(new Scanner(System.in),managerController);
        loginView.start();


    }
}
