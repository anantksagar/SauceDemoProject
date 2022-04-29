package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoOverviewPageClass {

	@FindBy(xpath = ("//button[@id ='cancel']"))
	private WebElement cancel;

	@FindBy(xpath = ("//button[@id ='finish']"))
	private WebElement finish;

	WebDriver w;

	public SauceDemoOverviewPageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);
	}

	public void verifySauceDemoCancel() {
		cancel.click();
	}

	public void verifySauceDemofinish() {
		finish.click();
	}

}
