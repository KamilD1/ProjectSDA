package org.example.Main;


import org.example.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kamil\\Desktop\\sda Tester\\java\\FinalProjectSDA\\Chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);



        CalcPage calcPage = PageFactory.initElements(driver, CalcPage.class);
        AddCustomerPage addCustomerPage= PageFactory.initElements(driver, AddCustomerPage.class);
        CheckBoxesPage checkBoxesPage = PageFactory.initElements(driver, CheckBoxesPage.class);
        OpenPage openPage = PageFactory.initElements(driver, OpenPage.class);
        TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
        NewUserTable newUserTable=PageFactory.initElements(driver, NewUserTable.class);



        openPage.openPage("https://www.way2automation.com/angularjs-protractor/calc/");
        calcPage.sendFirstNumber("2");
        calcPage.selectBar("+");
        calcPage.sendSecondNumber("4");
        calcPage.clickButtonGo();
        calcPage.getResult();

        openPage.openPage("https://www.way2automation.com/angularjs-protractor/checkboxes/");
        checkBoxesPage.clickRandomCheckbox();
        checkBoxesPage.allCheckbox();

        openPage.openPage("https://www.way2automation.com/angularjs-protractor/webtables/");
        tablePage.deleteRandomUser();
        tablePage.clickAddUser();
        newUserTable.addNewUser("Jan","Nowak","JNowak","password","random@email.com","1234567890");



        openPage.openPage("https://www.way2automation.com/angularjs-protractor/banking/#/login");
        addCustomerPage.clickBankManagerLoginBtn();
        addCustomerPage.sendCustomerData("Jan","Nowak","01-234");



    }



}
