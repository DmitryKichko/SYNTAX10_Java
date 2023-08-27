package com.company.class3230.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadingDemo1 {
    public static void main(String[] args) throws IOException {
        //местоположение файла
        String path = "/Users/dmitrykicko/IdeaProjects/SDETJavaBatch10V2/Files/Config.properties";
        //создание связи между классом или навигация к этому файлу
        FileInputStream fileInputStream = new FileInputStream(path);
        //выбор программы для открытия этого файла
        Properties properties = new Properties();
        //открытие файла
        properties.load(fileInputStream);
        //Чтение данных
        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));


    }
}
