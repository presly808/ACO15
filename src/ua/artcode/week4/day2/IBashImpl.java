package ua.artcode.week4.day2;

import ua.artcode.task.week4.IBash;

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

            while ((singleCharCode = reader.read()) != -1) {
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
    public boolean copy(String src, String dest) {
        return false;
    }

    @Override
    public List<String> grep(String src, String keyWord) {

        StringReader stringReader = new StringReader(src);
        LineNumberReader lineNumberReader = new LineNumberReader(stringReader);


        return null;
    }

    @Override
    public Object clone(Object obj) {
        return null;
    }

    @Override
    public byte[] toByteArr(Object obj) {
        return new byte[0];
    }

    @Override
    public Object fromByteArr(byte[] arr) {
        return null;
    }

    @Override
    public Object cloneDeep(Object obj) {
        return null;
    }

    @Override
    public void saveObjToFile(Object obj, String filePath) {

    }

    @Override
    public void downloadFile(String url, String localPathName) {

    }

    @Override
    public List<String> find(File dir, String keyWord) {
        return null;
    }
}
