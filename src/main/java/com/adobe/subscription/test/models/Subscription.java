package com.adobe.subscription.test.models;

public class Subscription {
	private Integer id;
	private String courseName;
	private String subscribedOn;
	private String canceledOn;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getSubscribedOn() {
		return subscribedOn;
	}
	public void setSubscribedOn(String subscribedOn) {
		this.subscribedOn = subscribedOn;
	}
	public String getCanceledOn() {
		return canceledOn;
	}
	public void setCanceledOn(String canceledOn) {
		this.canceledOn = canceledOn;
	}
}
