package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart2 {

	@FindBy(id="search")
	private WebElement searchbox;
	
	@FindBy(id="search_prod")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//button[text()='add to cart'])[1]")
	private WebElement cart;
	
	@FindBy(id="cart_fl")
	private WebElement carticon;
	
	public AddToCart2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchtextbox(String type)
	{
		searchbox.sendKeys(type);
	}
	public void clickserachbtn()
	{
		searchbtn.click();
	}
	
	public void cartbtn()
	{
		cart.click();
	}
	
	public void cart()
	{
		carticon.click();
	}
	
}
