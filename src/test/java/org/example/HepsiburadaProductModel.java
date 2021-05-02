package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HepsiburadaProductModel {

    By txtProductInput = By.xpath("//*[@id='SearchBoxOld']//input");
    By btnProduct = By.xpath("//*[@class='box product']/a");
    By btnFirstProduct = By.xpath("//*[@class='box product']/a[@data-position='1']");
    By btnAddToCart = By.id("addToCart");
    By btnTxtAddToCart = By.xpath("//*[text()='Sepete Ekle']/..");
    By btnMerchantList = By.xpath("//*[@class='merchantList']//button");
    By btnOtherCategories = By.xpath("//*[text()='Diğer Kategoriler']");
    By btnDronePart = By.xpath("//a[contains(text(),'Drone Yedek Parçaları')]");
    Actions builder;
    WebDriver driver;
    List<WebElement> result;

    public HepsiburadaProductModel(WebDriver driver){
        this.driver = driver;
        builder = new Actions(driver);
    }

    public void setTxtProductInput(String name){
        driver.findElement(txtProductInput).sendKeys(name);
        driver.findElement(txtProductInput).sendKeys(Keys.ENTER);
    }

    public void clickOtherCategories(){
        driver.findElement(btnOtherCategories).click();
    }

    public void clickDronePart(){
        try {
            driver.findElement(btnDronePart).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveToProduct(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        WebElement element = driver.findElement(btnFirstProduct);
        builder.moveToElement(element).build().perform();
    }

    public void clickTxtAddToCart(){
        driver.findElement(btnTxtAddToCart).click();
    }

    public void clickProduct(){
        try {
            Thread.sleep(3000);
            result = driver.findElements(btnProduct);
            result.get(0).click();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickAddToChart(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
        driver.findElement(btnAddToCart).click();
    }

    public void clickMerchanList(){
        result = driver.findElements(btnMerchantList);
        result.get(0).click();
    }
}
