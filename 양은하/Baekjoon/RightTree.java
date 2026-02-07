package baekjoon;

import java.util.Scanner;

public class RightTree {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {// 몇줄 내려갈 건지
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//별찍기 주의점//
//1. println
//2. 일단 헷갈릴때는 변수 정의는 1로 정하고 고민하기
//3. 구역 나눠서 합 =n    or    합산규칙 찾기!
//4. 최대한 한블럭 밖 for문 변수 이용해보기