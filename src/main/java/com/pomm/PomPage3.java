package com.pomm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PomPage3 extends BaseClass{
	
	public PomPage3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@style='width: 200px;']")
	private WebElement country;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agree;
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbutton;
	
	
	public WebElement getCountry() {
		return country;
	}
	public WebElement getAgree() {
		return agree;
	}
	public WebElement getProceedbutton() {
		return proceedbutton;
	}
	
	
	
	
}
