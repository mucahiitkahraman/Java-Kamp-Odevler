import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) 
	{
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean check = false;
		
		try 
		{
	      check = client.TCKimlikNoDogrula(Long.parseLong
	    		  (customer.getNationaltyId()), 
	    		   customer.getFirstName().toUpperCase(),
				   customer.getLastName().toUpperCase(),
				   customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} catch (RemoteException e) 
		{
			e.printStackTrace();
		}
		return check;
	}
	
}
