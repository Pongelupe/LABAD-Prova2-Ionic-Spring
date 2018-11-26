package br.com.puc.lamb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(name = "CUST_ID")
	private int id;

	@Column(name = "ADDRESS", length = 30)
	private String address;

	@Column(name = "CITY", length = 20)
	private String city;

	@NotNull
	@Column(name = "CUST_TYPE_CD", length = 1)
	private String typeCD;

	@NotNull
	@Column(name = "FED_ID", length = 12)
	private String fedId;

	@Column(name = "POSTAL_CODE", length = 10)
	private String postalCode;

	@Column(name = "STATE", length = 20)
	private String state;

	@OneToMany(mappedBy = "customer", targetEntity = Account.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Account> accounts;

	@OneToOne(mappedBy = "customer", targetEntity = Individual.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Individual individual;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getFedId() {
		return fedId;
	}

	public void setFedId(String fedId) {
		this.fedId = fedId;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Individual getIndividual() {
		return individual;
	}

	public void setIndividual(Individual individual) {
		this.individual = individual;
	}

}
