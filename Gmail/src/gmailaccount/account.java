package gmailaccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class account{

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
	
	driver.findElement(By.id("Email")).sendKeys("mamuni.09");
	driver.findElement(By.id("next")).click();
	
	driver.findElement(By.id("Passwd")).sendKeys("gulu.com");
	driver.findElement(By.id("signIn")).click();
	
	driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	driver.findElement(By.id("gb_71")).click();
	
	String expectedmsg = "One account. All of Google.";
	String actualmsg= driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1")).getText();
	
	if (expectedmsg.equals(actualmsg))
	{
		System.out.println("Logged out");
	}
	else
	{
		System.out.println("Logged in");
	}
	
	driver.close();
	


	}

}
