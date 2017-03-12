package step_definitions;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONValue;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.test.Customer;
import com.test.CustomerResponse;

public class UtlImpl {

	public static List<Customer> getCustomerInfo(String custID) {
		
		CustomerResponse obj = null;
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:9999/Coal_1/rest/coal/custInfo");//1

			Customer c4 = new Customer();//2
			c4.setId(custID);

			ObjectMapper mapper = new ObjectMapper();
			//Object to JSON in String
			String jsonInString = mapper.writeValueAsString(c4);
			
			System.err.println("CUST:"+jsonInString);
			ClientResponse response = webResource.type("application/json").post(ClientResponse.class, jsonInString);

			System.err.println(response);

			System.err.println("Output from Server:"+response);
			String output = response.getEntity(String.class);
			System.err.println("RESPONSE :"+output);

			obj = mapper.readValue(output, CustomerResponse.class);	//3
			System.err.println("RESPONSE :"+obj.getList());
		} catch (Exception e) {

			e.printStackTrace();

		}
		return obj.getList();
	}
}
