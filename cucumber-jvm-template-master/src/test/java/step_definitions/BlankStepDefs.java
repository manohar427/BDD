package step_definitions;

import java.util.List;

import org.junit.Assert;

import com.test.Customer;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlankStepDefs{
	
	List<Customer> list = null;
	boolean bddValue = false; 
	@Given("^Login in Coal Application$")
	public void login_in_Coal_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I enter CusromerID and Hit the Service \"(.*?)\" and \"(.*?)\"$")
	public void i_enter_CusromerID_and_Hit_the_Service_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		list =  UtlImpl.getCustomerInfo(arg1);
		if("true".equals(arg2)){
			bddValue = true;
		}else{
			bddValue = false;
		}
		
	}

	@When("^I click on Get CustomerInfo Service$")
	public void i_click_on_Get_CustomerInfo_Service() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Verify the Customer ID \"(.*?)\" is Valid one or not$")
	public void verify_the_Customer_ID_is_Valid_one_or_not(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("CUST ID::::::::::::::"+arg1+",VALIDATION:"+(list.size()>0)+",BDD Boolean Value:"+((bddValue))+",BDD raw Value:"+bddValue);
		   Assert.assertTrue(list.size()>0==bddValue);
	}
	
	
	
	/*List<Customer> list = null;
	@When("^I enter CusromerID and Hit the Service \"(.*?)\"$")
	public void i_enter_CusromerID_and_Hit_the_Service(String arg1) {
	    
		list = UtlImpl.getCustomerInfo(arg1);
	}

	@When("^I click on Get CustomerInfo Service$")
	public void i_click_on_Get_CustomerInfo_Service(){
	}

	@Then("^Verify the Customer ID \"(.*?)\" is Valid one or not \"(.*?)\"$")
	public void verify_the_Customer_ID_is_Valid_one_or_not(String arg1, String arg2){
		
		System.out.println("CUST ID::::::::::::::"+arg1+",VALIDATION:"+(list.size()>0)+",BDD Value:"+(Boolean.getBoolean(arg2)));
	   Assert.assertTrue(list.size()>0==Boolean.getBoolean(arg2));
	}
    
	@Given("^Login in Coal Application$")
	public void login_in_Coal_Application() throws Throwable {
	}*/

}