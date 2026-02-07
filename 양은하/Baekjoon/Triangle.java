package baekjoon;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//몇줄 반복할지 입력
		
		for(int i=1;i<=n;i++) {//몇줄 반복할거야
			for(int j=1;j<=i;j++) {//하나씩 더하기만 할거잖아!
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
