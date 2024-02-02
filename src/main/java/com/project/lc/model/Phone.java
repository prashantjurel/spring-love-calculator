package com.project.lc.model;

public class Phone {

	private String countryCodeString;
	private String userNumberString;

	public String getCountryCodeString() {
		return countryCodeString;
	}

	public void setCountryCodeString(String countryCodeString) {
		this.countryCodeString = countryCodeString;
	}

	public String getUserNumberString() {
		return userNumberString;
	}

	public void setUserNumberString(String userNumberString) {
		this.userNumberString = userNumberString;
	}

	@Override
	public String toString() {
		return countryCodeString + "-" + userNumberString;

	}

}
