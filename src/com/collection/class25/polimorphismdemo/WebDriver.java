package com.collection.class25.polimorphismdemo;

public class WebDriver {

    void openBrowser() {
        System.out.println("Откройте браузер");
    }

    void loadWebsite(String website) {
        System.out.println("Загрузка веб-сайта в браузер");
    }

    void Test1() {
        System.out.println("Введите информацию для входа в систему и проверьте, можете ли вы войти в систему");
    }

    void Test2() {
        System.out.println("Нажмите на кнопку 'Купить' и убедитесь, что вы можете оформить заказ");
    }

    void TestFileDowload() {
        System.out.println("Протестируйте файл загрузки");
    }

    void closeBrowser() {
        System.out.println("Закройте браузер");
    }
}
    class GoogleChrome extends WebDriver {
        void openBrowser() {
            System.out.println("Откройте браузер Google Chrome");
        }

        void loadWebsite(String website) {
            System.out.println("Загрузка веб-сайта в браузер используя Google Chrome");
        }

        void Test1() {
            System.out.println("Введите информацию для входа в систему и проверьте, можете ли вы войти в систему через Google Chrome");
        }

        void Test2() {
            System.out.println("Нажмите на кнопку 'Купить' и убедитесь, что вы можете оформить заказ в Google Chrome");
        }

        void TestFileDowload() {
            System.out.println("Протестируйте файл загрузки в Google Chrome");
        }

        void closeBrowser() {
            System.out.println("Закройте браузер Google Chrome");
        }
    }
        class FireFox extends WebDriver{
            void openBrowser(){
                System.out.println("Откройте браузер FireFox");
            }

            void loadWebsite(String website){
                System.out.println("Загрузка веб-сайта в браузер используя FireFox");
            }

            void Test1(){
                System.out.println("Введите информацию для входа в систему и проверьте, можете ли вы войти в систему через FireFox");
            }

            void Test2(){
                System.out.println("Нажмите на кнопку 'Купить' и убедитесь, что вы можете оформить заказ в FireFox");
            }

            void TestFileDowload(){
                System.out.println("Протестируйте файл загрузки в FireFox");
            }
            void closeBrowser(){
                System.out.println("Закройте браузер FireFox");
            }
        }
        class Safari extends WebDriver{
            void openBrowser(){
                System.out.println("Откройте браузер Safari");
            }

            void loadWebsite(String website){
                System.out.println("Загрузка веб-сайта в браузер используя Safari");
            }

            void Test1(){
                System.out.println("Введите информацию для входа в систему и проверьте, можете ли вы войти в систему через Safari");
            }

            void Test2(){
                System.out.println("Нажмите на кнопку 'Купить' и убедитесь, что вы можете оформить заказ в Safari");
            }

            void TestFileDowload(){
                System.out.println("Протестируйте файл загрузки в Safari");
            }
            void closeBrowser(){
                System.out.println("Закройте браузер Safari");
            }
        }


