package domain;

import java.util.ArrayList;
import java.util.List;

import pojo.Order;
import pojo.Product;

public class OrderServiceImpl {

	public Order createOrder() {
		
		
		Product product1 = new Product("engineOil", "AutoZone", "used for engine", 30);
		Product product2 = new Product("brakeshoes", "Autozone", "braking", 100);
		Product product3 = new Product("wipers", "Greenzone", "wind shield", 10);

		
		List<Product> productDetails = new ArrayList<>();
		productDetails.add(product1);
		productDetails.add(product2);
		productDetails.add(product3);
		
		return null;
		
	}
}
