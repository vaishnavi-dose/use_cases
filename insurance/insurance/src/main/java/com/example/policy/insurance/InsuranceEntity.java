package com.example.policy.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class InsuranceEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String client_name;
	private String insurance_policy;
	private String issue_date;
	private String expiry_date;
	
	private String insurance_term;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getInsurance_policy() {
		return insurance_policy;
	}
	public void setInsurance_policy(String insurance_policy) {
		this.insurance_policy = insurance_policy;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getInsurance_term() {
		return insurance_term;
	}
	public void setInsurance_term(String insurance_term) {
		this.insurance_term = insurance_term;
	}
	
}
