import java.util.Scanner;

public class Swea1984_중간평균값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {// 한줄씩 읽어야지

			int sum = 0;
			int min = 10000;
			int max = 0;

			for (int j = 0; j < 10; j++) {// 한 글자씩 읽을거야
				int tmp = sc.nextInt();

				if (max < tmp) max = tmp;

				if (min > tmp) min = tmp;// *min 부등호 방향 확인!

				sum += tmp;
			}
			
			int finalSum = sum - min - max; // 두 숫자 빼고 합 구하기
			
			System.out.println("#" + i + " " + (finalSum+4) / 8);//*괄호로 우선순위 표시해줘
		}

	}

}
