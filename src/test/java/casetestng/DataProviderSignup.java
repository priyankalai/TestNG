package casetestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSignup {
	
	@Test(dataProvider = "signup")
	public void Signuptest(String first, String last, long phone, String pass) {
			System.out.println("first name is "+first);
			System.out.println("last name is "+last);
			System.out.println("phone name is "+phone);
			System.out.println("pass name is "+pass);
			System.out.println("==============");
	}
	
	@DataProvider(name = "signup")
	public Object[][] data() {
		return new Object[][] {
			{"kalai","priyan",3456887634l,"ftyuj4@"},
			{"karglai","prbrhrdiyan",347634l,"ftycxvbcuj4@"},
			{"edhdhgdh","prvrhiyan",6887634l,"ftfrj4@"}
		
	};
}
}
