package br.com.puc.lamb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ACCOUNT")
public class Account {

	@Id
	@Column(name = "ACCOUNT_ID")
	private int id;

	@ManyToOne
	@JoinColumn(name = "CUST_ID")
	private Customer customer;

	@Column(name = "AVAIL_BALANCE")
	private double availBalance;

	@Temporal(TemporalType.DATE)
	@Column(name = "CLOSE_DATE")
	private Date closeDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_ACTIVITY_DATE")
	private Date lastActivity;

	@Temporal(TemporalType.DATE)
	@Column(name = "OPEN_DATE")
	private Date openDate;

	@Column(name = "PENDING_BALANCE")
	private double pendingBalance;

	@Column(name = "STATUS", length = 10)
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAvailBalance() {
		return availBalance;
	}

	public void setAvailBalance(double availBalance) {
		this.availBalance = availBalance;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Date getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(Date lastActivity) {
		this.lastActivity = lastActivity;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public double getPendingBalance() {
		return pendingBalance;
	}

	public void setPendingBalance(double pendingBalance) {
		this.pendingBalance = pendingBalance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
