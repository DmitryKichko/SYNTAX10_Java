package com.company.class2725.task;

public interface WebDriver {
    /*
    1. Create a WebDriver Interface that will have the following
    unimplemented behavior: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement(). Crate 2 classes that
    implements WebDriver interface: ChromeDriver and FirefoxDriver.
    1. Создайте интерфейс WebDriver, который будет иметь следующие
    нереализованное поведение: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement(). Создайте 2 класса, которые
    реализуют интерфейс WebDriver: ChromeDriver и FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Google chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in Google Chrome");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open FireFox browser ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close FireFox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize FireFox window");
    }

    @Override
    public void findElement() {
        System.out.println("Find elements in FireFox");
    }
}