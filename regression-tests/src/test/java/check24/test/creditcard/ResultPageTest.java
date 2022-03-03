package check24.test.creditcard;

import check24.framework.core.BaseTest;
import check24.pagepbjects.creditcard.ComparisonResultPage;
import check24.pagepbjects.creditcard.GeneralPage;
import check24.pagepbjects.creditcard.PersonalInfoPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ResultPageTest extends BaseTest {

    ComparisonResultPage comparisonResultPage;
    GeneralPage generalPage;
    PersonalInfoPage personalInfoPage;


    @BeforeTest                                             // annotated method placed in the beginning.
    public void before_test() {

        comparisonResultPage = new ComparisonResultPage(getDriver());
        generalPage = new GeneralPage(getDriver());
        personalInfoPage = new PersonalInfoPage(getDriver());
        System.out.println("Setting up the object ");
    }

//    @Test(priority = 0)
//    public void verifyCookieTest() {
//
//        comparisonResultPage.verifyCookieName();
//
//    }

    @Test
    public void VerifyEmptyField(){
        comparisonResultPage.clickFirstProductEnterButton();
        generalPage.enterEmailAddressAndClickEnter("Saurabh@Test.com");
        generalPage.selectRadioBtn();
        personalInfoPage.clickFormBtn();
        personalInfoPage.verifyErrorMessage("anrede","Bitte wählen Sie Ihre Anrede aus.");
        personalInfoPage.verifyErrorMessage("vorname","Bitte geben Sie Ihren Vornamen an.");

    }

}

