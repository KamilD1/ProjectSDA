package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class CheckBoxesPage {
    WebDriver driver;
    public CheckBoxesPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//input")
    List<WebElement> inputList;

    public void clickRandomCheckbox(){
        Random random = new Random();
        int randomCheck = random.nextInt(inputList.size());

        inputList.get(randomCheck).click();
    }
    public void allCheckbox(){
        for (WebElement check : inputList){
            check.click();
        }

    }
}
