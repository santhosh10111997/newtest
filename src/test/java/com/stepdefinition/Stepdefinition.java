package com.stepdefinition;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.helper.FileReaderManager;
import com.pomm.PomPage1;
import com.pomm.PomPage2;
import com.pomm.PomPage3;

import io.cucumber.java.en.*;

public class Stepdefinition extends BaseClass {
	
	public static PomPage1 p1;
    public static PomPage2 p2;
  
	
@Given("User Launch The Greenskart Url")
public void user_Launch_The_Greenskart_Url() throws InterruptedException, IOException {
 //  BrowserLaunch("chrome");
 //  urlLaunch("https://rahulshettyacademy.com/seleniumPractise/#/");
	String browser = FileReaderManager.getInstance().getBrowser();
	BrowserLaunch(browser);
	String url = FileReaderManager.getInstance().getUrl();
	urlLaunch(url);
   maximize();
   implicitlyWait(10);
   
}

@When("User Search The Vegetables")
public void user_Search_The_Vegetables() {
	 p1=new PomPage1();
     sendKeys(p1.getSearch(), "cucumber");

}

@And("User Select the particular Vegetable")
public void user_Select_the_particular_Vegetable() {
   Click(p1.getSelect());
}

@Then("User Add The Product In Add To the Card")
public void user_Add_The_Product_In_Add_To_the_Card() {
   Click(p1.getAddCard());
	
}

@When("User go to checkout page")
public void user_go_to_checkout_page() {
   p2=new PomPage2();
   Click(p2.getProceed());
}

@And("User Apply the Promo Code")
public void user_Apply_the_Promo_Code() throws InterruptedException {
	Thread.sleep(4000);
  sendKeys(p2.getPromocode(), "12345");
  Click(p2.getApply());
}

@Then("User place the order")
public void user_place_the_order() throws InterruptedException {
   Click(p2.getPlaceorder());
   Thread.sleep(4000);
}

@When("User Select a Country")
public void user_Select_a_Country() throws InterruptedException {
	System.out.println("done");
	selectByValue(p2.getCountry(), "India");
	 Thread.sleep(4000);
}

@And("User Click The Agree button")
public void user_Click_The_Agree_button() {
   Click(p2.getAgree());
}
@And("User Click The Proceed button")
public void user_Click_The_Proceed_button() {
   Click(p2.getProceedbutton());
}

@Then("Next Page Shown")
public void next_Page_Shown() throws InterruptedException {
	Thread.sleep(4000);
	quit();
}

	

}
