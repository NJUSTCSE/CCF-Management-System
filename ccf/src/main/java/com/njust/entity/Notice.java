package com.njust.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable {

	// Fields

	private Date ccfTime;
	private Integer highLine;
	private Integer preselectNumber;
	private Date mockTime;
	private String state;
	private Set mockExams = new HashSet(0);

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** full constructor */
	public Notice(Integer highLine, Integer preselectNumber, Date mockTime, String state, Set mockExams) {
		this.highLine = highLine;
		this.preselectNumber = preselectNumber;
		this.mockTime = mockTime;
		this.state = state;
		this.mockExams = mockExams;
	}

	// Property accessors

	public Date getCcfTime() {
		return this.ccfTime;
	}

	public void setCcfTime(Date ccfTime) {
		this.ccfTime = ccfTime;
	}

	public Integer getHighLine() {
		return this.highLine;
	}

	public void setHighLine(Integer highLine) {
		this.highLine = highLine;
	}

	public Integer getPreselectNumber() {
		return this.preselectNumber;
	}

	public void setPreselectNumber(Integer preselectNumber) {
		this.preselectNumber = preselectNumber;
	}

	public Date getMockTime() {
		return this.mockTime;
	}

	public void setMockTime(Date mockTime) {
		this.mockTime = mockTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set getMockExams() {
		return this.mockExams;
	}

	public void setMockExams(Set mockExams) {
		this.mockExams = mockExams;
	}

}