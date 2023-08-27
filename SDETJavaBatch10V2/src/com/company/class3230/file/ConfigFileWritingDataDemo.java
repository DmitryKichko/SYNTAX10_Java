package com.company.class3230.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWritingDataDemo {
    public static void main(String[] args) throws IOException {
        //Путь, где я хочу создать файл на моем компьютере
        String path = "/Users/dmitrykicko/IdeaProjects/SDETJavaBatch10V2/Files/Config1.properties";
        // Перейдите по пути и создайте новый файл
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //открытие конкретной программы и размещение данных
        Properties properties = new Properties();
        properties.put("URL", "www.google.com");
        //сохранение изменений в этом файле
        properties.store(fileOutputStream, "new data added");

    }
}
