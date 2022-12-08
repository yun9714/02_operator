package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		// 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고
		// 남은 사탕의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / input));
		System.out.println("남는 사탕 개수 : " + candy % input );	
	}
	public void practice2() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// ex.
		// 이름 : 홍길동
		// 학년(정수만) : 3
		// 반(정수만) : 4
		// 번호(정수만) : 15
		// 성별(남학생/여학생) : 남학생
		// 성적(소수점 아래 둘째 자리까지) : 85.75
		// 3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		// 홍 길동 받아올거면 sc.nextLine사용
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점이다.",
				grade, classroom, number, name, gender, score
				);
	}
	public void practice3() {
		// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math); // 합계
		double avg = sum / 3.0; // 평균
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", avg);
	}
	public void practice4() {
		// 세 과목의 점수와 평균을 가지고 합격여부를 처리하는데 
		// 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
		// 아니라면 불합격을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math); // 합계
		double avg = sum / 3.0; // 평균
		
		/*String str1 = "합격";
		String str2 = "불합격";
		String result = (kor >= 60) && (eng >= 60)
		 				&& (math >= 60) && (avg >= 60) ? str1 : str2;
		System.out.println(result);*/
		
		boolean result = (kor >= 40) && (eng >= 40)
						&& (math >= 40) && (avg >= 60);
		System.out.println();
		System.out.println(result ? "합격" : "불합격");
		// 조건식 ? 식1 : 식2, true면 왼쪽 false는 오른쪽
	}
}
/* 출력 메소드(System.out.printf)
 *  %d : 정수형, %o : 8진수, %x : 16진수
   %c : 문자, %s : 문자열
   %f : 실수(소수점 아래 6자리), ex)%.2f면 소수점 둘째자리까지 나타냄
   %e : 지수형태표현, %g : 대입 값 그대로
   %A : 16진수 실수
   %b : 논리
*/
