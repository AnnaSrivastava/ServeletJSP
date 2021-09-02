package com.studentapp.entity;

public class Student {
	private String stud_id;
	private String stud_name;
	private String stream;
	private Double percentage;

	public Student(String stud_id, String stud_name, String stream, Double percentage) {
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stream = stream;
		this.percentage = percentage;
	}

	public String getStud_id() {
		return stud_id;
	}

	public void setStud_id(String stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stream=" + stream + ", percentage="
				+ percentage + "]";
	}

}
