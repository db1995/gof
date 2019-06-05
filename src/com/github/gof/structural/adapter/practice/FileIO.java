package com.github.gof.structural.adapter.practice;

import java.io.IOException;

/**
 * @author db1995
 * @description 操作文件输入输出
 */
public interface FileIO {
    void readFromFile(String fileName) throws IOException;
    void writeToFile(String fileName) throws IOException;
    void setValue(String key, String value);
    String getValue(String key);
}
