public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) 
	{
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) 
	{
		
        if (customerCheckService.CheckIfRealPerson(customer))
    {
            System.out.println("Person Checked!");
    }
    else
    {
            System.out.println("Not a valid person!");
    }
}
}