package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauceDemoCompletePageClass {

	@FindBy(xpath = ("//button[text() = 'Back Home']"))
	private WebElement backhome;

	WebDriver w;

	public sauceDemoCompletePageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);
	}

	public void verifyBackHomebutton() {
		backhome.click();
	}
}
