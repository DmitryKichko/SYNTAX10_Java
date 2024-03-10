package com.collection.class26.Task2;

public class FileTester {


    public static void main(String[] args) {

        File file1 = new JavaFile();

        file1.open();
        file1.close();
        file1.edit();

        File file2 = new WordFile();

        file2.open();
        file2.close();
        file2.edit();

        File file3 = new PafFile();

        DowloadAble dowloadAble = new PafFile();   //для интерфейсов

        dowloadAble.downloadAble();

        File[] files = {new JavaFile(),new WordFile(), new PafFile()};

        for (File value : files){

            value.open();
            value.edit();
            value.close();

        }
        }
}
