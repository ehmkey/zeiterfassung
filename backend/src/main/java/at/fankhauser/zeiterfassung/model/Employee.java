package at.fankhauser.zeiterfassung.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	private String phone;
	private String birthday;
	private String address;

	@Column(name = "date_of_joining")
	private LocalDate dateOfJoining;

	@Column(name = "hourly_rate")
	private Long hourlyRate;

	private String iban;
	private String bic;
	private String bankname;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "primaryKey.employee", cascade=CascadeType.ALL)
//	private List<WorkedOrder> workedOrders;
}
