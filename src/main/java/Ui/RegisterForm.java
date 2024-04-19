package Ui;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {

    public static void main (String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\datta\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//    first name,last name,addres,monile number, email address

        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Datta");

        driver.findElement(By.xpath("//html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Raut");

        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Bhor");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("dattaraut1996india@gmail.com");

        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("7822970311");

        //Dropdown selection

        System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).isSelected());
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();

        //Check box selection

        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("checkbox3")).click();

//dropdown

        WebElement dropdown1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
        Select c=new Select(dropdown1);

        c.selectByIndex(4);
        Thread.sleep(2000);
        c.selectByValue("APIs");
        Thread.sleep(2000);
        c.selectByVisibleText("AutoCAD");
        Thread.sleep(2000);

        System.out.println (c.getOptions().size());


    }
}