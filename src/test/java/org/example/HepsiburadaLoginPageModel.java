package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HepsiburadaLoginPageModel {

    By txtUserName = By.id("txtUserName");
    By txtPassword = By.id("txtPassword");
    By btnLogin = By.id("btnLogin");
    WebDriver driver;

    public HepsiburadaLoginPageModel(WebDriver driver){
        this.driver = driver;
    }

    public void setTxtUserName(String name){
        driver.findElement(txtUserName).sendKeys(name);
    }

    public void setTxtPassword(String password){
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickBtnLogin(){
        try {
            driver.findElement(btnLogin).click();
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
