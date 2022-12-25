package basic;

public class test3 {

	public static void main(String[] args) {
		/*
		[문제] 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장
		[조건] 위치는 뒤에서 부터 저장한다. 
		[예]   c = { 0, 0, 17, 51, 49 }
	 */

	int arr[] = { 10, 49, 51, 36, 17 };	
	int c[] = { 0,0,0,0,0 };
	
	int backOfC = 4;
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i] % 2 != 0) {
			c[backOfC] = arr[i];
		}
	}
	
	
	
	
	
	
	
	/*
	아래배열들을 반으로 나누고 서로 같은모양인지 판별하시오.	
	같은모양이면 true , 다른모양이면 false 출력
	[예시]
		154451 은 절반으로 나누면 서로 같은모양이다.
		154751 은 절반으로 나누면 서로 다른모양이다.
 */
int arr1[] = {1,5,4,4,5,1};	
int arr2[] = {1,5,4,7,5,1};
	boolean result = false;
	for(int i=0; i<4; i++) {
		if(arr1[i]==arr[5-i])
			result = true;
		else
			result = false;
		
		
	}
	
	System.out.println(result);
	

	}

}
