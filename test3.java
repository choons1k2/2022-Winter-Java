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

	}

}
