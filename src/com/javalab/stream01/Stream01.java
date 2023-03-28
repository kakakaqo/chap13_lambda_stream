package com.javalab.stream01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김자바");
		set.add("정명훈");
		set.add("김채훈");
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name)); // forEach= 반복
		//             이거랑                                                     이거   이름 맞춰 줘야한다. 
	}
}