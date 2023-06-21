package com.example.demo.dto;

public class RegiDTO {
	private int id;
	private String userName;
	private String email;
	private String number;
	private String addres;
	private String password;
	private String confirmPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public RegiDTO(int id, String userName, String email, String number, String addres, String password,
			String confirmPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.number = number;
		this.addres = addres;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public RegiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RegiDTO [id=" + id + ", userName=" + userName + ", email=" + email + ", number=" + number + ", addres="
				+ addres + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	

}
