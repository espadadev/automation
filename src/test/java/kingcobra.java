import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kingcobra {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        ChromeDriver kingcobrahobby = new ChromeDriver();
        kingcobrahobby.manage().window().maximize();
        kingcobrahobby.get("https://development-na01-kingcobrahobby.demandware.net/on/demandware.store/Sites-kingcobrahobby-us-Site/default/Home-Show");
        Thread.sleep(1000);
        kingcobrahobby.get("https://development-na01-kingcobrahobby.demandware.net/on/demandware.store/Sites-kingcobrahobby-us-Site/default/Home-Show");

    }
}
