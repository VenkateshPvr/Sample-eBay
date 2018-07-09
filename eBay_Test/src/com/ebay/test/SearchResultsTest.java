package com.ebay.test;

import org.testng.annotations.Test;

public class SearchResultsTest {
	
   @Test
	    public void TestSearchResults()
	    {
	        SearchResultsTest SearchResultsPage = new SearchResultsTest();
	        if(SearchResultsPage.validateSignInpage() == true){
	        	System.out.println("pass");
	        }
	        else{
	            System.out.println("Search failed");
	        }

	    }

private boolean validateSignInpage() {
	// TODO Auto-generated method stub
	return false;
}

}
