package com.bean;

public class Bean {

	private String name;
	private String sex;
	private String nation;
	private String time;
	private int age;
	private String kind;
	private String serve;
	
	public Bean() {}
	public Bean(String name, String sex, String nation, String time, int age, String kind, String serve) {
		super();
		this.name = name;
		this.sex = sex;
		this.nation = nation;
		this.time = time;
		this.age = age;
		this.kind = kind;
		this.serve = serve;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getServe() {
		return serve;
	}
	public void setServe(String serve) {
		this.serve = serve;
	}
	
}
