package com.seleniumexpress.ic.api;

public class UserRegistrationDTO {

	private String name;
	private String userName;
	private char[] password;// why we store password in char array ?
	
	private String country;
	
	private String hobby[];
	
	private String gender;
	
	private CommunicationDTO communicationDTO;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the communicationDTO
	 */
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	/**
	 * @param communicationDTO the communicationDTO to set
	 */
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	

}
