package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class AddCustomerPage {
    WebDriver driver;
    public AddCustomerPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath ="//button[@ng-class='btnClass1']")
    WebElement addCustomerBtn;
    @FindBy(xpath = "//input[@ng-model='fName']")
    WebElement fName;
    @FindBy(xpath = "//input[@ng-model='lName']")
    WebElement lName;
    @FindBy(xpath = "//input[@ng-model='postCd']")
    WebElement postCd;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement confirmBtn;
    @FindBy(xpath = "//button[@ng-click='manager()']")
    WebElement bankButton;

    public void clickBankManagerLoginBtn(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bankButton.click();
    }
    public void sendCustomerData(String yourFName, String yourLName, String yourPostCode){
        addCustomerBtn.click();
        fName.sendKeys(yourFName);
        lName.sendKeys(yourLName);
        postCd.sendKeys(yourPostCode);
        confirmBtn.click();
    }
}
