import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import org.example.HepsiburadaBaseModel;
import org.example.HepsiburadaLoginPageModel;
import org.example.HepsiburadaProductModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {
    WebDriver driver;
    HepsiburadaBaseModel hepsiburadaBaseModel;
    HepsiburadaProductModel hepsiburadaOperation;
    HepsiburadaLoginPageModel hepsiburadaLoginPage;
    HepsiburadaProductModel hepsiburadaProductModel;

    @BeforeScenario
    public void akbankSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome-driver\\chromedriver_win32\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().deleteAllCookies();
        hepsiburadaBaseModel = new HepsiburadaBaseModel(driver);
        hepsiburadaLoginPage = new HepsiburadaLoginPageModel(driver);
        hepsiburadaOperation = new HepsiburadaProductModel(driver);
        hepsiburadaProductModel = new HepsiburadaProductModel(driver);
    }

    @Step("Enter Hepsiburada Home Page;")
    public void gotoAkbank() {
        hepsiburadaBaseModel.gotoHepsiburada();
    }

    @Step("Move To My Account")
    public void lvMyAccount(){
        hepsiburadaBaseModel.lvMyAccount();
    }

    @Step("Move To Book, Music, Film, Hobby")
    public void lvBookMusicFilmHobby(){
        hepsiburadaBaseModel.lvBookMusicFilmHobby();
    }

    @Step("Click Remote Control Vehicle")
    public void clickRemoteControlVehicle(){
        hepsiburadaBaseModel.clickRemoteControlVehicle();
    }

    @Step("Click Other Categories")
    public void clickOtherCategories(){
        hepsiburadaProductModel.clickOtherCategories();
    }

    @Step("Click Drone Part")
    public void clickDronePart(){
        hepsiburadaProductModel.clickDronePart();
    }

    @Step("Move To Product")
    public void moveToProduct(){
        hepsiburadaProductModel.moveToProduct();
    }

    @Step("Click Login")
    public void clickLogin(){
        hepsiburadaBaseModel.clickLogin();
    }

    @Step("Set User Name <key>")
    public void setTxtUserName(String key){
        hepsiburadaLoginPage.setTxtUserName(key);
    }

    @Step("Set Password <key>")
    public void setTxtPassword(String key){
        hepsiburadaLoginPage.setTxtPassword(key);
    }

    @Step("Click btnLogin")
    public void clickBtnLogin(){
        hepsiburadaLoginPage.clickBtnLogin();
    }

    @Step("Set Search Product <key>")
    public void setTxtProductInput(String key){
        hepsiburadaProductModel.setTxtProductInput(key);
    }

    @Step("Click Product")
    public void clickProduct(){
        hepsiburadaProductModel.clickProduct();
    }

    @Step("Click Add To Chart")
    public void clickAddToChart(){
        hepsiburadaProductModel.clickAddToChart();
    }

    @Step("Click Txt Add To Cart")
    public void clickTxtAddToCart(){
        hepsiburadaProductModel.clickTxtAddToCart();
    }

    @Step("Click Add To MerchanList")
    public void clickMerchanList(){
        hepsiburadaProductModel.clickMerchanList();
    }
}
