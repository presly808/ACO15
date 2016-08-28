package ua.artcode.week4.day2;

import java.io.FileNotFoundException;
import java.util.List;

public interface IBash {

    // show file content
    String less(String path) throws FileNotFoundException;

    void writeInto(String path, String content) throws FileNotFoundException;

    void appendTo(String path, String content) throws FileNotFoundException;

    // show files in current directory
    List<String> ls(String currentDirPath);
    // use File
    // create new file
    boolean touch(String path);

    boolean delete(String path);

    List<String> grep(String src, String keyWord);

}
