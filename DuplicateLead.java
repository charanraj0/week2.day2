package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");

		WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");

		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

		WebElement crmfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmfaElement.click();

		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();

		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();

		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");

		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Charan raj");

		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Baskaran");

		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		firstNameLocal.sendKeys("charan");

		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		sourceDropdown.sendKeys("Employee");

		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Testing");

		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Testing the description field ");

		WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddress.sendKeys("test@testleaf.com");

		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateProvince);
		state.selectByVisibleText("Georgia");

		WebElement createButton = driver.findElement(By.name("submitButton"));
		createButton.click();

		System.out.println("The title of the page :" + driver.getTitle());

		WebElement duplicateButton = driver.findElement(By.linkText("Duplicate Lead"));
		duplicateButton.click();

		WebElement clearCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		clearCompanyName.clear();
		clearCompanyName.sendKeys("AirVoice International");

		WebElement clearfirstName = driver.findElement(By.id("createLeadForm_firstName"));
		clearfirstName.clear();
		clearfirstName.sendKeys("Raj Charan");
		
		WebElement duplicateCreate = driver.findElement(By.name("submitButton"));
		duplicateCreate.click();


		System.out.println("The title of the page :" + driver.getTitle());
	}
}
