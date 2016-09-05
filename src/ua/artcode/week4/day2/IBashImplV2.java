package ua.artcode.week4.day2;

import ua.artcode.task.week4.IBash;

import java.io.*;
import java.util.List;

/**
 * Created by serhii on 28.08.16.
 */
public class IBashImplV2 implements IBash {
    @Override
    public String less(String path) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        try {
            String line = null;
            while((line = reader.readLine()) != null){
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    @Override
    public void writeInto(String path, String content) throws FileNotFoundException {

    }

    @Override
    public void appendTo(String path, String content) throws FileNotFoundException {

    }

    @Override
    public List<String> ls(String currentDirPath) {
        return null;
    }

    @Override
    public boolean touch(String path) {
        return false;
    }

    @Override
    public boolean delete(String path) {
        return false;
    }

    @Override
    public List<String> grep(String src, String keyWord) {
        

        return null;
    }
}
