package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

    public static void main (String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\datta\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement ddown = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));


        Select A = new Select(ddown);

        A.selectByValue("ALA");
        Thread.sleep(2000);

        A.selectByIndex(13);
        Thread.sleep(2000);

        A.selectByVisibleText("American Samoa");
        Thread.sleep(2000);

        driver.close();
    }

}
