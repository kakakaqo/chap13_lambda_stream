package com.javalab.stream08;

public class Student {

	// 필드
	private String name;
	private int score;
	
	// 기본 생성자
	public Student() {
		super();
	}
	
	// 오버로딩 생성자
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	// 게터/세터 메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	// 디버깅용 toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
}