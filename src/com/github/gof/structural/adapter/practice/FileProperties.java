package com.github.gof.structural.adapter.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author db1995
 * @description 将属性集合保存至文件中
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }
    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName), "written by FileProperties");
    }
    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }
    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
