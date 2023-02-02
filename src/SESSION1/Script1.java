package SESSION1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	
	ChromeDriver driver;
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Module\\SDM\\Workspace\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/"); //open
		driver.manage().window().maximize();     //maximize
		driver.close();  //close
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Script1 o = new Script1();
		o.open();

	}

}
