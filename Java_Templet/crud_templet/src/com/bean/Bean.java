package com.bean;

public class Bean {
	
	private String name;
	private String teacher;
	private String classroom;
	
	public Bean() {
		super();
	}
	
	public Bean(String name, String teacher, String classroom) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.classroom = classroom;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Bean [name=" + name + ", teacher=" + teacher + ", classroom=" + classroom + "]";
	}
    
}
