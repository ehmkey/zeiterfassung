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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	@Column(name ="calcualted_hours")
	private Long calcualtedHours;
	
	@Column(name ="order_date")
	private LocalDate orderDate;
	
	@Column(name ="invoice_number")
	private String invoiceNumber;
	
	@Column(name ="invoice_date")
	private LocalDate invoiceDate;
	
	private Long price;
	
	@Column(name ="delivery_week")
	private int deliveryWeek;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "primaryKey.order", cascade=CascadeType.ALL)
	private List<WorkedOrder> workedOrders; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCalcualtedHours() {
		return calcualtedHours;
	}

	public void setCalcualtedHours(Long calcualtedHours) {
		this.calcualtedHours = calcualtedHours;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public int getDeliveryWeek() {
		return deliveryWeek;
	}

	public void setDeliveryWeek(int deliveryWeek) {
		this.deliveryWeek = deliveryWeek;
	}

	public List<WorkedOrder> getWorkingOrders() {
		return workedOrders;
	}

	public void setWorkingOrders(List<WorkedOrder> workingOrders) {
		this.workedOrders = workingOrders;
	}
}
