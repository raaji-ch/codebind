package com.codebind;

import org.junit.*;

public class Apptest {

	@Test
	public void test() {
		// create instance of HelloWorld class
        Greeting h = new Greeting();
        
        String result=h.getGreeting("Tester");
        Assert.assertEquals("Not matched...", "Hello Tester", result);
		
	}

}
