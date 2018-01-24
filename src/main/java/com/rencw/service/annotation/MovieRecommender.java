package com.rencw.service.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

	
	private CustomerPreferenceDaoParent customerPreferenceDaoParent;

	public CustomerPreferenceDaoParent getCustomerPreferenceDaoParent() {
		return customerPreferenceDaoParent;
	}

	@Autowired
	public void setCustomerPreferenceDaoParent(CustomerPreferenceDaoParent customerPreferenceDaoParent) {
		this.customerPreferenceDaoParent = customerPreferenceDaoParent;
		System.out.println(this.customerPreferenceDaoParent);
	}
	
}
