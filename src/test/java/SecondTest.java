import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void GOOGLE() {
        System.out.println("Google Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: "+ Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void AnhTesterBlog() {
        System.out.println("AnhTesterBlog Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com/blogs");
        System.out.println("AnhTesterBlog Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " + Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester Blog | Anh Tester");
        System.out.println("AnhTesterBlog Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }
}