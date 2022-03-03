package check24.test.creditcard;

import check24.framework.core.BaseTest;
import check24.pagepbjects.creditcard.ComparisonResultPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ResultPageTest extends BaseTest {

    ComparisonResultPage comparisonResultPage;


    @BeforeTest                                             // annotated method placed in the beginning.
    public void before_test() {

        comparisonResultPage = new ComparisonResultPage(getDriver());
        System.out.println("Setting up the object ");
    }

    @Test(priority = 0)
    public void verifyCookieTest() {

        comparisonResultPage.verifyCookieName();

    }


}

