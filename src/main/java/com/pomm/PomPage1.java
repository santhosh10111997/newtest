package com.pomm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PomPage1 extends BaseClass {

	
	
public PomPage1() {
	
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//input[@class='search-keyword']")
	private WebElement Search;
	@FindBy(xpath="(//button[text()='ADD TO CART'])[3]")
	private WebElement Select;
	@FindBy(xpath="//img[@alt='Cart']")
	private WebElement AddCard;
	
	
	public WebElement getSearch() {
		return Search;
	}
	public WebElement getSelect() {
		return Select;
	}
	public WebElement getAddCard() {
		return AddCard;
	}
	
	
}
	
