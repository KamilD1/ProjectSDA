package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankPage {
    WebDriver driver;
    public BankPage(WebDriver driver){
        this.driver= driver;
    }

    public void openBankPage() {
        driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
    }

    @FindBy(xpath = "//button[@ng-click='manager()']")
    WebElement bankButton;

    public void clickBankManagerLoginBtn(){
        bankButton.click();
    }


}
