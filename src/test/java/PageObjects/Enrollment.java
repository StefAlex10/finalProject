package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Enrollment {

    public Enrollment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }




}
