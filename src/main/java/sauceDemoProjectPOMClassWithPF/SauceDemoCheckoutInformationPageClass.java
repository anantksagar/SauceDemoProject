package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckoutInformationPageClass {

	@FindBy(xpath = ("//input[@id = 'first-name']"))
	private WebElement firstname;

	@FindBy(xpath = ("//input[@id = 'last-name']"))
	private WebElement lastname;

	@FindBy(xpath = ("//input[@id = 'postal-code']"))
	private WebElement postalcode;

	@FindBy(xpath = ("//input[@id = 'continue']"))
	private WebElement continuebutton;

	@FindBy(xpath = ("//button[@id = 'cancel']"))
	private WebElement cancelbutton;

	WebDriver w;

	public SauceDemoCheckoutInformationPageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);
	}

	public void setSauceDemoFirstname() {
		firstname.sendKeys("Anant");
	}

	public void setSauceDemoLastname() {
		lastname.sendKeys("Kshirsagar");
	}

	public void setSauceDemoPostalcade() {
		postalcode.sendKeys("431109");
	}

	public void verifySauceDemocontinuebutton() {
		continuebutton.click();
	}

	public void verifySauceDemoCancelbutton() {
		cancelbutton.click();
	}
}
