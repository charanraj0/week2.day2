package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditWebPage {
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

		WebElement marketingDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown = new Select(marketingDropdown);
		dropDown.selectByIndex(3);

		WebElement industryDropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown1 = new Select(industryDropdown);
		dropDown1.selectByVisibleText("Computer Hardware");

		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateProvince);
		state.selectByVisibleText("Georgia");

		WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown2 = new Select(ownershipDropdown);
		dropDown2.selectByValue("OWN_PARTNERSHIP");

		WebElement createButton = driver.findElement(By.name("submitButton"));
		createButton.click();
		
		WebElement editButton = driver.findElement(By.linkText("Edit"));
		editButton.click();	
		
		WebElement descriptionClear = driver.findElement(By.id("updateLeadForm_description"));
		descriptionClear.clear();
		
		WebElement importantNotefield = driver.findElement(By.id("updateLeadForm_importantNote"));
		importantNotefield.sendKeys("Testing the Important Note field ");
		
		WebElement update = driver.findElement(By.xpath("//input[contains(@value,\"Update\")]"));
		update.click();

		System.out.println("The title of the page :" + driver.getTitle());
	}
}
