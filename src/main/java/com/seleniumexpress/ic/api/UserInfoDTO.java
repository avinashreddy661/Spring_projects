package com.seleniumexpress.ic.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "* Your  name cannot be blank.")
	// @Min(value = 3, message = "* Your name should have atleast have 3 chars.")
	@Size(min = 3, max = 15, message = "* Your name should have char between 3 to 15.")
	private String userName;
	
	
	@NotBlank(message = "* CrushName cannot be blank.")
	// @Min(value = 3, message = "* Your name should have atleast have 3 chars.")
	@Size(min = 3, max = 15, message = "* CrushName should have char between 3 to 15.")
	private String crushName;
	
	
	@AssertTrue(message = "* Agree it ,to use our app !!")
	private boolean termAndCondition;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	/**
	 * @return the termAndCondition
	 */
	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	/**
	 * @param termAndCondition the termAndCondition to set
	 */
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
