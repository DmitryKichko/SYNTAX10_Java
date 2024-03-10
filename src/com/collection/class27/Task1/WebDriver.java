package com.collection.class27.Task1;
/*
Создайте интерфейс WebDriver, который будет иметь следующие нереализованные поведения:
openBrowser, closeBrowser0, maximizeWindow0, findElement.
Создайте 2 класса, реализующих интерфейс WebDriver:
ChromeDriver и FirefoxDriver.
 */
public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Отройте Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Закройте Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Откройте на полный экран Google Chrome окно");
    }

    @Override
    public void findElement() {
        System.out.println("Найдите элементы в Google Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Отройте Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Закройте Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Откройте на полный экран Firefox окно");
    }

    @Override
    public void findElement() {
        System.out.println("Найдите элементы в Firefox");
    }
}
