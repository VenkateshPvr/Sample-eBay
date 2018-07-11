package com.ebay.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class SearchResultsPage {

   private static final By SEARCH_BOX = By.id("  ");
   private static final By SEARCH_INPUT = By.id("  ");
   private static final By SEARCH_GO_BUTTON = By.id("  ");
   private static final By NAVIGATION_ITEM_CART = By.id(" ");
   private WebDriver driver; 
   public SearchResultsPage(WebDriver driver) {
      this.driver = driver;
   }
   public SearchResultsPage searchFor(String category, String searchKey) {
      new Select(driver.findElement(SEARCH_BOX))
            .selectByVisibleText(category);
      driver.findElement(SEARCH_INPUT)
            .sendKeys(searchKey);
      driver.findElement(SEARCH_GO_BUTTON)
            .click();
      return new SearchResultsPage(driver);
   }
  public CartPage navigateToCartPage() {
      driver.findElement(NAVIGATION_ITEM_CART)
            .click();
      return new CartPage(driver);

   }

}