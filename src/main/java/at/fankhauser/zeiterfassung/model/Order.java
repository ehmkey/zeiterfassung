package at.fankhauser.zeiterfassung.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Customer2 customer;
	private Long calcualtedHours;
	private LocalDate incomming;
	private String rechnungsnummer;
	private LocalDate Rechungsdatum;
	private Long price;
	private int kw;
	
	private List<Employee> employees;

	@ManyToMany(mappedBy = "orders")
	public List<Employee> getEmployees() {
		return employees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer2 getCustomer() {
		return customer;
	}

	public void setCustomer(Customer2 customer) {
		this.customer = customer;
	}

	public Long getCalcualtedHours() {
		return calcualtedHours;
	}

	public void setCalcualtedHours(Long calcualtedHours) {
		this.calcualtedHours = calcualtedHours;
	}

	public LocalDate getIncomming() {
		return incomming;
	}

	public void setIncomming(LocalDate incomming) {
		this.incomming = incomming;
	}

	public String getRechnungsnummer() {
		return rechnungsnummer;
	}

	public void setRechnungsnummer(String rechnungsnummer) {
		this.rechnungsnummer = rechnungsnummer;
	}

	public LocalDate getRechungsdatum() {
		return Rechungsdatum;
	}

	public void setRechungsdatum(LocalDate rechungsdatum) {
		Rechungsdatum = rechungsdatum;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", calcualtedHours=" + calcualtedHours + ", incomming="
				+ incomming + ", rechnungsnummer=" + rechnungsnummer + ", Rechungsdatum=" + Rechungsdatum + ", price="
				+ price + ", kw=" + kw + "]";
	}
}
