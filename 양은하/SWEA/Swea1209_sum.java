import java.util.Scanner;

public class Swea1209_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {// 테스트케이스는 10번.
			int TC = sc.nextInt();

			int[][] box = new int[100][100];// 100*100배열 만들기
			for (int c = 0; c < 100; c++) {
				for (int r = 0; r < 100; r++) {
					box[c][r] = sc.nextInt();
				}
			} // 배열 채워넣기 끝

			int max = 0;// sum 중에 max를 골라내긴 해야하는데 어떻게 하는거지

			for (int x = 0; x < 100; x++) {
				int rowSum = 0;
				int calSum = 0;
				for (int y = 0; y < 100; y++) {
					rowSum += box[x][y];
					calSum += box[y][x];
				}

				if (max < rowSum)
					max = rowSum;
				if (max < calSum)
					max = calSum;

			} // x는 고정인 가로세로줄 합 구하는 식

			int rdSum = 0;
			int ruSum = 0;
			for (int x = 0; x < 100; x++) {
				rdSum += box[x][x]; // 우하향 대각선 합 구하기
				ruSum += box[x][99 - x]; // 우상향 대각선 합 구하기
			}

			if (max < rdSum)
				max = rdSum;// 어짜피 결과 하나 나오는거니까 하나 비교하는거지
			if (max < ruSum)
				max = ruSum;// 어짜피 결과 하나 나오는거니까 하나 비교하는 거지

			System.out.println("#" + TC + " " + max);// 의도된 TC를 출력하는게 더 맞는거야.

		} // TC반복 끝
	}// 메인함수 끝
}// 클래스 끝
