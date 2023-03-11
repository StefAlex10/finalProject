package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreVirtual;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnFundamentals;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreFundamentals;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement learnSelenium;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement readMoreSelenium;

    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;

    @FindBy(xpath = "/html/body/footer/div/a/i")
    private WebElement arrowButton;

    @FindBy (xpath = "/html/body/section[1]/div/div/div/h1")
    private WebElement becomeTester;


    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructors;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]")
    private WebElement twitterJohn;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[2]")
    private WebElement  facebookJohn;

    @FindBy (xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[3]")
    private WebElement linkedInJohn;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[4]")
    private WebElement instagramJohn;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

    public void writeEmailToEmailField (String email) {
        this.emailField.sendKeys(email);
    }

    public void clickOnReadMoreButtonVirtual() {
        this.readMoreVirtual.click();
    }

    public WebElement getVirtualHeader() {
        return this.virtualHeader;
    }

    public WebElement getLearnFundamentals() {
        return this.learnFundamentals;
    }

    public void clickOnReadMoreFundamentals() {
        this.readMoreFundamentals.click();
    }

    public WebElement getLearnSelenium() {
        return this.learnSelenium;
    }

    public void clickOnReadMoreSelenium() {
        this.readMoreSelenium.click();
    }

    public void clickOnEnrollmentButton() {
        this.enrollmentButton.click();
    }

    public WebElement getToArrow() {
        return this.arrowButton;
    }

    public void clickOnArrow() {
        this.arrowButton.click();
    }

    public String getToBecomeTester() {
        return 
    }




    public WebElement getToInstructors() {
        return this.instructors;
    }

    public void clickOnTwitterJohn() {
        this.twitterJohn.click();
    }

    public void clickOnFacebookJohn() {
        this.facebookJohn.click();
    }

    public void clickOnLinkedInJohn() {
        this.linkedInJohn.click();
    }

    public void clickOnInstagramJohn() {
        this.instagramJohn.click();
    }









}

















