package ua.artcode.week4.day2;

import ua.artcode.task.week4.IBash;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by serhii on 28.08.16.
 */
public class TestIBash {


    public static final String FILE_PATH = "/home/serhii/dev/IdeaProjects/ACO15/home/week1.txt";

    public static void main(String[] args) {
        IBash iBash = new IBashImpl();

        try {

            byte[] arr = Files.readAllBytes(new File(FILE_PATH).toPath());
            String expected = new String(arr);

            String actual =
                    iBash.less(FILE_PATH);

            System.out.printf("result %s", expected.equals(actual));
            System.out.println(actual);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
