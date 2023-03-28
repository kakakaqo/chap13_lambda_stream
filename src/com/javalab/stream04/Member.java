package com.javalab.stream04;

public class Member {

	// 필드
	private String name;
	private String job;
	
	// 기본 생성자
	public Member() {
		super();
	}
	
	// 오버로딩 생성자
	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	// 게터/세터 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	// 디버깅용 toString
	@Override
	public String toString() {
		return "Member [name=" + name + ", job=" + job + "]";
	}
	
}