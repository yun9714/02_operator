package edu.kh.op.ex;
// 코드 실행용 클래스
public class ExampleRun {
	//// 메인 메소드 필수 작성
	public static void main(String[] args) {
		OpExample ex = new OpExample();
		// OpExample이라는 설계도를 보고 OpExample 형태의 ex를 만들어냄
		// 같은 패키지 안에 있는 것을 불러오는 거라 import 쓸 필요 없음(Scanner는 다른 패키지)
		ex.ex1(); // ex1()을 호출하는 것, OpExample의 ex1()를 수행함
		ex.ex2();
		ex.ex3();
		ex.ex4();
		ex.ex5();
		ex.ex6();
		ex.ex7();
		ex.ex8();		
	}
}
