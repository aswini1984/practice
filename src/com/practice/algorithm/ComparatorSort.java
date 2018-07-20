package com.practice.algorithm;

import java.util.Comparator;

public class ComparatorSort{

	/**
	 * @param args
	 */
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

	public static Comparator<ComparatorSort> empNoComparator = new Comparator<ComparatorSort>() {

		@Override
		public int compare(ComparatorSort o1, ComparatorSort o2) {
			return o1.getEmpNo() - o2.getEmpNo();
		}
	};

}
