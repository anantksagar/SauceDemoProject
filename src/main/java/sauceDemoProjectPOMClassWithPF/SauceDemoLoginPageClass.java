package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPageClass {

	@FindBy(xpath = "(//input[@id = 'user-name'])")
	private WebElement username;

	@FindBy(xpath = ("//input[@id = 'password']"))
	private WebElement password;

	@FindBy(xpath = ("//input[@id = 'login-button']"))
	private WebElement loginbutton;

	WebDriver w;

	public SauceDemoLoginPageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);
	}

	public void setsaucedemousername() {
		username.sendKeys("standard_user");
	}

	public void setsaucedemopassword() {
		password.sendKeys("secret_sauce");
	}

	public void verifysaucedemologinbutton() {
		loginbutton.click();
	}
}
