package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class TablePage {
    WebDriver driver;
    public TablePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@ng-click='delUser()']")
    List<WebElement> delUserButtons;
    @FindBy(xpath = "//button[@class='btn ng-scope ng-binding btn-primary']")
    WebElement okButton;
    @FindBy(xpath = "//button[@type='add']")
    WebElement addButton;

    public void deleteRandomUser(){
        Random random = new Random();
        int randomUser = random.nextInt(delUserButtons.size());
        delUserButtons.get(randomUser).click();
        okButton.click();
    }
    public void clickAddUser(){
        addButton.click();
    }
}
