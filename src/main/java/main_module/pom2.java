package main_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	
	@FindBy(xpath="//button[text()='Reset Login']")private WebElement resetlogin;
	@FindBy(xpath="//button[text()='Go to Login']")private WebElement gotologin;
	
	public pom2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickrestlogin()
	{
		resetlogin.click();
	}
	public void clickgotologin()
	{
		gotologin.click();
	}

}
