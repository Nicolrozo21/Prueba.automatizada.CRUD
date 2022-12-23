package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.WebDriverWait;

//import junit.framework.Assert;

public class TestGoogle2 {


	//VARIABLES
	private WebDriver driver;   
	private static final String TIPO_DRIVER = "webdriver.chrome.driver";
	private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
	private String URL = "http://localhost/VetPetProject-nicol/informacion.php";
	
	//TEXTO DE INICIO
	@BeforeClass
	public static void setUpBeforeClass()
	{
		System.out.println("INICIO DE PRUEBA");
		System.setProperty(TIPO_DRIVER, PATH_DRIVER);
		
	}

	
	@Before
	public void setUp()
	{

		driver = new ChromeDriver(); //se abre el navegador
		driver.get(URL); //navegar	    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	//PRUEBA INSERTAR
	@Test
	
	
	//PRUEBA DE MODIFICAR
	
	public void testSourch1() throws InterruptedException  
	{
	  WebElement Modificar = driver.findElement(By.xpath("/html/body/div[1]/a[1]/button"));
	   Modificar.click();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   //CAMPOS A MODIFICAR  
	   
	   WebElement Texto1M = driver.findElement(By.xpath("//*[@id=\"nombre\"]"));
	   Texto1M.click();
	   Texto1M.clear();
	   Texto1M.sendKeys("Nicol Esquivel");
	   Thread.sleep(3000);
	   
	   WebElement Texto2M = driver.findElement(By.xpath("//*[@id=\"estado\"]"));
	   Texto2M.click();
	   Texto2M.clear();
	   Texto2M.sendKeys("Inactivo");
	   Thread.sleep(3000);
			
	   
	   
	   WebElement Texto3M = driver.findElement(By.xpath("//*[@id=\"rol\"]"));
	   Texto3M.click();
	   Texto3M.clear();
	   Texto3M.sendKeys("Arendiz SENA");
	   Thread.sleep(3000);

	   
	   WebElement Guardar = driver.findElement(By.xpath("//*[@id=\"contenido\"]/form/button"));
	   Guardar.click();
	   Thread.sleep(3000);

	   driver.switchTo().alert().accept();
	 
	   //ELMMINAR
	   
	   WebElement Eliminar = driver.findElement(By.xpath("/html/body/div[1]/a[2]/button"));
	   Eliminar.click();
	   Thread.sleep(3000);
	   
	   driver.switchTo().alert().accept();
		   
	}
	
	
	//@After
	//public void tearDown()
	//{
     //	driver.quit();
	//}
	
	@AfterClass
	public static void tearDoenAfterClass()
	{
		System.out.println("FINALIZA LA PRUEBA");
	}
}
