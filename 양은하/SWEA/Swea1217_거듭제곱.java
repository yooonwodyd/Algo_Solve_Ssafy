import java.util.Scanner;

public class Swea1217_거듭제곱 {

//	static int sum;// 곱하기니까 0은 아무리 곱해도 0이라서 1부터 시작!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
//			sum = 1;
			int TC = sc.nextInt();

			int n = sc.nextInt();
			int m = sc.nextInt();

			int ans = power(n, m);// power 함수에서 나온 power을 main함수에서 사용해야하니까 새로운 aswer변수에 담아.
			//결국 power함수에서 나온건 power(n,m)인거야.

			System.out.println("#" + i + " " + ans);

		}
	}// 메인함수 끝

	public static int power(int n, int m) {// int가 들어가는 피보 함수만들기

		if (m == 0) {
			return 1;
		}
		int result = power(n, m - 1);
		return n * result;

	}

//	if (m < 1) {
//	return 1;
//}

//sum = sum * n;
//return power(n, m - 1);

//}
}
