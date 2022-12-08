package edu.kh.op.ex;
// 예제 코드 작성용 클래스
public class OpExample {
	
	// 기능 메소드 method : 객체 지향 프로그래밍에서 객체와 관련된 서브루틴or함수
	public void ex1() {
		// void : return값이 없는 메소드에 작성
		System.out.println("OpExample 클래스에 ex1() 기능 수행");
	// tip! : 하나의 메소드 안에는 하나의 기능만 정의해야함
	}
	public void ex2() {
		int iNum1 = 10;
		int iNum2 = 10;
		iNum1++; // 1을 더함
		iNum2--; // 1을 뺌
		System.out.println("iNum1 : " + iNum1); // 10
		System.out.println("iNum2 : " + iNum2); // 10
	}
	public void ex3() {
		// 전위 연산 : ++3, --2 연산자가 앞쪽에 배치
		// -> 다른 연산보다 먼저 증가, 감소
		int temp1 = 5;
		System.out.println(++temp1 + 5);
		//                     6  + 5  == 11
		// 후위 연산 : 10++, 6-- 연산자가 뒤쪽에 배치
		// -> 다른 연산보다 나중에 증가, 감소
		int temp2 = 3;
		System.out.println(temp2-- + 2);
		//                  3      + 2  == 5
		// temp2 <- 2(3에서 1 감소해서 2)
		System.out.println(temp2);
	}
	public void ex4() {
		// 비교연산자 : >, <, >=, <=, ==, !=
		// - 비교 연산자의 결과는 항상 논리값(true, false)
		// 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽
		// 같다 기호는 ==, =는 대입연산자
		int a = 10;
		int b = 20;
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a != b); // true
		System.out.println((a == b) == false); // true
						// 괄호 안에 있는거 먼저 계산
						// false == false -> true
		int c = 4;
		int d = 5;
		System.out.println(c + 1 <= d); // true
						// 산술연산이 비교연산보다 우선순위가 높다
		int temp = 723;
		System.out.println("temp는 짝수? " + (temp % 2 == 0)); // false
	}
	public void ex5() {
		// 논리연산자 : &&(And), ||(Or)
		// && : 둘 다 true이면 true
		int a = 101;
		// a는 100 이상이면서 짝수인가? 
		System.out.println((a >= 100) && (a % 2 == 0)); // false
		// || : 둘 다 false면 false, 나머지 true
		int c = 10;
		// c는 10을 초과했거나 짝수인가?
		System.out.println((c > 10) || (c % 2 == 0)); // true
	}
	public void ex6() {
		// 논리 부정 연산자 : !
		// 논리값을 반대로 바꾸는 연산자
		boolean bool1 = true;
		System.out.println(!bool1); // false
	}
	public void ex7() {
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		// -> 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		int a = 10;
		a++; // 11
		System.out.println("a++ : " + a);
		a += 4; // 15
		System.out.println("a += 4 : " + a);
		// -> a = a + 4;
		a -= 10;
		System.out.println("a -= 10 : " + a);
		a *= 3; // a 3배 증가
		System.out.println("a *= 3 : " + a);
		a /= 6; // 몫만 구함
		System.out.println("a /= 6 : " + a); 
		a %= 2; // 나머지 구함
		System.out.println("a %= 2 : " + a);
	}
	public void ex8() {
		// 삼항 연산자 
		// 조건식 ? 식1 : 식2
		// 조건식 결과가 true면 식1 수행, false면 식2 수행
		int num = 30;
		String str1 = "num은 30보다 크다";
		String str2 = "num은 30 이하다";
		String result = num > 30 ? str1 : str2;
		System.out.println(result);
		
	}

}
