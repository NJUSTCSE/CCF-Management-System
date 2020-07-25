package com.njust.entity;

import java.util.Date;

/**
 * Submit entity. @author MyEclipse Persistence Tools
 */

public class Submit implements java.io.Serializable {

	// Fields

	private Integer id;
	private String number;
	private Date ccfTime;
	private Integer totalScore;
	private Integer firstScore;
	private Integer secondScore;
	private Integer thirdScore;
	private Integer fourthScore;
	private Integer fifthScore;
	private String img;
	private Date applyTime;
	private String state;

	// Constructors

	/** default constructor */
	public Submit() {
	}

	/** full constructor */
	public Submit(String number, Date ccfTime, Integer totalScore, Integer firstScore, Integer secondScore,
			Integer thirdScore, Integer fourthScore, Integer fifthScore, String img, Date applyTime, String state) {
		this.number = number;
		this.ccfTime = ccfTime;
		this.totalScore = totalScore;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
		this.fourthScore = fourthScore;
		this.fifthScore = fifthScore;
		this.img = img;
		this.applyTime = applyTime;
		this.state = state;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCcfTime() {
		return this.ccfTime;
	}

	public void setCcfTime(Date ccfTime) {
		this.ccfTime = ccfTime;
	}

	public Integer getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	public Integer getFirstScore() {
		return this.firstScore;
	}

	public void setFirstScore(Integer firstScore) {
		this.firstScore = firstScore;
	}

	public Integer getSecondScore() {
		return this.secondScore;
	}

	public void setSecondScore(Integer secondScore) {
		this.secondScore = secondScore;
	}

	public Integer getThirdScore() {
		return this.thirdScore;
	}

	public void setThirdScore(Integer thirdScore) {
		this.thirdScore = thirdScore;
	}

	public Integer getFourthScore() {
		return this.fourthScore;
	}

	public void setFourthScore(Integer fourthScore) {
		this.fourthScore = fourthScore;
	}

	public Integer getFifthScore() {
		return this.fifthScore;
	}

	public void setFifthScore(Integer fifthScore) {
		this.fifthScore = fifthScore;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}