package com.collection.class25.polimorphismdemo;

public class Tester {

    public static void main(String[] args) {

        WebDriver [] drivers = {new GoogleChrome(), new FireFox(), new Safari()};

        for (WebDriver driver : drivers) {

            testOnAllBrowsers(driver);
        }
    }

    static void  testOnAllBrowsers(WebDriver driver){
        driver.openBrowser();
        driver.loadWebsite("www.google.com");
        driver.Test1();
        driver.Test2();
        driver.TestFileDowload();
        driver.closeBrowser();
    }
}
