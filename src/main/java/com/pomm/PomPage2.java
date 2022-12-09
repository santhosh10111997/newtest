package com.pomm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PomPage2 extends BaseClass {
	
	public PomPage2(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	private WebElement Proceed;
	@FindBy(xpath="//input[@class='promoCode']")
	private WebElement Promocode;
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement Apply;
	@FindBy(xpath="//button[text()='Place Order']")
	private WebElement Placeorder;
	@FindBy(xpath="//select[@style='width: 200px;']")
	private WebElement country;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement agree;
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedbutton;
	
	
	
	
	public WebElement getProceed() {
		return Proceed;
	}
	public WebElement getPromocode() {
		return Promocode;
	}
	public WebElement getApply() {
		return Apply;
	}
	public WebElement getPlaceorder() {
		return Placeorder;
	}
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
