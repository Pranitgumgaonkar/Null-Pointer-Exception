package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Ecommerce.Firelawn.genericLib.BaseClass;

import PomPages.AddToCart;
import PomPages.AddToCart2;


public class AddToCartExecute extends BaseClass {
	
	
	@Test
	
	public void tc() throws InterruptedException
	{
		AddToCart a1=new AddToCart(driver);
	 
	  a1.login();
	  a1.enteremail("pranitgumgaonkar@gmail.com");
	  a1.enterpassword("Pranit@97");
	  a1.clickbutton();
	  
	  AddToCart2 a2=new AddToCart2(driver);
	  a2.searchtextbox("men");
	  a2.clickserachbtn();
	  a2.cartbtn();
	  Thread.sleep(20000);
	  a2.cart();
	}
}
