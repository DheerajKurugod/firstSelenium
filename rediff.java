import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users//dkurugod//Desktop//selenium_tutorials//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //css reg exp
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("dkurugod@gmail.com"); //xpath
		driver.findElement(By.cssSelector("input#password")).sendKeys("Hello@123"); //css
		driver.findElement(By.xpath("//input[contains(@value,'Sign')]")).click(); //xpath reg exp

	}

}
