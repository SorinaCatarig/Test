package Test;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest extends AllTestsParent{

    @Test
    public void testOne() {
   // driver.navigate().to("http://toolsqa.com/automation-practice-form/");

        System.out.println("testOne");

    }

    @Test
    public void testTwo(){
        System.out.println("testTwo");
    }
}

class AnotherTestClass extends AllTestsParent{

    @Test
    public void testThree(){
        System.out.println("testThree");
    }
}
