package gmailaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class countlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		
		//links starts with anchor tag a
		System.out.println("Links present in the page");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of links in the footer section
		
		//spy the entire section ,give xpath of that particular section and 
		//create a webelement for that part
		
	WebElement footer=	driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));
	
	System.out.println("Links present in the footer");
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	WebElement col=	driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	
	System.out.println("Links present in the second column");
	
	int l= col.findElements(By.tagName("a")).size();
	
	System.out.println(l);
	//print the link names
	
	for(int i=0;i<l;i++){
		
		//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
		//click on sitemap ..but we dont know the exact position
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			System.out.println(driver.getTitle());
			col.findElements(By.tagName("a")).get(i).click();
			break;
		}
		
		
	}
	System.out.println(driver.getTitle());
	}

}
