package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HepsiburadaBaseModel {

    By btnRemoteControlVehicle = By.xpath("//*[text()='Uzaktan Kumandalı Araçlar']/..");
    By btnBookMusicFilmHobby = By.xpath("//*[text()='Kitap, Müzik, Film, Hobi']/../..");
    By btnMyAccount = By.id("myAccount");
    By btnLogin = By.id("login");
    WebDriver driver;
    Actions builder;
    public HepsiburadaBaseModel(WebDriver driver){
        this.driver = driver;
        builder = new Actions(driver);
    }

    public void gotoHepsiburada(){
        try {
            driver.get("https://www.hepsiburada.com/");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void lvMyAccount(){
        WebElement element = driver.findElement(btnMyAccount);
        builder.moveToElement(element).build().perform();
    }

    public void lvBookMusicFilmHobby(){
        try {
            WebElement element = driver.findElement(btnBookMusicFilmHobby);
            builder.moveToElement(element).build().perform();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickRemoteControlVehicle(){
        try {
            driver.findElement(btnRemoteControlVehicle).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickLogin(){
        try {
            driver.findElement(btnLogin).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
