package com.javalab.lambda06;

// 함수적(형) 인터페이스
@FunctionalInterface
interface MyFunction{
	public abstract void run(); // public abstract void run();
}

/**
 * 실행클래스
 * 함수형 인터페이스 타입의 매개변수 사용 예제
 */
public class Lambda006 {

	/**
	 * 람다식(익명구현객체)를 파라미터로 받아들이는 메소드
	 * @param f
	 */
	static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction 인 메소드
		f.run();
	}
	
	/**
	 * 람다식(익면구현객체)를 반환하는 메소드
	 * @param return
	 */
	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메소드
		// 람다식으로 MyFunction의 run()을 구현하는 구현 클래스가 생성됨
		MyFunction f = () -> System.out.println("f3.run()");
		return f; // 람다식으로 구현된 익명 구현객체 반환
	}
	
	public static void main(String[] args) {
		
		// 람다식으로 MyFunction의 run()을 구현하는 구현 클래스가 생성됨
		MyFunction f1 = () -> System.out.println("f1.run()");
		System.out.println("f1 : " + f1);
		f1.run();
		System.out.println();
		
		// MyFunction 인터페이스의 run()을 구현하는 구현 객체 생성.
		MyFunction f2 = new MyFunction() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
				
			}
		};
		System.out.println("f2 : " + f2);
		f2.run();
		System.out.println();
		
		MyFunction f3 = getMyFunction(); // 함수형 인터페이스를 반환하는 메소드
		System.out.println("f3 : " + f3);
		f3.run();
		System.out.println();
		
		execute(f1);
		execute( () -> System.out.println("run()"));
	}
}