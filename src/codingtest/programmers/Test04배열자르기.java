package codingtest.programmers;

import java.util.Arrays;

// 코테 입문)
public class Test04배열자르기 {

	public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        
        return answer;
	}
	
	
	public static void main(String[] args) {
		Test04배열자르기 test00=new Test04배열자르기();
		int[] numbers= {1,2,3,4,5};
		
		System.out.println(test00.solution(numbers, 1, 3));
	}

}
