package pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity(name = "Product")
public class Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_Code")
	private int productCode;
	@Column(name = "product_Name")
	private String productName;
	@Column(name = "product_Vendor")
	private String productVendor;
	@Column(name = "Description")
	private String Description;
	@Column(name = "priceEach")
	private int priceEach;
	@Column(name = "order_Date")
	private LocalDate orderDate;
	@ManyToOne
	@JoinColumn(name = "order_Number")
	private Order order;
	
	
	//private int orderNumber;
	
	public Product() {
		
	}
	
	public Product(String productName, String productVendor, String Description, int priceEach) {
		this.productName = productName;
		this.productVendor = productVendor;
		this.Description = Description;
		this.priceEach = priceEach;
		}
	
	
	
	

}
