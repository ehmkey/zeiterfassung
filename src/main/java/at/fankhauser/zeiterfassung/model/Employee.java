package at.fankhauser.zeiterfassung.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstname;
	private String lastname;
	private String phone;
	private String birthday;
	private String address;

	private LocalDate eintrittsdatum;
	private Long stundensatz;
	private String iban;
	private String bic;
	private String bankname;
	
//	private List<Order> orders;

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "work", joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))
//	public List<Order> getOrders() {
//		return orders;
//	}

}
