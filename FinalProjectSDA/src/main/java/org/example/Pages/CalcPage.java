package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CalcPage {
    WebDriver driver;
    public CalcPage(WebDriver driver){
        this.driver = driver;

    }
    @FindBy(xpath = "//input[@ng-model='first']")
    WebElement inputFirstNumber;
    @FindBy(xpath= "//select")
    WebElement selectElement;
    @FindBy(xpath = "//input[@ng-model='second']")
    WebElement inputSecondNumber;
    @FindBy(xpath = "//button[@ng-click='doAddition()']")
    WebElement buttonGo;
    @FindBy(xpath = "//h2[@class='ng-binding']")
    WebElement result;

    public void sendFirstNumber(String number){
        inputFirstNumber.sendKeys(number);
    }

    public void selectBar(String operation){
        selectElement.click();
        Select select = new Select(selectElement);
        select.selectByVisibleText(operation);
    }
    public void sendSecondNumber(String number){
        inputSecondNumber.sendKeys(number);
    }
    public void clickButtonGo(){
        buttonGo.click();
    }
    public void getResult(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        System.out.println(result.getText());

    }
}
