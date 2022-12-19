package FindElement_FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {
//FindElement- Findelement return one element also multiple element are present but they are return onle first element.
	
//also element are not present that time nosuchelementexception error are found
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Install App\\chromedriver(1).exe");	
		
		WebDriver driver = new ChromeDriver();		
			
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		Thread.sleep(2000);

		WebElement Search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		Search.sendKeys("iphone");
		
		//print one element
		
		WebElement Link=driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
		
		System.out.println(Link.getText());

//     WebElement link1= driver.findElement(By.xpath("//a[@class=\"nav-a www \"]"));
//	
//	System.out.println(link1);
	}

}
