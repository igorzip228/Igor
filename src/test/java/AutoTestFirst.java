import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoTestFirst {
    WebDriver browser;

    @BeforeTest
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", "D:/QA manual/practice/chromedriver1.exe");
        browser = new ChromeDriver();
    }

    @AfterTest
    public void closeChrme() {
        browser.quit();
    }


    @Test
    public void myTest() throws InterruptedException {
        browser.get("https://www.random.org/integers/");
        browser.findElement(By.cssSelector("input[name='num']")).clear();
        browser.findElement(By.cssSelector("input[name='num']")).sendKeys("1");
        browser.findElement(By.cssSelector("input[value='Get Numbers']")).click();
        Thread.sleep(2000);
        String num = browser.findElement(By.cssSelector("pre[class='data']")).getText().replace(" ", "");
        System.out.println("значение <" + num + ">");
        int val = Integer.parseInt(num);
        browser.quit();
        Assert.assertTrue(val > 1 | val < 100);
    }
}




