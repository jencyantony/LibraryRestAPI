package com.service.po;

import java.util.List;

public class UserInfoPO {

	private int id;
	private String lastname;
	private String firstname;
	private String role;
	private String department;
	private List<BookPO> booksBorrowed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<BookPO> getBooksBorrowed() {
		return booksBorrowed;
	}
	public void setBooksBorrowed(List<BookPO> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}
	
}
