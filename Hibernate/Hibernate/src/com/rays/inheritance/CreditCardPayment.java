package com.rays.inheritance;

public class CreditCardPayment extends Payment {
	private String ccType;

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public String getCcType() {
		return ccType;
	}


}
