package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;

    public StepDefinitions(){
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Given("I am on main page")
    public void iAmOnTheMainPage(){
        driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/index.html");
    }

    @When("I write the email address of {string}")
    public void iWriteTheEmailAddressOf(String string) {
        mainPage.writeEmailToEmailField(string);
    }

   @When("I click the submit button")
    public void iClickTheSubmitButton() {
        mainPage.clickOnSubmitButton();
   }

   @Then("the confirmation pop-up appears")
   public void theConfirmationPopUpAppears() {
        driver.switchTo().alert().accept();
   }

   @When("I click on Read More button for Virtual page")
   public void clickOnReadMoreButtonForVirtualPage() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreButtonVirtual();
   }

   @Then ("appropriate page opens with Virtual header")
   public void iAmOnVirtualPage() {
        driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/routes/virtual.html");
    }
    @When("I click on Read More for Fundamentals page")
    public void i_click_on_read_more_for_fundamentals_page() {
        Utils.scrollToElement(driver, mainPage.getLearnFundamentals());
        mainPage.clickOnReadMoreFundamentals();
    }
    @Then("open new Fundamentals Page")
    public void open_new_fundamentals_page() {
       driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/routes/fundamentals.html");
    }

    @When("I click on Read More for Selenium page")
    public void i_click_on_read_more_for_selenium_page() {
        Utils.scrollToElement(driver, mainPage.getLearnSelenium());
        mainPage.clickOnReadMoreSelenium();
    }

    @Then("I should see page title as {string}")
    public void i_should_see_header(String string) {
        Assert.assertEquals(driver.getTitle(),"Selenium");
    }

    @When("i scroll to end of the page")
    public void i_scroll_to_end_of_the_page() {
        Utils.scrollToElement(driver, mainPage.getToArrow());
    }
    @When("i click arrow button")
    public void i_click_arrow_button() {
        mainPage.clickOnArrow();
    }
    @Then("i get back to upper")
    public void i_get_back_to_upper() {
        Assert.assertEquals(mainPage.getToBecomeTester(), "Become a Certified Tester");
    }




    @When("I scroll to Instructors description")
    public void scrollToInstructor() {
        Utils.scrollToElement(driver, mainPage.getToInstructors());
    }

    @When("I click on each <instructor> social media button <Twitter>, <Facebook>, <LinkedIn>, <Instagram>")
    public void iClickOnEachInstructorSocialMediaButtonTwitterFacebookLinkedInInstagram() {
        mainPage.clickOnTwitterJohn();
        mainPage.clickOnFacebookJohn();
        mainPage.clickOnLinkedInJohn();
        mainPage.clickOnInstagramJohn();
    }

    @Then("I will be redirected to each social media page")
    public void i_will_be_redirected_to_each_social_media_page() {
    }

    @When("I click on Start The Enrollment")
    public void i_click_on_start_the_enrollment() {
        mainPage.clickOnEnrollmentButton();
    }
    @Then("open new Page")
    public void open_new_page() {
        driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/routes/enrollment.html");
    }







    @After
    public void cleanUp(){
        driver.quit();
   }



}

