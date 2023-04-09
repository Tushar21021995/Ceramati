package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.WebDriverUtility;

public class Scenario1 extends BaseClass
{

	@Test
	public void scenario1Test() throws InterruptedException
	{
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.maximizebrowser(driver);
		wlib.waitForPageLoad(driver);

		// navigate to search by catagery
		driver.findElement(By.id("gh-shop-ei")).click();

		// clicking on electronic
		driver.findElement(By.xpath("//a[text()='Electronics']")).click();

		// navigate to cell phone and accessories
		driver.findElement(By.xpath("//span[text()='Cell Phones & Accessories']")).click();

		// click on cell phone and smartphones
		driver.findElement(By.xpath("//a[text()='Cell Phones & Smartphones']")).click();

		driver.findElement(By.xpath("//div[@class='b-carousel__header  sameline']/descendant::span[text()='See All'][1]")).click();

		// adding 3 filters and clicking  on apply

		driver.findElement(By.xpath("//span[text()='Screen Size']")).click();
		driver.findElement(By.xpath("//span[ text()='6 in or More']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='c3-mainPanel-price']/descendant::span[text()='Price']")).click();
		driver.findElement(By.xpath("//input[@pattern='\\d*'][1]")).sendKeys("100");
		driver.findElement(By.xpath("//div[@id='c3-subPanel-_x-price-textrange']/descendant::input[@pattern='\\d*'][2]")).sendKeys("200");
		Thread.sleep(2000);


		driver.findElement(By.xpath("//span[text()='Item Location']")).click();
		driver.findElement(By.xpath("//input[@value='Worldwide']")).click();
		driver.findElement(By.xpath("//button[@class='x-overlay-footer__apply-btn btn btn--primary']")).click();
		Thread.sleep(2000);



		// verify the tags are applied or not

		WebElement filterapplied = driver.findElement(By.xpath("//span[text()='3 filters applied']"));
		filterapplied.click();

		Assert.assertEquals(true, filterapplied.isDisplayed());
		System.out.println("Three Filters Are Applied");
		
		// verifying 1st filter tag 
		WebElement firstfiltertag = driver.findElement(By.xpath("//span[text()='Screen Size: 6 in or More']"));
		firstfiltertag.getText();
		System.out.println(firstfiltertag);
		Assert.assertEquals(true, firstfiltertag.isDisplayed());
		System.out.println("First Filter Applied");
		
		// verifying 2nd filter tag
		WebElement secondfiltertag = driver.findElement(By.xpath("//span[text()='Price: $100.00 to $200.00']"));
		secondfiltertag.getText();
		System.out.println(secondfiltertag);
		Assert.assertEquals(true, secondfiltertag.isDisplayed());
		System.out.println("second Filter Applied");
		
		//verifying 3rd filter tag
		WebElement thirdfiltertag = driver.findElement(By.xpath("//span[text()='Item Location: Worldwide']"));
		thirdfiltertag.getText();
		System.out.println(thirdfiltertag);
		Assert.assertEquals(true, thirdfiltertag.isDisplayed());
		System.out.println("third Filter Applied");
		

		driver.close();



	}


}


