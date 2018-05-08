package Dao;

import pojo.Customer;

public interface ICustomerDao {

	boolean addCustomer(Customer customer);

	boolean deleteCustomer(int customerId);

	boolean updateCustomer(Customer customer);

	boolean loadCustomer(int customerId);

}