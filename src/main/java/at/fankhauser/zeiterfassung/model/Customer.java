// tag::sample[]
package at.fankhauser.zeiterfassung.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * Model for Customer
 * 
 * @author Markus Kienleitner
 *
 */
@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String phone;
	private String contact;
	private String address;
}

