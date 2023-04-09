package com.crm.Objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	// initilization

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	// declaration

	@FindBy(xpath="//li[@class='hl-cat-nav__js-tab hl-cat-nav__no-sub']")
	private WebElement dealbutton;



	// methods

	public WebElement getDealbutton() 
	{
		return dealbutton;
	}


	// buisness logics
	/**
	 * used for homepage app
	 * @param deal
	 * @author Tushar
	 */

	public void deal()
	{
		dealbutton.click();

	}




}
