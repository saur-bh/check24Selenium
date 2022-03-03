## check24 Automation Runbook
This Test Automation Framework is made while considering following points:
1. Abstraction
2. Maintainable and extendable
3. Simple and Ease-of-use
4. Retry or self healing on failure
5. Loggin and Reporting

## TechStack
* Java Programming language (1.8)
* WebDriver Web-Browser Automation tool
* TestNG Assertion framework
* Maven Build tool
* IntelliJ IDE
* github Source code management tool

## Setup
1. Install Java 1.8 if not present via following link https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
2. Install IntelliJ (https://www.jetbrains.com/idea/download/) package as per your operating system
3. Set Path variable for the the Java (https://www.javatpoint.com/how-to-set-path-in-java)

## Architechure
![Architechure](https://user-images.githubusercontent.com/22570719/130225643-1140d161-558a-49d2-9ba4-61238526d4d2.png)

## Running Tests
1. Create folder of your choice and navigate to it via command prompt.</br>
``` git clone https://github.com/saur-bh/check24Selenium.git``` </br>
![Git command](https://user-images.githubusercontent.com/22570719/130228832-d9d0d1cf-e5c8-486b-aa15-657db62da7f6.png)
2. Open IntelliJ IDE and Navigate to the folder which was cloned from git</br>
![image](https://user-images.githubusercontent.com/22570719/130230210-8370134f-103a-4a46-a8fd-be5cd751b719.png)
3. Wait for dependencies to get download</br>
![image](https://user-images.githubusercontent.com/22570719/130235432-81faa416-8232-40ee-80be-a6b0167460ed.png)
4. Create Run-Configuration for testNG by clicking on Run>Edit Configuration...
![image](https://user-images.githubusercontent.com/22570719/130237002-0de9ac80-8247-4923-8d4f-6411e173f5a3.png)
5. Click on + to create new configuration as mentioned in figure below
![image](https://user-images.githubusercontent.com/22570719/130237319-cd598b0f-0bdd-471f-b095-197a38214881.png)
6. Add listner EmailableReporter, FailReporter and testHTMLReporter
![image](https://user-images.githubusercontent.com/22570719/130237451-c555ec4c-15b0-46f5-b2eb-ec3e5843351e.png)
7. Open testng.xml and uncomment the XMl as per choice to run the suite
![image](https://user-images.githubusercontent.com/22570719/130237914-525bdb86-972e-48a1-a9ea-a636ae7d7fac.png)
8. Save the testng.xml and click on Run...and select the configuration which you created above
![image](https://user-images.githubusercontent.com/22570719/130238096-9a119f21-d536-49cf-8cb4-47371452fd77.png)
9. Application will be launched and execution will start 
![image](https://user-images.githubusercontent.com/22570719/130238253-51b545ec-a4a0-4eac-bd97-7a63e536fb0d.png)
10. Wait for execution to get over and then open HTML file to see result
![image](https://user-images.githubusercontent.com/22570719/130239543-832015be-fd63-4211-a0c6-29f0c394a3ea.png)
11. Result will show pass and failure
![image](https://user-images.githubusercontent.com/22570719/130239457-78794a43-fa19-4923-9095-7b33e4ca4b55.png)

## Automated UseCase
1. Verify the cookie is set in response headers.
2. Verify the error message is seen for empty field.

## Demo TestExecution
 ( unlisted :Person with link can view )

## Creation of New Test 
 You should have these Maven modules:
 * framework - core classes that form the framework
 * page-objects - components and locators of each webpage
 * regression-tests - actual test classes that rely on page objects
 
 Our framework is based on the Page Object Model design pattern. We will also be using the WebDriver’s PageFactory class to initialize WebElements.


1. Create check24-regression-test module, create new package i.e. check24.tests.creditcard and then class Demo which extends BaseTest</br>
    ![image](https://user-images.githubusercontent.com/22570719/130243151-fce1d91a-6b1b-4055-acf7-5728091973d8.png)</br>
    ```
    package solevbot.tests.homepage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import check24.framework.core.BaseTest;
import check24.pageobjects.creditcard.ComparisonResultPage;


public class Demo extends BaseTest{
ComparisonResultPage comparisonResultPage;
   

    @BeforeTest                                             // annotated method placed in the beginning.
    public void before_test() {

        check24Page = new SolveMatePage(getDriver());
        navPage = new NavPage(getDriver());
        feedback = new SendFeedbackPage(getDriver());
        System.out.println("Setting up the object ");
    }

    @Test(priority = 0)
    public void homepageTests() {

        check24Page.clickWidget();

    }
}
  
    ```
    
2. Create new method using @Test (testng annotation) 
```
    @Test(dependsOnMethods = {"homepageTests"})
    public void demoToCreateTestCase() {
        String msg = "Your feedback was sent successfully.";
        feedback.clickNavBtn("New");
        feedback.clickChoiceBasedonText("Learn about Customer Service Automation");
        feedback.clickChoiceBasedonText("Beginners Guide to Chatbots ebook");
        feedback.clickThumbsUp();
        feedback.clickChoiceBasedonText("Rate your conversation");
        feedback.selectFeedback(2);
        feedback.clickSendFeedbackButton();
        feedback.verifySuccessMessage(msg);
        feedback.clickBackbtn();

    }
```
![image](https://user-images.githubusercontent.com/22570719/130244116-33ee9293-a98b-474b-9ec8-4c5ca98fdf4e.png)
3. Save the file and then right click on it to Run

![RunFile](https://user-images.githubusercontent.com/22570719/130244269-f4e067cc-aee4-4bb1-b37f-fc5f098833e1.png)
    
4. Adding the Page Objects ( If new Page has to be created)
    In the check24-page-objects module, create new package i.e. check24.pageobjects.demo and then class Demo which extends BasePage</br>
    ```
    package check24.pageobjects.demo;
    import org.openqa.selenium.WebDriver;
   import check24.framework.core.BasePage;

    public class Demo extends BasePage {
    public Demo(WebDriver driver) {
        super(driver);
    }
   } ```
  
![image](https://user-images.githubusercontent.com/22570719/130242940-92e74362-ec6d-4588-98ce-7cbaa548dbae.png)

## Demo TestCase Creation
( unlisted :Person with link can view )

## Enhancement
  * Integration with CI tool i.e. Jenkins.
  * Email reporting on the status of execution.
  * Integration with other automation i.e. API.
  * Setup and TearDown of testData

