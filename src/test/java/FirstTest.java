import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void ANHTESTER1() {
        System.out.println("ANHTESTER1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER1 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void ANHTESTER2() {
        System.out.println("ANHTESTER2 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER2 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER2 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void ANHTESTER3() {
        System.out.println("ANHTESTER3 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER3 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER3 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void ANHTESTER4() {
        System.out.println("ANHTESTER4 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER4 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER4 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void ANHTESTER5() {
        System.out.println("ANHTESTER5 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER5 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER5 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void ANHTESTER6() {
        System.out.println("ANHTESTER6 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER6 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER6 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void ANHTESTER7() {
        System.out.println("ANHTESTER7 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER7 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER7 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void ANHTESTER8() {
        System.out.println("ANHTESTER8 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("https://anhtester.com");
        System.out.println("ANHTESTER8 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Anh Tester - Automation Testing");
        System.out.println("ANHTESTER8 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

}