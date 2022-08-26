Feature: Adding a customer to the bank

		
	Scenario Outline: Adding 4 customers
		Given Launch the Application
		When i click bank manager login button and add customer button
		Then i should enter <FirstName> and <LastName> and <PostCode> and click addCustomer button
		Then i should handle the alert box
		
		
		
		Examples:
							|FirstName|LastName|PostCode|
							|Anand		|Anand	 |534001  |
							|Anil			|Anil 	 |456123	|
							|Vijay		|vijay	 |789456  |
							|Hussain	|Hussain |456123	|
		
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		