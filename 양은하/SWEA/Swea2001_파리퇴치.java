import java.util.Scanner;

public class Swea2001_파리퇴치 {

//테스트케이스 scanner로 받기	
//for로 테스트케이스만큼 반복
//  int n, m초기화
//  n을 스캐너로 받아
//  n*n배열 만들어 놓기
//  for로 n탐색하면서 스캐너로 내용 채우기
//  
//  델타를 배열로 m*m만들기
//  int sum = 0;
// int max = 0;
//  
//  n*n안에 기준을 어떻게 잡고 m*m을 탐색해야할지 모르겠다. 
//  근데 윗 줄을 하게 된다면 sum += 배열로 m*m모으기
//		  max<sum이면 sum을 max에 할당
//  
//  m*m이 n*n나간 경우 제외하기 continue로 .
//  
// 그리고 print max
	//>굳이 m*m배열을 만들 필요 없었고, 기준은 왼상으로 잡고 for문으로 탐색하면서 sum+=

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();//반복할 TC 숫자 받기

		for (int i = 1; i <= TC; i++) {// 몇번 반복할지
			int n = 0;
			int m = 0;
			
			int max = 0;//최종적으로 원하는건 max

			n = sc.nextInt();
			m = sc.nextInt();
			int[][] box = new int[n][n];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++)
					box[j][k] = sc.nextInt();

			}//n*n배열 채우기 완료

			

			for (int j = 0; j <= n - m; j++) {// 기준점을 m*m 왼위로 두기.가로로로로 순서로 넣기
				for (int k = 0; k <= n - m; k++) {//*인덱스로 0부터 시작하면 n-m까지 돌아야지. 

					int finSum = 0;
					
					for (int c = 0; c < m; c++) {
						for (int r = 0; r < m; r++) {
							finSum += box[j + c][k + r];

							
						}
					}
					
					if (max < finSum) {//(j, k)가 고정된 상태에서 finSum을 한번에 다 더한 시점에 max랑 비교하는게 더 효율적.
						max = finSum;
					}

				}
			} // finSum 다 채워졌겠다.
			System.out.println("#" + i + " " + max);

		}
	}
}
