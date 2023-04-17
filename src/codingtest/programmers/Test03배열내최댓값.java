package codingtest.programmers;

import java.util.Arrays;

// 최댓값 만들기(1)
public class Test03배열내최댓값 {
	int max=0;
	
	public int solution(int[] numbers) {
		int max2=0;
		
		// 1 최댓값 구하기 
		for(int i : numbers){
			if(i>max) {
				max=i;
			}
		}
		
		/* 2 관심요구사항 !
		 * 	   배열 안에 같은 값이 존재하는 경우를 대비할 것
		 *    max값 자체가 아닌 순번을 비교하자!
		 */
		
		//2-1) Arrays 클래스를 이용하여 먼저 배열 정렬 
		Arrays.sort(numbers);
		
		//2-2) 특정 요소에 대한 인덱스값 추출 
		int idx=Arrays.binarySearch(numbers, max);
		
		
		for(int i=0; i<numbers.length; i++){
			
			// 2-3) 배열의 순번과 특정 요소의 인덱스값을 비교하여 차선 구하기 
			if(i!=idx) {
				if(numbers[i]>max2) {
					max2=numbers[i];
				}
			}
		}

		return max*max2;
	}
	
	
	public static void main(String[] args) {
		Test03배열내최댓값 test03=new Test03배열내최댓값();
		
		// 입력값 
		//int[] input= {1,2,3,4,5};
		int[] input= {0,31,24,10,1,9};
		
		System.out.println("결과 리턴 "+test03.solution(input));
	}

}
