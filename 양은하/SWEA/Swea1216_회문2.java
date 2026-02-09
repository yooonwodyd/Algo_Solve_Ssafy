import java.util.Scanner;

public class Swea1216_회문2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 0; t < 10; t++) {// 테스트케이스는 10번 번 반복됨.
			if (!sc.hasNextInt())
				break;// 아무것도 받을게 없다면 그만!
			int TC = sc.nextInt();
			char[][] box = new char[100][100];

			for (int j = 0; j < 100; j++) {
				String string = sc.next();
				for (int k = 0; k < 100; k++) {
					box[j][k] = string.charAt(k);// char넣을 수 있는 곳에 입력값 넣는 법.//*일단 문자열로 받고, k로 문자열 탐색.

				}
			} // 주어진 숫자 2차 배열에 넣기 완료

			int maxLen = 1;// 얘를 마지막에 출력해낼거야. *가장 짧은 회문 길이는 1이다.

			boolean found = false;// 일단 못찾았다는 가정에서 시작.
			for (int len = 100; len > 1; len--) {// 제일 길다는가정으로 줄여나가면서 찾아야 처음 찾은게 정답!. 그래서 제일 바깥 for문으로 작성해야지.
				if (found)
					break;// 만약 찾았으면 for문 탈출.

				for (int i = 0; i < 100 ; i++) {// 가로탐색//*세로 탐색할때에는 가로는 끝까지 가서 탐색할 필요가 있으니까 <100.
					if (found)
						break;

					for (int j = 0; j <= 100 - len; j++) {// 세로탐색

						if (checkHo(box, i, j, len)) {
							maxLen = len;
							found = true;
							break;
						}

						if (checkVer(box, j, i, len)) {//지금 여기서 변경되는게 j니까.
							maxLen = len;
							found = true;
							break;
						}

					}

				}
			}
			System.out.println("#"+TC+" "+maxLen);
		} // 테스트케이스 반복문 끝

	}// 메인함수 끝

	private static boolean checkHo(char[][] box, int r, int c, int len) {// 가로 회문인지 아닌지 boolean
		for (int i = 0; i < len / 2; i++) {// 회문 검사할때는 반까지만 확인하면 다 하는거랑 동일하니까.
			if (box[r][c + i] != box[r][c + len - 1 - i]) {// len은 인덱스로 들어가려면 -1가 되어야 한다.
				return false;
			}

		}
		return true;
	}

	private static boolean checkVer(char[][] box, int r, int c, int len) {// 세로 회문인지 아닌지 boolean
		for (int i = 0; i < len / 2; i++) {
			if (box[r+i][c] != box[r + len - 1 - i][c]) {
				return false;
			}
		}
		return true;
	}

}// 클래스 끝
