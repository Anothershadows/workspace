package POJO;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.testdrive;

public class palasibazar extends testdrive {

	public palasibazar() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[starts-with(text(),'Travel')]")
	private WebElement clciktravel;

	@FindBy(id = "country")
	private WebElement tpyecountry;

	@FindBy(xpath = "//li[contains(text(),'Hong Kong')]")
	private WebElement clickcountry;

	@FindBy(xpath = "//section[@id='root']")
	private WebElement switchdate;

	@FindBy(xpath = "//span[starts-with(text(), 'Start date')]")
	private WebElement selectdate;

	@FindBy(xpath = "//button[@aria-label='Mar 27, 2025']")
	private WebElement choosedate;

	@FindBy(xpath = "//button[@aria-label=\"Apr 22, 2025\"]")
	private WebElement chooseenddate;

	@FindBy(xpath = "//*[contains(text(), 'Done')]")
	private WebElement done;

	// addtravel

	@FindBy(xpath = "//a[contains(text(), 'Add')]")
	private WebElement addtravel;

	@FindBys({ @FindBy(xpath = "//body[@class='body-fixed']"), @FindBy(id = "traveller_1") })
	private WebElement check1;

	@FindBy(xpath = "//div[@id=\"0\"]//div")
	private WebElement selectdrop;

	@FindBy(xpath = "//div[@id='optionBox_0_wrapper']")
	private List<WebElement> rangr;

	@FindBy(xpath = "//input[@id=\"ped_yes\"]/following-sibling::*[contains(text(), 'Yes')]")
	private WebElement selectyes;

	public WebElement getClciktravel() {
		return clciktravel;
	}

	public WebElement getTpyecountry() {
		return tpyecountry;
	}

	public WebElement getClickcountry() {
		return clickcountry;
	}

	public WebElement getSwitchdate() {
		return switchdate;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getChoosedate() {
		return choosedate;
	}

	public WebElement getChooseenddate() {
		return chooseenddate;
	}

	public WebElement getDone() {
		return done;
	}

	public WebElement getAddtravel() {
		return addtravel;
	}

	public WebElement getCheck1() {
		return check1;
	}

	public WebElement getSelectdrop() {
		return selectdrop;
	}

	public void selectDropdownByIndex(int index) {
		selectdrop.click();
		rangr.get(index).click();

	}

	public WebElement getSelectyes() {
		return selectyes;
	}

}
