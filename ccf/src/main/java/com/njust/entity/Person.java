package com.njust.entity;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person implements java.io.Serializable {

	// Fields

	private String number;
	private String password;
	private String idNumber;
	private String name;
	private Integer phone;
	private String EMail;
	private Integer authority;
	private String gender;
	private Integer grade;
	private String department;
	private Integer directTimes;
	private Integer highTimes;

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(String password, String idNumber, String name) {
		this.password = password;
		this.idNumber = idNumber;
		this.name = name;
	}

	/** full constructor */
	public Person(String password, String idNumber, String name, Integer phone, String EMail, Integer authority,
			String gender, Integer grade, String department, Integer directTimes, Integer highTimes) {
		this.password = password;
		this.idNumber = idNumber;
		this.name = name;
		this.phone = phone;
		this.EMail = EMail;
		this.authority = authority;
		this.gender = gender;
		this.grade = grade;
		this.department = department;
		this.directTimes = directTimes;
		this.highTimes = highTimes;
	}

	// Property accessors

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public Integer getAuthority() {
		return this.authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getDirectTimes() {
		return this.directTimes;
	}

	public void setDirectTimes(Integer directTimes) {
		this.directTimes = directTimes;
	}

	public Integer getHighTimes() {
		return this.highTimes;
	}

	public void setHighTimes(Integer highTimes) {
		this.highTimes = highTimes;
	}

}