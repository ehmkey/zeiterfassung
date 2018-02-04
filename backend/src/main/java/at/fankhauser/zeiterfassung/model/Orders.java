package at.fankhauser.zeiterfassung.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import lombok.Data;

@Data
@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	@Column(name ="calcualted_hours")
	private Long calcualtedHours;
	
	@Column(name ="order_date")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate orderDate;
	
	@Column(name ="invoice_number")
	private String invoiceNumber;
	
	@Column(name ="invoice_date")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate invoiceDate;
	
	private Long price;
	
	@Column(name ="delivery_week")
	private int deliveryWeek;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "primaryKey.order", cascade=CascadeType.ALL)
//	private List<WorkedOrder> workedOrders; 
}
