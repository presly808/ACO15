package ua.artcode.crm.run;

import ua.artcode.crm.db.AppDB;
import ua.artcode.crm.logic.BusinessLogicMethods;
import ua.artcode.crm.model.Dev;
import ua.artcode.crm.model.Manager;
import ua.artcode.crm.model.Project;

import java.util.Scanner;

/**
 * Created by serhii on 14.08.16.
 */
public class RunProgram {


    public static void main(String[] args) {
        AppDB appDB = new AppDB();
        appDB.addDev(new Dev("Ivan", "sdfsd"));
        appDB.addDev(new Dev("Yura", "2323"));
        appDB.addDev(new Dev("Rick", "234sfjjsd"));

        appDB.addManager(new Manager("Olya", "sdfsdfs"));
        appDB.addManager(new Manager("Ira", "sdfsdfs"));
        appDB.addManager(new Manager("Serafima", "sdfsdfs"));


        BusinessLogicMethods logicMethods = new BusinessLogicMethods(appDB);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your id");
        String ownerId = scanner.nextLine();
        System.out.println("Input project name");
        String projectName = scanner.nextLine();
        System.out.println("Input project description");
        String projectDesc = scanner.nextLine();

        Project created =
                logicMethods.createProject(Long.parseLong(ownerId),
                                            projectName, projectDesc);

        System.out.println(created.asString());


    }
}
