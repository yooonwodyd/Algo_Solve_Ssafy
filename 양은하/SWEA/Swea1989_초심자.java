import java.util.Scanner;

public class Swea1989_초심자 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	for(int i=1;i<n+1;i++) {//몇줄을 받는건데
		String word = sc.next();
		
		int result = 1;//회문인지 판별할 변수. 1이면 회문
		
		int len = word.length();
		for(int j=0;j<len/2;j++) {//반만 검사해도 다 검사하는것과 동일하니까
			if(word.charAt(j)!= word.charAt(len-j-1)) {//인덱스니까 -1해줘야 맞지
				result =0;
				break;
			}//중간에라도 동일하지 않다면 회문이 아닌걸 확인하고 그만. 
			
		}
		
		System.out.println("#"+i+" "+result);
	}
}
}
