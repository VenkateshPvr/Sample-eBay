package com.ebay.test;

import org.testng.annotations.Test;

public class SignInTest {

    @Test
    public void testSignIn()
    {
        SignInTest SignInPage = new SignInTest();
        if(SignInPage.validateSignInpage() == true){
            SignInPage.testSignInWithoutCredentials();
            System.out.println("pass");
        }
        else{
            System.out.println("Validation failed");
        }

    }

	private void testSignInWithoutCredentials() {
		// TODO Auto-generated method stub
		
	}

	private boolean validateSignInpage() {
		// TODO Auto-generated method stub
		return false;
	}
}