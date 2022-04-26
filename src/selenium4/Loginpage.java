package selenium4;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://student.ccekcampus.org/home.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement username = driver.findElement(By.xpath("//*[@id='txtuid']"));
		username.sendKeys("C2001075D110001");
		action.sendKeys(Keys.TAB).build().perform();
		WebElement password = driver.findElement(By.xpath("//*[@id='txtpass']"));
		password.sendKeys("nnn@8919");
		action.sendKeys("Keys.TAB").build().perform();
		/* action.sendKeys("Keys.TAB"); */
		WebElement submit = driver.findElement(By.xpath("//*[@name='butlogin']"));
		//submit.click();
	    action.sendKeys(submit, Keys.ENTER).build().perform();
	    WebElement nav = driver.findElement(By.xpath("//span[@onclick='openNav()']"));
	    action.sendKeys(nav, Keys.ENTER).build().perform();
	    //action.sendKeys(Keys.DOWN).build().perform();
		
		  WebElement logout = driver.findElement(By.xpath("//*[text()='Logout']"));
		  logout.click();
		  //logout.click(); action.sendKeys(logout, Keys.ENTER).build().perform();
		  driver.close();
		 
	}

}
