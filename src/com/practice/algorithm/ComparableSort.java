package com.practice.algorithm;

public class ComparableSort implements Comparable{

	
	private int empNo;
	private String firstName;
	private String lastName;
	private String emailId;

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	@Override
	public int compareTo(Object o) {
		return this.empNo - ((ComparableSort) o).getEmpNo();
	}

}
