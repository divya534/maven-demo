package com.codebird;

import org.junit.Test;
import org.testng.Assert;

public class AppTest {

	@Test
	public void testlogin1() {
		
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc","abc123"));
	}
@Test
public void testlogin2() {
	
	App myapp=new App();
	Assert.assertEquals(1,myapp.userLogin("abc","abc@123"));
}
}
