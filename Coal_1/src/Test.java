import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONValue;

import com.test.Customer;

public class Test {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		Customer c4 = new Customer();
		c4.setEmail("Customer4@email.com");
		c4.setName("Customer4");
		c4.setAddress("Hyderanad,India");
		c4.setOrderQuanty(987009800);
		c4.setStatus("Completed");
		c4.setTransport("Truck");
		c4.setId("C0003003");

		
		ObjectMapper mapper = new ObjectMapper();
		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(c4);
		System.out.print(jsonInString);
	}

}
