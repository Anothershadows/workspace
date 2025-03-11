package POJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import base.reusable;

public class irdaPOJO extends reusable {
	  public irdaPOJO() {
	        // Initialize elements with PageFactory
	        PageFactory.initElements(driver, this);
	    }
	
	public WebElement getClickservice() {
		return clickservice;
	}

	public WebElement getSelectfromedate() {
		return selectfromedate;
	}

	public WebElement getChoosedate() {
		return choosedate;
	}

	@FindBy(xpath="driver.findElement(By.id(\"layout_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_84\"))")
	private WebElement clickservice;
	
	@FindBy(id="_com_irdai_document_media_IRDAIDocumentMediaPortlet_filterFromDate")
	private WebElement selectfromedate;
	
	@FindBy(xpath ="//a[text()='15']")
	private WebElement choosedate;
	
}
