package domain;

import Dao.CustomerDao;
import Dao.ICustomerDao;
import Dao.IOrderDao;
import Dao.OrderDao;
import pojo.Customer;
import pojo.Order;

public class CustomerOrderUtil {
	
	public static void addCustomer(Customer customer) {
		ICustomerDao customerDao = new CustomerDao();
		customerDao.addCustomer(customer);
	}
	
	public static void addOrder(Order order) {
		IOrderDao orderDao = new OrderDao();
		orderDao.addOrder(order);
	}
	
}
