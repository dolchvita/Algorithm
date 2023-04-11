package codingtest.thisisJAVA;

// 이것이 자바다 5장 7번 문제
public class Test06 {

	public static void main(String[] args) {
		int max=0;
		int[] array= {1,5,3,8,2};
		
		// 모든 요소 조사하여 가장 큰 수 담기 
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		// 배열 내 최댓값 구하기
		System.out.println("max : "+max);
	}
}
