package ua.artcode.week4.day2;

import java.io.*;
import java.util.List;

/**
 * Created by serhii on 28.08.16.
 */
public class IBashImpl implements IBash {


    @Override
    public String less(String path) throws FileNotFoundException {
        Reader reader = new FileReader(path);
        String res = "";

        try {
            int singleCharCode = -1;

            while ((singleCharCode = reader.read()) != -1){
                res += (char) singleCharCode;
            }

            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res;
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

        StringReader stringReader = new StringReader(src);
        LineNumberReader lineNumberReader = new LineNumberReader(stringReader);


        return null;
    }
}
