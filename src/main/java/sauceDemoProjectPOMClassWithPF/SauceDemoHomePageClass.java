package sauceDemoProjectPOMClassWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoHomePageClass {

	@FindBy(xpath = ("//div[text() = 'Sauce Labs Backpack']"))
	private WebElement sauceLabsBackpack;
	@FindBy(xpath = ("//button[@id ='add-to-cart-sauce-labs-backpack']"))
	private WebElement sauceLabsBackpackadd2cart;

	@FindBy(xpath = ("//div[text() = 'Sauce Labs Bike Light']"))
	private WebElement sauceLabsBikeLight;
	@FindBy(xpath = ("//button[@id ='add-to-cart-sauce-labs-bike-light']"))
	private WebElement sauceLabsBikeLightadd2cart;

	@FindBy(xpath = ("//div[text() = 'Sauce Labs Bolt T-Shirt']"))
	private WebElement sauceLabsBoltTShirt;
	@FindBy(xpath = ("//button[@id ='add-to-cart-sauce-labs-bolt-t-shirt']"))
	private WebElement sauceLabsBoltTShirtadd2cart;

	@FindBy(xpath = ("//div[text() = 'Sauce Labs Onesie']"))
	private WebElement sauceLabsOnesie;
	@FindBy(xpath = ("//button[@id ='add-to-cart-sauce-labs-onesie']"))
	private WebElement sauceLabsOnesieadd2cart;

	@FindBy(xpath = ("//div[text() = 'Test.allTheThings() T-Shirt (Red)']"))
	private WebElement testallTheThingsTShirtRed;
	@FindBy(xpath = ("//button[@id ='add-to-cart-test.allthethings()-t-shirt-(red)']"))
	private WebElement testallTheThingsTShirtRedadd2cart;

	@FindBy(xpath = ("//div[text() = 'Sauce Labs Fleece Jacket']"))
	private WebElement sauceLabsFleeceJacket;
	@FindBy(xpath = ("//button[@id ='add-to-cart-sauce-labs-fleece-jacket']"))
	private WebElement sauceLabsFleeceJacketadd2cart;
	
	@FindBy(xpath=("//a[@class='shopping_cart_link']"))
	private WebElement shoppingcart;
	
	WebDriver w;

	public SauceDemoHomePageClass(WebDriver w) {
		this.w = w;
		PageFactory.initElements(w, this);
	}

	public void verifySauceLabsBackpack() {
		sauceLabsBackpack.click();
	}

	public void verifySauceLabsBikeLight() {
		sauceLabsBikeLight.click();
	}

	public void verifySauceLabsBoltTShirt() {
		sauceLabsBoltTShirt.click();
	}

	public void verifySauceLabsOnesie() {
		sauceLabsOnesie.click();
	}

	public void verifyTestallTheThingsTShirtRed() {
		testallTheThingsTShirtRed.click();
	}

	public void verifySauceLabsFleeceJacket() {
		sauceLabsFleeceJacket.click();
	}

	public void verifysauceLabsBackpackadd2cart() {
		sauceLabsBackpackadd2cart.click();
	}

	public void verifysauceLabsBikeLightadd2cart() {
		sauceLabsBikeLightadd2cart.click();
	}

	public void verifysauceLabsBoltTShirtadd2cart() {
		sauceLabsBoltTShirtadd2cart.click();
	}

	public void verifysauceLabsOnesieadd2cart() {
		sauceLabsOnesieadd2cart.click();
	}

	public void verifytestallTheThingsTShirtRedadd2cart() {
		testallTheThingsTShirtRedadd2cart.click();
	}

	public void verifysauceLabsFleeceJacketadd2cart() {
		sauceLabsFleeceJacketadd2cart.click();
	}
	public void verifyshoppingcart() {
		shoppingcart.click();
	}

}
