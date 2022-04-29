package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLastPageClass {

	@FindBy(xpath = (""))
	private WebElement homepage;

	WebDriver w;

	public SauceDemoLastPageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);
	}

	public void verifySaucedemoHomePage() {
		homepage.click();
	}

}
