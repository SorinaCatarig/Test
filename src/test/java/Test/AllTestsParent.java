package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class AllTestsParent {

    public static WebDriver driver = new ChromeDriver();
    LoginPage item = new LoginPage(driver);

    public void selectElement(int index, WebElement element) {
        Select drop = new Select(element);
        drop.selectByIndex(index);
    }

    @AfterSuite
    public void afterSuite(){
        driver.close();
    }
}
