package pojo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer_order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_Number")
	private int orderNumber;
	@Column(name = "order_Date")
	private LocalDate orderDate;
	@Column(name = "status")
	private String status;
	@Column(name = "shipping_Date")
	private LocalDate shippingDate;
	@Column(name = "delivery_Date")
	private LocalDate deliveryDate;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<Product> productDetails;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	
	public Order() {
		
	}

	public Order(LocalDate orderDate, String status, LocalDate shippingDate, LocalDate deliveryDate, List<Product> productDetails) {
		this.orderDate = orderDate;
		this.status = status;
		this.shippingDate = shippingDate;
		this.deliveryDate = deliveryDate;
		this.productDetails = productDetails;
	}

}
