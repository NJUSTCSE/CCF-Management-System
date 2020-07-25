package com.njust.entity;

import java.util.Date;

/**
 * MockExam entity. @author MyEclipse Persistence Tools
 */

public class MockExam implements java.io.Serializable {

	// Fields

	private MockExamId id;
	private String name;
	private String idNumber;
	private Integer grade;
	private Date date;
	private Integer directTimes;
	private Integer highTimes;
	private Integer priority;
	private Integer score;
	private String state;
	private Integer isIn;

	// Constructors

	/** default constructor */
	public MockExam() {
	}

	/** minimal constructor */
	public MockExam(MockExamId id, String idNumber) {
		this.id = id;
		this.idNumber = idNumber;
	}

	/** full constructor */
	public MockExam(MockExamId id, String name, String idNumber, Integer grade, Date date, Integer directTimes,
			Integer highTimes, Integer priority, Integer score, String state, Integer isIn) {
		this.id = id;
		this.name = name;
		this.idNumber = idNumber;
		this.grade = grade;
		this.date = date;
		this.directTimes = directTimes;
		this.highTimes = highTimes;
		this.priority = priority;
		this.score = score;
		this.state = state;
		this.isIn = isIn;
	}

	// Property accessors

	public MockExamId getId() {
		return this.id;
	}

	public void setId(MockExamId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getIsIn() {
		return this.isIn;
	}

	public void setIsIn(Integer isIn) {
		this.isIn = isIn;
	}

}