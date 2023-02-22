package Practice;
import org.bouncycastle.util.test.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateEventBms {

	


	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bookmystall.in/");
		
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"new-header\"]/div[2]/a/span")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"MobileNumber\"]")).sendKeys("8096074184");
	Thread.sleep(1000);
	WebElement dropdown =driver.findElement(By.xpath("//*[@id=\"City\"]"));
	Select selectobject = new Select(dropdown);
	selectobject.selectByIndex(5);
	Thread.sleep(5000);
	driver.findElement(By.id("EventName")).sendKeys("Luxury");
	driver.findElement(By.id("EventVenue")).sendKeys("Luxury");
	WebElement dropdown1 =driver.findElement(By.id("venue_type"));
	Select selectobject1 = new Select(dropdown1);
	selectobject1.selectByIndex(5);
	WebElement EventType = driver.findElement(By.name("EventType"));
	EventType.click();
	WebElement dateBox = driver.findElement(By.id("EventStartDate"));
    dateBox.sendKeys("03022023");
    dateBox.sendKeys(Keys.TAB);

	WebElement dateBox1 = driver.findElement(By.id("EventEndDate"));
    dateBox1.sendKeys("04022023");	
    dateBox1.sendKeys(Keys.TAB);	
	driver.findElement(By.id("NumberofStalls")).sendKeys("20");
	driver.findElement(By.id("AvailableStalls")).sendKeys("10");
	Thread.sleep(5000);
	WebElement selectstall =driver.findElement(By.id("Stall_type1"));
	Select stalls = new Select(selectstall);
    stalls.selectByIndex(4)	;
	Thread.sleep(5000);
    WebElement selecttable =driver.findElement(By.xpath("//*[@id=\"Tables1\"]"));
	Select table = new Select(selecttable);
    table.selectByIndex(2)	;
    Thread.sleep(5000);
    WebElement selectchairs =driver.findElement(By.xpath("//*[@id=\"Chairs1\"]"));
	Select chairs = new Select(selectchairs);
    chairs.selectByIndex(2)	;
	driver.findElement(By.id("stallpricendays1")).sendKeys("20000");
	driver.findElement(By.id("stallpriceoneday1")).sendKeys("10000");
	WebElement Stallmodal = driver.findElement(By.name("Stall_modal"));
	Stallmodal.click();
	driver.findElement(By.id("CategoriesAllowed")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("checkCatAll")).click();
	driver.findElement(By.xpath("//*[@id=\"myModalForCheckbox\"]/div/div/div[3]/center/button[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"facilities\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"checkFavAll\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"myModalForCheckbox2\"]/div/div/div[3]/center/button[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("VisitorsCount")).sendKeys("20");
	Thread.sleep(7000);
	driver.findElement(By.xpath("//*[@id=\"new-header\"]/div[2]/a/span")).click();
	
	//Testcase 2 
	
	//leaving all mandatory fields and checking *mark highlihts in redcolor
	driver.findElement(By.xpath("//*[@id=\"new-header\"]/div[2]/a/span")).click();
	Thread.sleep(4000);
	
    driver.findElement(By.id("VisitorsCount")).sendKeys("20");
	Thread.sleep(5000);
	driver.close();
	}
}