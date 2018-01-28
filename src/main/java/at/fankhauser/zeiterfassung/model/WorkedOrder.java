package at.fankhauser.zeiterfassung.model;

import java.time.LocalDate;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "worked_order")
@AssociationOverrides({
	@AssociationOverride(name = "primaryKey.order",
		joinColumns = @JoinColumn(name = "order_id")),
	@AssociationOverride(name = "primaryKey.employee",
		joinColumns = @JoinColumn(name = "employee_id")) })
public class WorkedOrder {

	@EmbeddedId
	public WorkedOrderId primaryKey = new WorkedOrderId();

	@Column(name = "working_date")
	private LocalDate workingDate;
	

	public LocalDate getWorkingDate() {
		return workingDate;
	}

	public void setWorkingDate(LocalDate workingDate) {
		this.workingDate = workingDate;
	}

	public WorkedOrderId getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(WorkedOrderId primaryKey) {
		this.primaryKey = primaryKey;
	}

	
}