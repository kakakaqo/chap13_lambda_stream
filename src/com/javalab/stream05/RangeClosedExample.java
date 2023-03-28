package com.javalab.stream05;

import java.util.stream.IntStream;

/**
 * [IntStream] - int 기본형 요소를 처리하는 스트림 rangeClosed(int a, int b) : a부터 b까지의 int
 * type 자료 생성
 */

public class RangeClosedExample {

	public static int sum; // int 값 누적할 변수(전역변수) 이 클래스 안에있는 어디든 접근가능

	public static void main(String[] args) {

		// 1부터 100까지의 정수를 갖는 스트림
		IntStream intStream = IntStream.rangeClosed(1, 100);

		intStream.forEach((a) -> {
			sum += a;
		}); // 스트림 반복
		System.out.println("총합 : " + sum);
	}
}