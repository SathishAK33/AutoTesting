package gitub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\software\\Eclipse Mars\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");// edit
		WebElement cl1 = driver.findElement(By.linkText("Edit"));
		cl1.click();

		WebElement sendkys = driver.findElement(By.id("email"));
		sendkys.sendKeys("SATHISH@gmail.com");

		WebElement sendkys1 = driver.findElement(By.cssSelector("input[value='Append ']"));
		sendkys1.clear();
		sendkys1.sendKeys("sathish");

		WebElement sendkys2 = driver.findElement(By.name("username"));
		sendkys2.sendKeys("AK");

		WebElement cleartext = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		cleartext.clear();

		WebElement clck = driver.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']"));
		clck.click();
		
		WebElement dslpyd = driver.findElement(By.xpath("//input[@disabled='true']"));
		System.out.println(dslpyd.isDisplayed());
		Thread.sleep(3000);
		driver.quit();
  }
}
