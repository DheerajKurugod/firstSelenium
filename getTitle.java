import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://google.com";
		String newUrl = "http://facebook.com";
		String expectedTitle = "Google";
		
		System.setProperty("webdriver.chrome.driver", "//Users//dkurugod//Desktop//selenium_tutorials//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Titles matched");
	}else {
		System.out.println("Titles aren't matched");
	}
		
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().to("http://youtube.com");
		driver.navigate().refresh();
		driver.navigate().to(newUrl);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Forgot Password?")).click(); ////*[@id='u_0_a']/div[3]/a
		driver.navigate().back();
		//driver.findElement(By.id("email")).sendKeys("dheeraj.kurugod9@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("dheeraj.kurugod9@gmail.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("dheeraj.kurugod9@gmail.com");
		
		//driver.findElement(By.id("pass")).sendKeys("Rental@25"); ////*[@id='pass']
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("Rental@25");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Rental@25");
		driver.findElement(By.name("login")).click(); ////*[@id='u_0_b'] #u_0_b
		
		//xpath syntax - //tagName[@attribute='value']
		//css syntax - tagName[attribute='value'], tagName#id, tagName.classname
		//xpath reg exp syntax - //tagName[contains(@attribute,'value')]
		//css reg exp syntax - tagName[attribute*='value']
		
		
		
		
		//driver.close();
		//System.exit(0);

}
}
