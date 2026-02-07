import java.util.Scanner;

public class Swea1206_view {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {// 10번 반복할거야

			int num = sc.nextInt();// 건물이 몇개인지

			int[] floor = new int[num];// 건물수 만큼의 배열을 만들어

			for (int j = 0; j < num; j++) {

				floor[j] = sc.nextInt();// 배열을 채울거야

			} // 배열 채우는 for문 끝

			int homeNum = 0;// 조망권 좋은 가구 수
			int high = 0;

			for (int j = 2; j < num - 2; j++) {// *인덱스는 -1한거랑 동일해

				high = Math.max(floor[j - 2], Math.max(floor[j - 1], Math.max(floor[j + 1], floor[j + 2])));

				if (floor[j] > high) {//j가 max를 구했을 때와 위치가 동일해야하니까 for문에 같이 들어와야해.
					homeNum += (floor[j] - high);
				}
			}

			System.out.println("#" + i + " " + homeNum);
		}
	}
}
