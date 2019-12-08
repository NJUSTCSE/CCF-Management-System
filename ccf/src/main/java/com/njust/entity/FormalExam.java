package com.njust.entity;

/**
 * FormalExam entity. @author MyEclipse Persistence Tools
 */

public class FormalExam implements java.io.Serializable {

	// Fields

	private FormalExamId id;
	private String name;
	private Integer grade;
	private Integer totalScore;
	private Integer firstScore;
	private Integer secondScore;
	private Integer thirdScore;
	private Integer fourthScore;
	private Integer fifthScore;

	// Constructors

	/** default constructor */
	public FormalExam() {
	}

	/** minimal constructor */
	public FormalExam(FormalExamId id) {
		this.id = id;
	}

	/** full constructor */
	public FormalExam(FormalExamId id, String name, Integer grade, Integer totalScore, Integer firstScore,
			Integer secondScore, Integer thirdScore, Integer fourthScore, Integer fifthScore) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.totalScore = totalScore;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
		this.fourthScore = fourthScore;
		this.fifthScore = fifthScore;
	}

	// Property accessors

	public FormalExamId getId() {
		return this.id;
	}

	public void setId(FormalExamId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
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

}