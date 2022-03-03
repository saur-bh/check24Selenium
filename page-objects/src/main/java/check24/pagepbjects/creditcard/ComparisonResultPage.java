package check24.pagepbjects.creditcard;

import check24.framework.core.BasePage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Instant;


public class ComparisonResultPage extends BasePage {

    @FindBy(xpath="//div[@class='c24-cookie-consent-notice-buttons clearfix']//a[contains(text(),'Akzeptieren')]")
    WebElement cookiePopupBtn;

    @FindBy(xpath="//div[@class='product-panel    ' ][1]//a[contains(text(),'weiter')]")
    WebElement clickProductEnterBtn;



    public ComparisonResultPage(WebDriver driver) {
        super(driver);
    }


    public void verifyCookieName() {

        Cookie cookie = null;
        cookie = driver.manage().getCookieNamed("ppset");
        Assert.assertEquals(cookie.getValue(), "kreditkarte");

    }

    //Function to accept cookie pop up and select first listed product
    public void clickFirstProductEnterButton(){

            cookiePopupBtn.click();
            clickProductEnterBtn.click();

    }



}
