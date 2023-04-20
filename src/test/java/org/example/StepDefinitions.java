package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private MainPage mainPage;
    private Enrollment enrollmentPage;
    private ContactInfo contactInfo;
    private CourseOptions courseOptions;
    private Payment paymentPage;

    public StepDefinitions(){
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        enrollmentPage = new Enrollment(driver);
        contactInfo = new ContactInfo(driver);
        courseOptions = new CourseOptions(driver);
        paymentPage = new Payment(driver);
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

    @Then("the field is colored in red")
    public void the_field_is_colored_in_red() {
        Assert.assertTrue(mainPage.getToEmailField().getAttribute("class").contains("error"));
    }

   @When("I click on Read More button for Virtual page")
   public void clickOnReadMoreButtonForVirtualPage() {
        Utils.scrollToElement(driver, mainPage.getVirtualHeader());
        mainPage.clickOnReadMoreButtonVirtual();
   }

    @When("I click on Read More for Fundamentals page")
    public void i_click_on_read_more_for_fundamentals_page() {
        Utils.scrollToElement(driver, mainPage.getLearnFundamentals());
        mainPage.clickOnReadMoreFundamentals();
    }

    @When("I click on Read More for Selenium page")
    public void i_click_on_read_more_for_selenium_page() {
        Utils.scrollToElement(driver, mainPage.getLearnSelenium());
        mainPage.clickOnReadMoreSelenium();
    }

    @When("I click on Start The Enrollment")
    public void i_click_on_start_the_enrollment() {
        mainPage.clickOnEnrollmentButton();
    }

    @Then("I should see page title as {string}")
    public void i_should_see_header(String string) {
        Assert.assertEquals(driver.getTitle(),string);
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
        Assert.assertEquals(mainPage.getToBecomeTester(), "Become a Certified Software Tester");
    }

    //ENROLLMENT Page

    @Given("I am on the enrollment page")
    public void iAmOnTheEnrollmentPage() {
        driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/routes/enrollment.html");
    }

    @When("I write the First Name as {string}")
    public void i_write_the_first_name_as(String string) {
        enrollmentPage.writeFirstName(string);
    }
    @And("I write the Last Name as {string}")
    public void i_write_the_last_name_as(String string) {
        enrollmentPage.writeLastName(string);
    }
    @And("I write the Username as {string}")
    public void i_write_the_username_as(String string) {
        enrollmentPage.writeUserName(string);
    }
    @And("I write the Password as {string}")
    public void i_write_the_password_as(String string) {
        enrollmentPage.writePassword(string);
    }
    @And("I write the Confirm Password as {string}")
    public void i_write_the_confirm_password_as(String string) {
        enrollmentPage.writeConfirmationPass(string);
    }
    @And("I click next button")
        public void clickOnNextButton(){
        enrollmentPage.clickNextButton();
    }
    @Then("I get to Contact Information")
    public void i_click_next_button_and_new_page_are_opened() {
        Assert.assertEquals(enrollmentPage.getContactInformation(), "Contact information");
    }

  // CONTACT INFORMATION

    @Given("I am on the contact information page")
        public void contactInfoPage() {
        driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/routes/enrollment.html");
        enrollmentPage.fillPersonalInformation();
        enrollmentPage.clickNextButton();
    }

    @When("I write the email address {string}")
    public void i_write_the_email_address(String string) {
        contactInfo.writeContactEmail(string);
    }
    @When("I write the phone number {string}")
    public void i_write_the_phone_number(String string) {
        contactInfo.writePhone(string);
    }
    @When("I write the country field {string}")
    public void i_write_the_country_field(String string) {
        contactInfo.writeCountry(string);
    }
    @When("I write the city field {string}")
    public void i_write_the_city_field(String string) {
        contactInfo.writeCity(string);
    }
    @When("I write the PostCode field {string}")
    public void i_write_the_post_code_field(String string) {
        contactInfo.writePostCode(string);
    }
    @And("I click on next button")
    public void clickOnNextContactButton() {
        contactInfo.clickOnNextContactButton();
    }
    @Then("I get to Course options")
    public void i_get_to_course_options() {
        Assert.assertEquals(contactInfo.getToCourseOptions(), "Course options");
    }

    // Course Option
    @Given("I am on the course options page")
    public void iAmOnTheCourseOptionPage() {
        driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/routes/enrollment.html");
        enrollmentPage.fillPersonalInformation();
        enrollmentPage.clickNextButton();
        contactInfo.fillContactInfo();
        contactInfo.clickOnNextContactButton();
    }
    @When("I click for one option")
    public void clickForOneOptionCourse() {
        courseOptions.clickOnBulletOptions();
    }
    @And("I click on next button from course options page")
    public void clickOnNextButtonFromCourseOptions() {
        courseOptions.clickOnNextButtonCourseOption();
    }
    @Then("I get to Payment Information")
    public void getToPaymentInformationText(){
        Assert.assertEquals(courseOptions.getToPaymentInformationText(), "Payment information");
    }

    // PAYMENT PAGE
    @Given("I am on payment information page")
    public void IAmOnPaymentPage() {
        driver.get("file:///C:/Users/alexa/OneDrive/Desktop/New%20folder/Testing-Env/routes/enrollment.html");
        enrollmentPage.fillPersonalInformation();
        enrollmentPage.clickNextButton();
        contactInfo.fillContactInfo();
        contactInfo.clickOnNextContactButton();
        courseOptions.clickOnBulletOptions();
        courseOptions.clickOnNextButtonCourseOption();
    }

    @When("I write the card holder name {string}")
    public void writeCardHolderName(String string) {
        paymentPage.writeCardHolderName(string);
    }

    @And("I write card number {string}")
    public void writeNumberCard(String string) {
        paymentPage.writeNumberCard(string);
    }

    @And("I write CVC code {string}")
    public void writeCVCcode(String string) {
        paymentPage.writeCVCCode(string);
    }

    @And("I select month {string}")
    public void selectMonth(String string) {
        paymentPage.clickMonth();
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        dropdown.selectByVisibleText(String.valueOf(string));
    }
    //dropdown.selectByIndex(9);

    @And("I select year {string}")
    public void selectYear(String string) {
        paymentPage.clickYear();
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        dropdown.selectByVisibleText(String.valueOf(string));
    }

    @And("I click on next button from payment information page")
    public void clickNextButtonPayment() {
        paymentPage.clickPaymentNextButton();
    }

    @Then("I get to Success page")
    public void getToSuccessText() {
        Assert.assertEquals(paymentPage.getToSuccessText(),"Success!");
    }

    @After
    public void cleanUp(){
        driver.quit();
   }



}

