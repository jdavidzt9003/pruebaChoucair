package prueba.automatizada.choucair;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionEmpleos {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Empleos");
	By registerPageLocator = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png']");
	
	By jobLocator = By.id("search_keywords");
	By cityLocator= By.id("search_location");
	By registerBtnLocator =  By.className("search_submit");
	
	 @Before
	 public void setUp() {
		 
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.choucairtesting.com/");
	 }
	  
	 @Test
	 public void testBuscarEmpleosPage() throws InterruptedException {
		 
		 driver.findElement(registerLinkLocator).click();
		 Thread.sleep(2000);
		 if (driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(jobLocator).sendKeys("Analista"); 
			driver.findElement(registerBtnLocator).click();
			 
		 }else {
			 
			 System.out.println("Alerta!!");
		 }
		 
	 }
}
