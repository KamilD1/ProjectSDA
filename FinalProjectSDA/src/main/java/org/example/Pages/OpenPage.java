package org.example.Pages;

import org.openqa.selenium.WebDriver;

public class OpenPage {
    WebDriver driver;
    public OpenPage(WebDriver driver){
        this.driver = driver;
    }
    public void openPage(String URL){
        driver.get(URL);
        driver.manage().window().maximize();

    }
}
