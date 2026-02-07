import java.util.Scanner;

public class Swea5432_쇠막대기_자르기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();

		for (int i = 1; i <= TC; i++) {
			String string = sc.next();
			
			char[] row = string.replace("()", "*").toCharArray();

			int sum = 0;
			int barCnt = 0;

			for (int j = 0; j < row.length; j++) {

				char tmp = row[j];
				if (tmp == '(') {
					sum++;
					barCnt++;
				} else if (tmp == ')') {
					barCnt--;
				} else if (tmp == '*') {
					sum = sum + barCnt;
				}

			} // for문 끝
			System.out.println("#" + i + " " + sum);

		} // TC도는 반복문 끝

	}// main함수 끝
}// 클래스 끝
