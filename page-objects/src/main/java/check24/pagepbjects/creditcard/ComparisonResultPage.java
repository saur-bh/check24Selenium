package check24.pagepbjects.creditcard;

import check24.framework.core.BasePage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class ComparisonResultPage extends BasePage {


    public ComparisonResultPage(WebDriver driver) {
        super(driver);
    }


    public void verifyCookieName() {

        Cookie cookie = null;
        cookie = driver.manage().getCookieNamed("ppset");
        Assert.assertEquals(cookie.getValue(), "kreditkarte");

    }

}
