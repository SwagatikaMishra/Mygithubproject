package gmailaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {
	public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
	WebElement Table = driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]"));
	
	//find number of rows
	List<WebElement> noofRows=Table.findElements(By.tagName("tr"));
	System.out.println("No of Rows" + " " + noofRows.size());
	
	int i = 0;
	for(WebElement eachrow:noofRows)
	{
		List<WebElement> eachcolumn = eachrow.findElements(By.tagName("td"));
		i++;
	
	    System.out.println("No of columns in" + " " + i + "th row are" + eachcolumn.size() ); 
	    
	    for  (WebElement text:eachcolumn){
	    	System.out.println(text.getText());
	    }
	    	
	}
	
	
}
}