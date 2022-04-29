package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoYourCartPageClass {

	@FindBy(xpath = ("//button[text() ='Remove']"))
	private WebElement removeproduct;

	@FindBy(xpath = ("//button[@id = 'checkout']"))
	private WebElement checkout;

	@FindBy(xpath = ("//button[@id = 'continue-shopping']"))
	private WebElement continueshopping;

	WebDriver w;

	public SauceDemoYourCartPageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);
	}

	public void verifyremoveproduct() {
		removeproduct.click();
	}

	public void verifycheckout() {
		checkout.click();
	}

	public void verifycontinueshopping() {
		continueshopping.click();
	}
}
