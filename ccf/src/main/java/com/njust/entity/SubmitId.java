package com.njust.entity;

import java.util.Date;

/**
 * SubmitId entity. @author MyEclipse Persistence Tools
 */

public class SubmitId implements java.io.Serializable {

	// Fields

	private String number;
	private Date ccfTime;

	// Constructors

	/** default constructor */
	public SubmitId() {
	}

	/** full constructor */
	public SubmitId(String number, Date ccfTime) {
		this.number = number;
		this.ccfTime = ccfTime;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SubmitId))
			return false;
		SubmitId castOther = (SubmitId) other;

		return ((this.getNumber() == castOther.getNumber()) || (this.getNumber() != null
				&& castOther.getNumber() != null && this.getNumber().equals(castOther.getNumber())))
				&& ((this.getCcfTime() == castOther.getCcfTime()) || (this.getCcfTime() != null
						&& castOther.getCcfTime() != null && this.getCcfTime().equals(castOther.getCcfTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumber() == null ? 0 : this.getNumber().hashCode());
		result = 37 * result + (getCcfTime() == null ? 0 : this.getCcfTime().hashCode());
		return result;
	}

}