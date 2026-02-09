import java.util.Scanner;

public class Swea1213_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {// 주어지는 테스트 케이스는 10개.

			int n = sc.nextInt();// 테케 번호.
			String target = sc.next();// 어떤 문자를
			String sentance = sc.next();// 어디서

			int count = 0;
			int index = 0;

			while (true) {
				index = sentance.indexOf(target, index);

				if (index != -1) {
					count++;
					index += target.length();

				} else {
					break;
				}

			}
			System.out.println("#" + n + " " + count);
		}
		sc.close();
	}
}
