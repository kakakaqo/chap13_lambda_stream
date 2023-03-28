package com.javalab.stream03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 스트림 반복문
 */

public class StreamEx03_1 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 90));
		list.add(new Student("신용권", 92));

		// IntStream
		Stream<Student> studentStream = list.stream();
		// 중간 연산 메소드은 mapToInt
		// - (student 객체의 int type 변수의 값만 모아서 스트림 IntStream 반환)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		double avg = scoreStream.average().getAsDouble();
		System.out.println("평균 점수는 : " + avg);
	}
}