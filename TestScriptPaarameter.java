package calculator;

//private String module;
//private String testScript;
//private String browser;

//private WebDriver driver;



public TestScriptParameters(String module, String testScript, String browser)
{
	this.module= module.trim();
	this.testScript= testScript.trim();
	this.browser= browser.trim();
}

public String getModule()
{
	return module;
}
public string getTestScript()
{
	return testScript;

}
public WebDriver createDriver()
{
	try {
		if(browser=Chrome)
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		}
	}catch(Exception e) {
	e.printStackTrace();
}
return driver;
}
public WebDriver getDriver()
{
	return driver;
}
public void closeDriver(){
	driver.quit();
}
}
