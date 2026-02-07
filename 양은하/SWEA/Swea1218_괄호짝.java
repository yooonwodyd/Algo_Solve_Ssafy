import java.util.Scanner;
import java.util.Stack;

public class Swea1218_괄호짝 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	for(int i=1;i<=10;i++) {//#번호(i)
		Stack<Character> stack = new Stack<>();//st스택만들기
		int n = sc.nextInt();
		String string = sc.next();//짝수 입력줄 괄호들 string으로 받기
		boolean isValid = true;//일단 맞다는 가정에서 시작
		
		for(int j=0;j<string.length();j++) {//한 글자씩 j로 탐색
			char tmp = string.charAt(j);//한char는 tmp로 표현
			if(tmp == '{' || tmp =='[' || tmp =='(' || tmp == '<') {//열린관호라면
				stack.push(tmp);//스택에 넣어
			}
			else {//닫힌 괄호라면
				if(stack.isEmpty()) {//앞에 아무것도 없다면 
					isValid = false;//잘못된거다.
					break;//그만해
				}
				
				char top = stack.pop();//여기 이렇게 top을 고정해두고 밑에서 if로 검증해봐. 이렇게 안하면 if문에서 peek과 pop을 계속 반복해야해. 
				
				if(tmp =='}' && top!='{') isValid = false;
				else if(tmp ==']' && top!='[') isValid = false;
				else if(tmp ==')' && top!='(') isValid = false;
				else if(tmp =='>' && top!='<') isValid = false;
				
				if(isValid == false) break;//여기서 틀리면 굳이 안해도 되니까 break
				
			}//닫힌괄호 경우 끝
		}//tmp반복 끝
		
		
		if(!stack.isEmpty()) isValid = false;
		System.out.println("#"+i+" "+(isValid ? 1 : 0 ));//삼항연산자는 boolean결과를 다른 숫자로 출력할때 적절한 사용이 됨. 
		
	}
}
}
