package iPAddressValidation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.*;



public class IPAddressValidatorTest {
	private IPAddressValidator ipAddressValidator;
	
	@BeforeClass
	
	public void initData(){
		ipAddressValidator= new IPAddressValidator();
	
	}
	
	@DataProvider
	public Object[][] ValidIPAddressProvider(){
		return new Object[][]{
			new Object[] {"1.1.1.1"},
			new Object[] {"192.168.1.1"},
			new Object[] {"10.10.1.1"},
			new Object[] {"132.254.111.10"},
			new Object[] {"26.10.2.10"},
			new Object[] {"127.0.0.1"}
		};
	}
	
	@DataProvider
	
	public Object[][] InValidIPAddressProvider(){
		return new Object[][]{
			new Object[] {"10.10.10"},
			new Object[] {"10.10"},
			new Object[] {"10"},
			new Object[] {"a.a.a.a"},
			new Object[] {"10.0.0.a"},
			new Object[] {"22.2222.22.2"},
			new Object[] {"10.10.10"},
			new Object[] {"10.10.10"},
		};
	}
	
	@Test(dataProvider="ValidIPAddressProvider")
	public void ValidIPAddressTest(String ip){
		System.out.println("Printing valid ones"+ip);
		boolean valid=ipAddressValidator.validate(ip);
		System.out.println("IP Address is valid:"+ip+ ","+"valid");
		AssertJUnit.assertEquals(true, valid);
		
		}
	
	@Test(dataProvider="InValidIPAddressProvider")
	public void InValidIPAddressTest(String ip){
		System.out.println("Printing IP inside InValidIPAddressTest "+ip);
		//final String ipnew=ip;
		boolean valid=ipAddressValidator.validate(ip);
		 System.out.println("IPAddress is valid : " + ip + " , " + valid);
		   AssertJUnit.assertEquals(false, valid);
			
		}
				
		
	}


