package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewUserTable {
    WebDriver driver;
    public NewUserTable(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath = "//input[@name='FirstName']")
    WebElement firstNameInput;
    @FindBy(xpath = "//input[@name='LastName']")
    WebElement lastNameInput;
    @FindBy(xpath = "//input[@name='UserName']")
    WebElement userNameInput;
    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordInput;
    @FindBy(xpath = "//input[@type='radio']")
    WebElement customerInput;
    @FindBy(xpath = "//select")
    WebElement roleSelect;
    @FindBy(xpath = "//input[@name='Email']")
    WebElement emailInput;
    @FindBy(xpath = "//input[@name='Mobilephone']")
    WebElement mobileInput;
    @FindBy(xpath = "//button[@ng-click='save(user)']")
    WebElement saveButton;


    public void addNewUser(String firstName, String lastName, String userName, String password, String email, String phone){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        customerInput.click();
        emailInput.sendKeys(email);
        roleSelect.click();
        mobileInput.sendKeys(phone);
        Select select = new Select(roleSelect);
        select.selectByVisibleText("Sales Team");
        saveButton.click();
    }
}
