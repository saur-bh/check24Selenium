package check24.pagepbjects.creditcard;

import check24.framework.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PersonalInfoPage extends BasePage {

    @FindBy(xpath="//*[@class='styles__ButtonWrapper-sc-1solng-1 dwSWhP']")
    WebElement formbtn;

    @FindBy(xpath="//label[contains(text(),'Bitte wählen Sie Ihre Anrede aus.')]")
    WebElement anredeErrorTxt;

    @FindBy(xpath="//label[contains(text(),'Bitte geben Sie Ihren Vornamen an.')]")
    WebElement vornameErrorTxt;

    @FindBy(xpath="//label[contains(text(),'Bitte geben Sie Ihren Nachnamen an.')]")
    WebElement nachnameErrorTxt;

    @FindBy(xpath="//label[contains(text(),'Bitte geben Sie Ihr Geburtsdatum an.')]")
    WebElement geburtsdatumErrorTxt;

    @FindBy(xpath="//label[contains(text(),'Für eventuelle Rückfragen benötigen wir Ihre deutsche Mobilnummer.')]")
    WebElement deutcheErrorTxt;

    @FindBy(xpath="//label[contains(text(),'Für den Versand der Antragsbestätigung benötigen wir Ihre E-Mail-Adresse.')]")
    WebElement emailErrorTxt;


    public PersonalInfoPage(WebDriver driver) {
        super(driver);
    }

    public void clickFormBtn(){
        formbtn.click();
    }

    public void verifyErrorMessage(String ele, String msg){
        
        WebElement item = null;
       switch (ele){
           case "anrede":
               item = anredeErrorTxt ;
               break ;
           case "vorname":
               item = vornameErrorTxt ;
               break ;
           case "geburtsdatum":
               item = geburtsdatumErrorTxt ;
               break ;
           case "deutche":
               item = deutcheErrorTxt ;
               break ;
           case "email":
               item = emailErrorTxt ;
               break ;
               
       }
       
       Assert.assertEquals(item.getText(),msg);

    }

}
