package com.collection.class26.Task2;
/*
- Создайте класс File, который будет иметь следующие типы поведения:
   open, edit, close.
- Edit и close являются реализованными методами,
  а open - абстракцией.
- Создать 3 подкласса:
 JavaFile, WordFile, PafFile, которые будут обеспечивать конкретную реализацию поведения open:
- Например: для открытия java-файла нам нужен Notepadt+ или Sublime Text,
для открытия .doc-файла нам нужен установленный Microsoft word и т.д.
 */
public abstract class File {

    private String make;
    String model;
    abstract void open();
    void edit(){
        System.out.println("edit");
    }
    void close(){
        System.out.println("close");
    }
}

class JavaFile extends File{

    @Override
    void open() {
        System.out.println("для открытия java-файла нам нужен Notepadt+");
    }
}

class WordFile extends File{

    @Override
    void open() {
        System.out.println("для открытия .doc-файла нам нужен установленный Microsoft word");
    }
}

class PafFile extends File implements UploadAble, DowloadAble{

    @Override
    void open() {
        System.out.println("что-то еще");
    }

    @Override
    public void downloadAble() {
        System.out.println("скачать файл");
    }

    @Override
    public void upload() {
        System.out.println("обновить файл");
    }
}
