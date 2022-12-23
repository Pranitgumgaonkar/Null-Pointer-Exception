package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCart {

	@FindBy(name = "fl_login_btn")
	private WebElement loginbutton;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailtb;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordtb;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement button;


	public AddToCart(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void login() 
	{
			loginbutton.click();
	}

	public void enteremail(String email) 
	{
		emailtb.sendKeys(email);
	}

	public void enterpassword(String password) 
	{
		passwordtb.sendKeys(password);
	}

	public void clickbutton() 
	{
		button.click();
	}

}
