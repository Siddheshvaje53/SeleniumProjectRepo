package login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFunctionality {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside beforeMethod");
	}
	
	@Test
	public void test() {
		System.out.println("Inside test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Inside afterClass");
	}

}
