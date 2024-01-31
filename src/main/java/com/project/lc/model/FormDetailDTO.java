package com.project.lc.model;

import javax.validation.constraints.*;

public class FormDetailDTO {
	
	@NotBlank(message = "Your Name must not be blank ")
	@Size(min = 3, max = 15, message = "Your Name must be between 2-15 character ")
	private String yourName;
	
	@NotBlank(message = "Crush Name must not be blank ")
	@Size(min = 3, max = 15, message = "Crush Name must be between 2-15 character ")
	private String crushName;
	
	@AssertTrue(message = "Agree to use our app")
	private boolean termAndCondition;
	
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	public String getYourName() {
		return yourName;
	}
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	

}
