package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SauceDemo {
public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		WebElement productname = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
	    String text1 = productname.getText();	
	    System.out.println("The first ProductName that displays in the page is =  "+text1);
	    
	    WebElement productprice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
	    String text2 = productprice.getText();
	    System.out.println("The first ProductPrice that displays in the page is =  "+text2);
	    driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]")).click();
	    driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
	    
	    WebElement cartprice = driver.findElement(By.xpath("//div[text()='29.99']"));
	    if(text2.equals(cartprice)) {
	    	System.out.println("The product price in the cart matches the inventory price");
	    }else {
	    	System.out.println("The product price in the cart does not matches the inventory price");
	    	
	    }
	    
	    driver.findElement(By.linkText("CHECKOUT")).click();
	    driver.findElement(By.id("first-name")).sendKeys("Kirthi");
	    driver.findElement(By.id("last-name")).sendKeys("R");
	    driver.findElement(By.xpath("//input[@id='postal-code']"));
	    driver.findElement(By.xpath("//input[@value='CONTINUE']"));
	
	

}
}
