import java.util.Scanner;

public class Swea2068_최대수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();// 몇줄이나 판단할건지
		int[] row = new int[10];// 각 줄마다 담을 배열생성
		

		for (int i = 1; i <= n; i++) {// n번줄 읽을 거야.*줄별로 읽는것도 for문인거 까먹지 않기!
			int res = 0;// 결과 값(max) 초기화
			
			for (int j = 0; j < 10; j++) {// 배열에 입력받은 값 넣기
				row[j] = sc.nextInt();// 왜? *인덱스가 달라지면서 넣는거지

				if (row[j] > res) {
					res = row[j];
				}

			}

			System.out.println("#" + i + " " + res);
		}

	}

}

//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
// 
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] row = new int[10]; //크기가 10인 배열 만들어놓기
//         
// 
//        for(int i=1; i<=n;i++) { //n줄 반복
//            int result = 0;//max 담을 상자 --->왜 얘를 for문 밖으로 빼니까 #3이 잘 안나오는거지?
//            for(int j=0;j<10;j++) {//한줄에 10개씩 받기
//                row[j] =sc.nextInt(); //받은걸 10칸 배열에 넣기
//                 
//                if(result<row[j]) {//지금 입력된 값이 앞서 입력된 값(초기값음 0)보다 크다면
//                    result = row[j];//지금 입력된 값을 result로.
//                     
//                }//max를 찾기 위한 반복문
//                 
//            }//안쪽 for문끝 (10회 입력)
//     
//            System.out.println("#"+i+" "+result);//이런 형식으로 출력.
//        }//바깥 for문 끝 (n줄 받을지)
//    }//main 끝
//}//클래스
