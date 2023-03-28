package com.javalab.stream07;

public class Menu {

	// 필드
	private String name;
	private int calories;
	
	// 기본 생성자
	public Menu() {
		super();
	}
	
	// 오버로딩 생성자
	public Menu(String name, int calories) {
		super();
		this.name = name;
		this.calories = calories;
	}
	
	// 게터/세터 메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	// 디버깅용  toString
	@Override
	public String toString() {
		return "Menu [name=" + name + ", calories=" + calories + "]";
	}
}