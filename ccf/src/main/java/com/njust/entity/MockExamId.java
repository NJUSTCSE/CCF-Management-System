package com.njust.entity;

/**
 * MockExamId entity. @author MyEclipse Persistence Tools
 */

public class MockExamId implements java.io.Serializable {

	// Fields

	private String number;
	private Notice notice;

	// Constructors

	/** default constructor */
	public MockExamId() {
	}

	/** full constructor */
	public MockExamId(String number, Notice notice) {
		this.number = number;
		this.notice = notice;
	}

	// Property accessors

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Notice getNotice() {
		return this.notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MockExamId))
			return false;
		MockExamId castOther = (MockExamId) other;

		return ((this.getNumber() == castOther.getNumber()) || (this.getNumber() != null
				&& castOther.getNumber() != null && this.getNumber().equals(castOther.getNumber())))
				&& ((this.getNotice() == castOther.getNotice()) || (this.getNotice() != null
						&& castOther.getNotice() != null && this.getNotice().equals(castOther.getNotice())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result + (getNotice() == null ? 0 : this.getNotice().hashCode());
		return result;
	}

}