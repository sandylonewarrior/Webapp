package domain;

import pojo.Customer;

public class ServiceImpl {

	public Customer getCustomer(Long customerId) {
		if (customerId.intValue() == 101) {
			return new Customer( "Raj", 1011402000);
		}
		
		return null;
	}
}
