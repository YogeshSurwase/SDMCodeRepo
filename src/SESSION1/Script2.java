package SESSION1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	
	ChromeDriver driver;
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Module\\SDM\\Workspace\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/"); //open
		driver.manage().window().maximize();     //maximize
		//driver.close();  // close
	}
	
	public void login()
	{
		//User ID :	mngr474836
		//Password :	nytyqEd
		WebElement usnm =driver.findElement (By.name("uid"));
		usnm.sendKeys("mngr474836");
		driver.findElement(By.name("password")).sendKeys("nytyqEd");  //function chaning
		driver.findElement(By.name("btnLogin")).click();
		//driver.findElement(By.linkText("New Customer")).click();
	}
	
	public void addNewCustomer() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.linkText("New Customer")).click();
		/*
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("pratik");
		driver.findElement(By.xpath("//input[@value=\"m\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys("08/12/1999");
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("Amravati");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Amravati");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name=\"pinno\"]")).sendKeys("444604");
		driver.findElement(By.xpath("//input[@name=\"telephoneno\"]")).sendKeys("9309295165");
		driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("ashwini@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name=\"sub\"]")).click();
		
		*/
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("name")).sendKeys("Pranav patil");
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
	    driver.findElement(By.name("dob")).sendKeys("14/11/1995");
	    driver.findElement(By.name("addr")).sendKeys("Latur");
	    driver.findElement(By.name("city")).sendKeys("Latur");
	    driver.findElement(By.name("state")).sendKeys("Maharastra");
	    driver.findElement(By.name("pinno")).sendKeys("413102");
	    driver.findElement(By.name("telephoneno")).sendKeys("1234567");
	    driver.findElement(By.name("emailid")).sendKeys("Latur12@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Latur");
	    driver.findElement(By.name("sub")).click();
	    
	}
	public void editCustomer() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.linkText("Edit Customer")).click();
		Thread.sleep(5000);
		///html/body/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("91414");
		///html/body/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]
		///html/body/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]
		driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
						
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Script2 o = new Script2();
		o.open();
		o.login();
		//o.addNewCustomer();
		o.editCustomer();

	}

}
