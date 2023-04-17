package codingtest.programmers;

// 문자열 뒤집기
/* 입력된 문자열 순서가 뒤집혀 출력된다 */
public class Test05문자뒤집기 {

	public String solution(String my_string) {
		StringBuilder sb=new StringBuilder();
		sb.append(my_string);

		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		Test05문자뒤집기 test=new Test05문자뒤집기();
		System.out.println(test.solution("bread"));
	}

}
