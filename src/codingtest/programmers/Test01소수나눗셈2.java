package codingtest.programmers;

// 코테 입문) 두 수의 나눗셈 
public class Test01소수나눗셈2 {

	public int solution(int n1, int n2) {
		double answer =((double)n1/n2)*1000;
		return (int)answer;
	}
	
	public static void main(String[] args) {
		Test01소수나눗셈2 test01_2=new Test01소수나눗셈2();
		
		System.out.println(test01_2.solution(3,2));
		System.out.println(test01_2.solution(7,3));
		System.out.println(test01_2.solution(1,16));
	}
}
