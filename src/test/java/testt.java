import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testt {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.horizonhobby.com/");
        //chromeDriver.manage().window().maximize();
        Thread.sleep(1000);
        chromeDriver.findElement(By.xpath("//div[@id='emailSignupModal']//button[@aria-label='Close']//*[name()='svg']")).click();
        Thread.sleep(2000);

        chromeDriver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("login-form-email")).sendKeys("espadagamin+1@gmail.com");
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("login-form-password")).sendKeys("Espada@2020");
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//button[@type='submit'][normalize-space()='Sign In']")).click();
        Thread.sleep(5000);

        JavascriptExecutor js= (JavascriptExecutor) chromeDriver;
        //js.executeScript("windows.scrollBy(0,5000)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath("//span[@class='user-link user-message']")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//div[@class='popover popover-bottom show']//a[normalize-space()='Logout']")).click();
        Thread.sleep(2000);
        chromeDriver.close();



    /*chromeDriver.findElement(By.id("username")).sendKeys("jackryan@vlt.com");
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("password")).sendKeys("skrossi23");
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("Login")).click();
        Thread.sleep(2000);
        chromeDriver.close();*/

    }
}
