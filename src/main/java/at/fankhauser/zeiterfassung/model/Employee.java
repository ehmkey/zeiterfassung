package at.fankhauser.zeiterfassung.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "primaryKey.employee", cascade=CascadeType.ALL)
	private List<WorkedOrder> workedOrders;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Long getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(Long hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone
				+ ", birthday=" + birthday + ", address=" + address + ", dateOfJoining=" + dateOfJoining
				+ ", hourlyRate=" + hourlyRate + ", iban=" + iban + ", bic=" + bic + ", bankname=" + bankname + "]";
	}
}
