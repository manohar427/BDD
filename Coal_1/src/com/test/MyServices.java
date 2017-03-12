package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/coal")
public class MyServices {

	List<Customer> list = new ArrayList<Customer>();
	/*
	 * @GET
	 * 
	 * @Produces("text/html")
	 * 
	 * @Path("/custinfo") public Response getCustomerInfo() { // business return
	 * Response.ok("<B> Here is your Customer Information</B>").build(); }
	 */
	 @POST
	  
	  @Produces("text/html")
	 
	  @Path("/accinfo") public Response getAccInfo() { // business
		 return
	  Response.ok("<B> Here is your Acc Information</B>").build(); }
	 

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/custList")
	public List<Customer> getCustomerList() {

		

		Customer c1 = new Customer();
		c1.setEmail("Customer1@email.com");
		c1.setName("Customer1");
		c1.setAddress("Bangalore,India");
		c1.setOrderQuanty(100000);
		c1.setStatus("Completed");
		c1.setTransport("Train");
		c1.setId("C0001000");

		Customer c2 = new Customer();
		c2.setEmail("Customer2@email.com");
		c2.setName("Customer2");
		c2.setAddress("Delhi,India");
		c2.setOrderQuanty(100400);
		c2.setStatus("Declined");
		c2.setTransport("Boat");
		c2.setId("C0002000");

		Customer c3 = new Customer();
		c3.setEmail("Customer3@email.com");
		c3.setName("Customer3");
		c3.setAddress("Noida,India");
		c3.setOrderQuanty(30234000);
		c3.setStatus("Pending");
		c3.setTransport("Train");
		c3.setId("C0003000");

		Customer c4 = new Customer();
		c4.setEmail("Customer4@email.com");
		c4.setName("Customer4");
		c4.setAddress("Hyderanad,India");
		c4.setOrderQuanty(987009800);
		c4.setStatus("In-progress");
		c4.setTransport("Truck");
		c4.setId("C0004000");

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		return list;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/custInfo")
	public CustomerResponse getCustomerInfo(Customer c) {

		System.out.println("CUST INFO:"+c);
		List<Customer> list = new ArrayList<Customer>();

		Customer c4 = new Customer();
		c4.setEmail("Customer4@email.com");
		c4.setName("Customer4");
		c4.setAddress("Hyderanad,India");
		c4.setOrderQuanty(987009800);
		c4.setStatus("Completed");
		c4.setTransport("Truck");
		c4.setId("C0004000");

		Customer c2 = new Customer();
		c2.setEmail("Customer2@email.com");
		c2.setName("Customer2");
		c2.setAddress("Delhi,India");
		c2.setOrderQuanty(100400);
		c2.setStatus("Completed");
		c2.setTransport("Boat");
		c2.setId("C0002000");

		Customer c6 = new Customer();
		c6.setEmail("Customer6@email.com");
		c6.setName("Customer6");
		c6.setAddress("Delhi,India");
		c6.setOrderQuanty(100400);
		c6.setStatus("Completed");
		c6.setTransport("Boat");
		c6.setId("C0006000");
		
		CustomerResponse cs = new CustomerResponse();
		cs.setStatus("Customer Found");
		if (c6.getId().equals(c.getId())) {
			list.add(c6);
		} else if (c4.getId().equals(c.getId())) {
			list.add(c4);
		} else if (c2.getId().equals(c.getId())) {
			list.add(c2);
		} else {
			cs.setStatus("No Customer Found");
		}
		cs.setList(list);
		return cs;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/saveCustInfo")
	public CustomerResponse saveCustomerInfo(Customer c) {

		list.add(c);

		CustomerResponse cs = new CustomerResponse();
		cs.setStatus("Customer Info Saved successfully..");
		
		cs.setList(list);
		return cs;
	}
	
}
