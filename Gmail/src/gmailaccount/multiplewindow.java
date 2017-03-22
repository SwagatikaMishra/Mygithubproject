package gmailaccount;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		//even if it open more than one window but the control is on the parent window.
		
		//To move control to child window
		
		//video 57
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String Pid=it.next();
		String cid = it.next();
		
		driver.switchTo().window(cid);//provide the id of that particular window
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(Pid);
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
