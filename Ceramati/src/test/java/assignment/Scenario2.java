package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.WebDriverUtility;

public class Scenario2 extends BaseClass
{
	@Test
	public void scenarioTest() throws InterruptedException
	{

		WebDriverUtility wlib = new WebDriverUtility();
		wlib.maximizebrowser(driver);
		wlib.waitForPageLoad(driver);

		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("MackBook");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		// verifying the first name result
		WebElement firstname = driver.findElement(By.xpath("//input[@value='MackBook']"));
		Assert.assertEquals(true, firstname.isDisplayed());
		System.out.println("first result name matches with the search string.");


		// code for the clear data and search for apparel
		WebElement utb = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		utb.sendKeys("MackBook");
		utb.clear();
		Thread.sleep(2000);
		utb.sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 


		// verifying the page load completly
		driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2334524.m570.l1313&_nkw=Computers&_sacat=0&LH_TitleDesc=0&_osacat=0&_odkw=macbook");
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);

		Assert.assertEquals(false, titleofpage.isEmpty());
		System.out.println("Page Load Completely");

		driver.close();





	}

}
