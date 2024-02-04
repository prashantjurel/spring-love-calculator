package com.project.lc.model;

import com.project.lc.validators.Age;
import com.project.lc.validators.ValidPhone;

public class UserRegistrationInfo {

	private String usernameString;
	private String nameString;
	private char[] passwordString;
	private String countryString;
	private String[] hobbiesStrings;
	private String genderString;
	@Age
	private Integer ageInteger;
	@ValidPhone
	private CommunicationDTO communicationDTO;

	public String getUsernameString() {
		return usernameString;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public char[] getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(char[] passwordString) {
		this.passwordString = passwordString;
	}

	public String getCountryString() {
		return countryString;
	}

	public void setCountryString(String countryString) {
		this.countryString = countryString;
	}

	public String[] getHobbiesStrings() {
		return hobbiesStrings;
	}

	public void setHobbiesStrings(String[] hobbiesStrings) {
		this.hobbiesStrings = hobbiesStrings;
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}

	public Integer getAgeInteger() {
		return ageInteger;
	}

	public void setAgeInteger(Integer ageInteger) {
		this.ageInteger = ageInteger;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

}
