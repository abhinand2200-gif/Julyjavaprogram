package automationtest.pkg;

import org.testng.annotations.Test;

import Envtest.pkg.TestEnvironmentdetails;
import Exelutlities.Exelutlity;
import automaiontestPage.pkg.TestloginPagedetails;

public class TestloginTest extends TestEnvironmentdetails {
	@Test
	public void verifyLoginWithvalidcred() throws Exception {
		TestloginPagedetails p1 = new TestloginPagedetails(driver);
		
		String xl="C:\\Users\\dell\\Downloads\\Untitled spreadsheet.xlsx";
		String sheet="sheet1";
		int rowCount= Exelutlity.getRowCount(xl,sheet);
		System.out.println("total Rows"+rowCount);
		for (int i = 1; i <= rowCount; i++)
		{
			{
		    String UserName = Exelutlity.getcellvalue(xl, sheet, i, 0);
		    System.out.println("Username : " + UserName);
		    String pwd = Exelutlity.getcellvalue(xl, sheet, i, 1);
		    System.out.println("password : " + pwd);
		    p1.inputvalues(UserName, pwd);
		    p1.clickbtn();
		    String expectedurl = "https://practicetestautomation.com/practice-test-login/";
		    String actualurl = driver.getCurrentUrl();
		    
		    if (actualurl.contains(expectedurl)) {
		        System.out.println("Test Passed");
		    } else {
		        System.out.println("Test Failed");
		    }
		}
		   
		}
		
}