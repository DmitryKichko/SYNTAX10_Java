package com.company.class2624.task2;

public abstract class File {
    /*
    2) Create a class File that will have the following behaviors;
    open, edit, close. Edit and close are implemented method while
    open is an abstract. Create 3 subclasses: JavaFile, WordFile,
    PdFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc
    file we need Microsoft word to be installed etc

    2) Создайте класс File, который будет иметь следующие модели поведения;
    открыть, редактировать, закрыть. Редактирование и закрытие являются реализованными методами, в то время как
    open является абстракцией. Создайте 3 подкласса: JavaFile, WordFile,
    PdFile, которые будут обеспечивать конкретную реализацию поведения open:
    Пример: для открытия .java файла нам нужен Notepad++ или Sublime Text, для открытия .doc файла нам нужен Microsoft word и т.д.
    для открытия .doc файла нам нужен установленный Microsoft word и т.д.
     */
    abstract void open();

    void edit() {
        System.out.println("Editing the file");
    }
    void close() {
        System.out.println("File closed");
    }
}
class JavaFile extends File{
    void open(){
        System.out.println("Use Intellij To open this file");
    }
}
class PDFFile extends File implements UploadAble,DownloadAble{
    void open(){
        System.out.println("Use Adobe PDF To open this file");
    }

    @Override
    public void upload() {
        System.out.println("You can download this file as well");
    }

    @Override
    public void downloadAble() {
        System.out.println("Download the file");
    }
}
class WordFile extends File{
    void open(){
        System.out.println("Use MS Word To open this file");
    }
}

