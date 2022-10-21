import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreeTest extends BaseTest {

    @Test
    public void SeleniumDev1() {
        System.out.println("SeleniumDev1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.selenium.dev/");
        System.out.println("SeleniumDev1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Selenium");
        System.out.println("SeleniumDev1 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void SeleniumDev2() {
        System.out.println("SeleniumDev2 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.selenium.dev/");
        System.out.println("SeleniumDev2 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " + Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Selenium");
        System.out.println("SeleniumDev2 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void SeleniumDev3() {
        System.out.println("SeleniumDev3 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.selenium.dev/");
        System.out.println("SeleniumDev3 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " + Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Selenium");
        System.out.println("SeleniumDev3 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void SeleniumDev4() {
        System.out.println("SeleniumDev4 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://www.selenium.dev/");
        System.out.println("SeleniumDev4 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " + Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Selenium");
        System.out.println("SeleniumDev4 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }
}