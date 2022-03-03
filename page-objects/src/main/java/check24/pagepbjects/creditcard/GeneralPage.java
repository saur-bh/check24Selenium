package check24.pagepbjects.creditcard;

import check24.framework.core.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class GeneralPage extends BasePage {


    @FindBy(xpath="//*[@id='cl_login']")
    WebElement emailTextBox;

    @FindBy(xpath="//*[@id='c24-uli-login-btn']")
    WebElement loginBtn;


    @FindBy(xpath="//div[@class='c24-uli-bottom-title c24-uli-bottom-l-anonymous style-scope unified-login']//a[@class='c24-uli-cl-l-anonymous-trigger style-scope unified-login']")
    WebElement radioBtn;

    @FindBy(xpath="//a[@class='sc-bdfBwQ sc-hKgILt jTtSWU gTLZXx styles__ButtonDialog-sc-1solng-2 focaaU']")
    WebElement clickFormbtn;

    public GeneralPage(WebDriver driver) {
        super(driver);
    }


    //Function to enter email address , click enter and verify after enter respective details are populated
    public void  enterEmailAddressAndClickEnter(String userName){

        emailTextBox.sendKeys(userName);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);

    }



    public void selectRadioBtn()
    {

        JavascriptExecutor ab= (JavascriptExecutor) driver;
        ab.executeScript("arguments[0].click();", radioBtn);

    }


}
