package com.njust.entity;

import java.util.Date;

/**
 * Analysis entity. @author MyEclipse Persistence Tools
 */

public class Analysis implements java.io.Serializable {

	// Fields

	private Date ccfTime;
	private Integer average;
	private Integer postgraduateLine;
	private Integer highLine;
	private Integer firstAve;
	private Integer secondAve;
	private Integer thirdAve;
	private Integer fourthAve;
	private Integer fifthAve;

	// Constructors

	/** default constructor */
	public Analysis() {
	}

	/** full constructor */
	public Analysis(Integer average, Integer postgraduateLine, Integer highLine, Integer firstAve, Integer secondAve,
			Integer thirdAve, Integer fourthAve, Integer fifthAve) {
		this.average = average;
		this.postgraduateLine = postgraduateLine;
		this.highLine = highLine;
		this.firstAve = firstAve;
		this.secondAve = secondAve;
		this.thirdAve = thirdAve;
		this.fourthAve = fourthAve;
		this.fifthAve = fifthAve;
	}

	// Property accessors

	public Date getCcfTime() {
		return this.ccfTime;
	}

	public void setCcfTime(Date ccfTime) {
		this.ccfTime = ccfTime;
	}

	public Integer getAverage() {
		return this.average;
	}

	public void setAverage(Integer average) {
		this.average = average;
	}

	public Integer getPostgraduateLine() {
		return this.postgraduateLine;
	}

	public void setPostgraduateLine(Integer postgraduateLine) {
		this.postgraduateLine = postgraduateLine;
	}

	public Integer getHighLine() {
		return this.highLine;
	}

	public void setHighLine(Integer highLine) {
		this.highLine = highLine;
	}

	public Integer getFirstAve() {
		return this.firstAve;
	}

	public void setFirstAve(Integer firstAve) {
		this.firstAve = firstAve;
	}

	public Integer getSecondAve() {
		return this.secondAve;
	}

	public void setSecondAve(Integer secondAve) {
		this.secondAve = secondAve;
	}

	public Integer getThirdAve() {
		return this.thirdAve;
	}

	public void setThirdAve(Integer thirdAve) {
		this.thirdAve = thirdAve;
	}

	public Integer getFourthAve() {
		return this.fourthAve;
	}

	public void setFourthAve(Integer fourthAve) {
		this.fourthAve = fourthAve;
	}

	public Integer getFifthAve() {
		return this.fifthAve;
	}

	public void setFifthAve(Integer fifthAve) {
		this.fifthAve = fifthAve;
	}

}