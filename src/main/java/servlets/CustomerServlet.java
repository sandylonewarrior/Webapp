package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerOrderUtil;
import pojo.Address;
import pojo.Customer;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerServlet() {
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {

	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet customer servlet called");
		String customerName = request.getParameter("customer_Name");
		int customerPhone = Integer.parseInt(request.getParameter("customer_Phone"));
		String city = request.getParameter("customer_City");
		String state = request.getParameter("customer_State");
		String aptNo = request.getParameter("customer_AptNo");
		String country = request.getParameter("customer_Country");
		Customer customer = new Customer();
		customer.setFirstName(customerName);
		customer.setPhone(customerPhone);
		
		Address address = new Address();
		address.setCity(city);
		address.setState(state);
		address.setAptNo(aptNo);
		address.setCountry(country);
		customer.setAddress(address);
		//CustomerOrderUtil.addCustomer(customer);
		request.setAttribute("customer", customer);
		RequestDispatcher rd = request.getRequestDispatcher("/views/CustomerSearch.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
