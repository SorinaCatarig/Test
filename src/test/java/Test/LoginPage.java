package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class LoginPage {

    public LoginPage(WebDriver driver){

    PageFactory.initElements(driver, this);

    }

    @FindBy(name = "a")
    public WebElement button;

    @FindBy(id = "continents")
    public WebElement list;

    @FindBy(xpath = "//div[contains(@class, 'control-group')]")
    public WebElement containsTest;

}
