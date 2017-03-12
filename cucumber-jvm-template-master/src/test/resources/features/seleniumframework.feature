Feature: Validating the Coal user information based on ClinetID 

Scenario Outline: Login to Coal Application 

	Given Login in Coal Application 
	When I enter CusromerID and Hit the Service "<CustomerID>" and "<Valid>"
	And I click on Get CustomerInfo Service 
	Then Verify the Customer ID "<CustomerID>" is Valid one or not 
	
	Examples: 
		|  CustomerID     |  Valid    |
		|  C0003000       |  false    |
		|  C0004000       |  true     |
		|  C0002000       |  true     |
		|  C0001000       |  false    |
		|  C0005000       |  false    |
		|  C0006000       |  true     |
		|                 |  false    |
		|  XYZ            |  false    |
		