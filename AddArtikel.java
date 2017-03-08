package test;
/*
public class AddArtikel {

}
*/
//package com.example.tests;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class AddArtikel {
	
	public WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
	
  private StringBuffer verificationErrors = new StringBuffer();
/*
  public AddArtikel() {
	   // Do nothing
	}

  public AddArtikel(String test) {
	  this();
	} 
*/
  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.gecko.driver", "E:\\DIOS\\2. Knowledge\\2. Selenium\\Software\\Gecko\\geckodriver.exe");
	  driver = new FirefoxDriver();
   // baseUrl = "http://diosdojo.com/";
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  }

  @Test
  public void testAddArtikel() throws Exception {
	driver.get("http://diosdojo.com/smartdoctor-web/#/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@type='password']")).clear();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("diosdojo");
    driver.findElement(By.xpath("//button")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Artikel")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("li.xn-openable.active > ul > li > a")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button")).click();
    driver.findElement(By.xpath("//input[@type='text']")).clear();
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java Artikel");
    String Judul = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
    Thread.sleep(3000);
    new Select(driver.findElement(By.xpath("//select"))).selectByVisibleText("Info Kesehatan > Diet > Diet Rekomendasi");
    Thread.sleep(3000);
    new Select(driver.findElement(By.xpath("//div[5]/div/div/select"))).selectByVisibleText("Kurus");
    /*Thread.sleep(3000);
    driver.findElement(By.cssSelector("div.note-editable/p")).clear();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div.note-editable/p")).sendKeys("ini kontennya");
    */
    driver.findElement(By.name("file")).clear();
    Thread.sleep(3000);
    driver.findElement(By.name("file")).sendKeys("E:\\DIOS\\1. Project\\3. Smart Doctor\\5. Testing\\gambar\\or4.jpg");
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("kesehatan");
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("diet");
    driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("Drs. Siti Aisya");
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("www.kesehatanlagi.com");
    driver.findElement(By.xpath("(//input[@name='status'])[2]")).click();
    driver.findElement(By.xpath("//div[13]/button")).click();
    // Untuk validasi data berhasil tersimpan :
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='do_table_filter']/label/input")).clear();
    driver.findElement(By.xpath("//div[@id='do_table_filter']/label/input")).sendKeys(Judul);
    driver.findElement(By.xpath("//div[@id='do_table_filter']/label/input")).sendKeys(Keys.ENTER);
    Thread.sleep(3000);
    assertEquals(Judul, driver.findElement(By.xpath("//table[@id='do_table']/tbody/tr/td[2]")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  /*private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }*/

  /* private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }*/

  /*private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }*/
}
/*
public class AddArtikel{
	public AddArtikel(String text){
		super(text);
	}
	*/

