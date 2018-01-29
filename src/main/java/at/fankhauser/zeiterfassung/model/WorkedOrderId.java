package at.fankhauser.zeiterfassung.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable 
public class WorkedOrderId implements Serializable {

		@ManyToOne
		private Orders order;
	    
		@ManyToOne
		private Employee employee;

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (!(o instanceof WorkedOrderId))
				return false;
			WorkedOrderId that = (WorkedOrderId) o;
			return Objects.equals(getOrder(), that.getOrder())
					&& Objects.equals(getEmployee(), that.getEmployee());
		}

		@Override
		public int hashCode() {
			return Objects.hash(getOrder(), getEmployee());
		}

		public Orders getOrder() {
			return order;
		}

		public void setOrder(Orders order) {
			this.order = order;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
	}