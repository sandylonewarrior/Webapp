package pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {

	/*@Id
	@Column(name = "customer_id")
	//@GeneratedValue(generator = "gen")
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = 
	@Parameter(name = "property", value = "customer"))
	private int id;*/

	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "aptNo")
	private String aptNo;
	@Column(name = "country")
	private String country;

	/*@OneToOne
	@PrimaryKeyJoinColumn
	private Customer customer;*/
	
	public Address() {
		
	}

	public Address(String city, String state, String aptNo, String country) {
		this.city = city;
		this.state = state;
		this.aptNo = aptNo;
		this.country = country;
	}

}
