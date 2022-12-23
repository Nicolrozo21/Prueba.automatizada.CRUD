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

public class TestGoogle {


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
	public void testSourch() throws InterruptedException
	{
		
	    
	   //PASO 1 CLICK EN EL BOTON
	   WebElement boton = driver.findElement(By.xpath("/html/body/div[1]/a/button"));
	   boton.click();
	   Thread.sleep(3000);
	   
	   //PASO 2 INSERTAR TEXTO EN LOS CAMPOS
	   
	   WebElement Texto = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[1]/input"));
	   Texto.sendKeys("123456789");
	   Thread.sleep(3000);
	   
	   WebElement Texto1 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/input"));
	   Texto1.sendKeys("nicol@gmail.com");
	   Thread.sleep(3000);

	   WebElement Texto2 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[2]/input"));
	   Texto2.sendKeys("Rufo12xz?");
	   Thread.sleep(3000);
	   
	   WebElement Texto3 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[3]/input"));
	   Texto3.sendKeys("Nicol");
	   Thread.sleep(3000);
	   
	   WebElement Texto4 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[4]/input"));
	   Texto4.sendKeys("Activo");
	   Thread.sleep(3000);
	   
	   WebElement Texto5 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[5]/input"));
	   Texto5.sendKeys("51982152");
	   Thread.sleep(3000);
	  
	   WebElement Texto6 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[6]/input"));
	   Texto6.sendKeys("12:00");
	   Thread.sleep(3000);
	  
	   WebElement Texto7 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[7]/input"));
	   Texto7.sendKeys("Aprenidz");
	   Thread.sleep(3000);
				
	   WebElement Texto8 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[8]/input"));
	   Texto8.sendKeys("Prueba Crud");
	   Thread.sleep(3000);
	   
	   //PASO 3
	   
	   WebElement Texto9 = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/div[9]/input"));
	   Texto9.click();
	   Thread.sleep(3000);
	   
	   
	   WebElement Registrar = driver.findElement(By.xpath("//*[@id=\"frmregistrar\"]/button"));
	   Registrar.click();
	   Thread.sleep(3000);
	   
	   driver.switchTo().alert().accept();
	   
	 
	}
	
	
	//PRUEBA DE MODIFICAR
	
	
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
