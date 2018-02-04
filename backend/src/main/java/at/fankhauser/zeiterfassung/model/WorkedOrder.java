package at.fankhauser.zeiterfassung.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "worked_order")
public class WorkedOrder {

	@EmbeddedId
	public WorkedOrderId primaryKey = new WorkedOrderId();

	@Column(name = "working_date")
	private LocalDate workingDate;
	
	@OneToOne
	@JoinColumn(name = "employee_id", insertable=false, updatable=false)
	private Employee employee;
	
	@OneToOne
	@JoinColumn(name = "order_id", insertable=false, updatable=false)
	private Orders order;
	
}