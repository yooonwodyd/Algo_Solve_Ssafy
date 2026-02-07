import java.util.Scanner;
import java.util.Stack;

public class Swea1222_계산기1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		for (i = 1; i <= 10; i++) {// TC는 10번 반복
			int sum=0;
			int n = sc.nextInt();// 연산자가 n개인지
			Stack<Character> stack = new Stack<>();
			StringBuilder sb = new StringBuilder(); // 왜? *오타
			String s = sc.next();// *일단은 문자열을 받을 string을 설정해야해. 그리고 for문 한칸 안에만 들어가야 해.

			for (int j = 0; j < n; j++) {
				char tmp = s.charAt(j);// 입력받은 글자 안에 한 글자씩//왜? //하나씩 비교해야지.

				if (tmp >= '0' && tmp <= '9') {// *char이니까 '숫자'이렇게 비교해야해(아스키)
					sb.append(tmp);
				} else if (tmp == '(') {// 여는 괄호 일때
					stack.push(tmp);// 스텍 넣

				} else if (tmp == ')') {// 닫는 괄호 일때

					while (stack.peek() != '(') {// 스택에서 여는괄호가 나올 때까지
						sb.append(stack.pop());// 스택에서 빼서 sb에 붙여라
					}
					stack.pop();// 여는 괄호는 버려
				} else if (tmp == '+') {// 연산자가 있을 때
					while (!stack.isEmpty() && stack.peek() == '(') {
						
						sb.append(stack.pop());
					}
					stack.push(tmp);
				}
			} // char for문 끝
			
			while (!stack.isEmpty()) {// 스택에 비어있지 않다면
				sb.append(stack.pop()); // *pop만 할게 아니라 뽑은걸 sb에 다시 붙여야지
			}
//			System.out.println(sb);
			
			for (int j = 0; j < sb.length(); j++) {// sb안에 j로 돌면서 char 다룰거야
				
				int c = sb.charAt(j) - '0';// 아스키 이용해서 int로 바꾸는걸 어떻게 하더라 이렇게! *그냥 char에다가 -'0'이렇게 하면 됨.
				if (c >= 0 && c <= 9) {
					sum += c;
				}

			}
			System.out.println("#"+i+" "+sum);
		} // tc반복 for문 끝
		
	}// main함수 끝
}// 클래스 끝
