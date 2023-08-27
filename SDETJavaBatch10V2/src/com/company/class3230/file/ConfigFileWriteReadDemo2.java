package com.company.class3230.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteReadDemo2 {
    public static void main(String[] args) throws IOException {
        String readPath = "/Users/dmitrykicko/IdeaProjects/SDETJavaBatch10V2/Files/Config1.properties";
        String writePath = "/Users/dmitrykicko/IdeaProjects/SDETJavaBatch10V2/Files/Config.properties";

        FileInputStream fileInputStream = new FileInputStream(readPath);
        FileInputStream fileInputStream1 = new FileInputStream(writePath);

       /* String arr = {"hi"};
        main(arr);*/
        Properties properties1 = new Properties();
        properties1.load(fileInputStream1);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String URL = properties.get("URL").toString();

        properties1.put("URL", URL);
        FileOutputStream fileOutputStream = new FileOutputStream(writePath);
        properties1.store(fileOutputStream, "Some Comments");


    }
}
