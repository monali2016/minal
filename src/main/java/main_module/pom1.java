package main_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	
	@FindBy(xpath="//input[@id='inputUsername']")private WebElement username;
	@FindBy(xpath="//input[@name='inputPassword']")private WebElement password;
	@FindBy(xpath="//input[@id='chkboxOne']")private WebElement UN;
	@FindBy(xpath="//input[@id='chkboxTwo']")private WebElement privacypolice;
	@FindBy(xpath="//button[text()='Sign In']")private WebElement signin;
	@FindBy(xpath="//p[@class='error']")private WebElement text;
	@FindBy(xpath="//a[text()='Forgot your password?']")private WebElement forget;
	public pom1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setusername(String us)
	{
		username.sendKeys(us);
	}
	public void setpassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void setun()
	{
		UN.click();
	}
	public void setprivacypoice()
	{
		privacypolice.click();
	}
	public void clicksignin()
	{
		signin.click();
	}
	
	public void settext()
	{
      String t = text.getText();
      System.out.println(t);
	}
	public void setforgetpassword()
	{
	      forget.click();
	}

	
	
	
	
	
	
	
	
	
}
