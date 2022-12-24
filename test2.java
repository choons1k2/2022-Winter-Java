package basic;

import java.util.Scanner;
import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		
		
		
		/*
		[문제] 
	 		array1배열 과 array2배열의 각자리별 합을 temp1에저장
	 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
		[문제] 
	 		array1배열 과 array2배열의 각자리별 차를 temp2에저장
	 		temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
	*/

	    int array1[] = {10,20,30,40,50};
			int array2[] = {5,8,54,32,1};
			int temp1[] = new int[5];
		
			
			
			for(int i = 0; i<temp1.length; i++) {
			temp1[i] = array1[i] + array2[i];
		}
		
			
			int temp2[] = new int[5];
			
			
			for(int i = 0; i<temp2.length; i++) {
				temp2[i] = array1[i] - array2[i];
			}
	
			
			for(int i=0; i<temp1.length; i++) {
				System.out.printf("%d ", temp1[i]);
			}
			System.out.println();
	
			for(int i=0; i<temp1.length; i++) {
				System.out.printf("%d ", temp2[i]);
			}
	
	
	
	/*
	[문제]
		array[] = {10, 43, 25, 76, 3, 100, 56};	      
		인덱스 2개를 입력받고 작은인덱스에서 큰인덱스까지의 값들의 합을 출력한다.
	[조건] 
  		index1 이 index2 보다 더크더라도 
       	작은인덱스부터 큰인덱스까지의 합을 출력한다.
    [예] index1 = 1;  index2 = 3;
		43 + 25 + 76
  
  	[예] index1 = 4;  index2 = 1;
 		43 + 25 + 76 + 3 
 */

Scanner sc = new Scanner(System.in);
int index1 = sc.nextInt();
int index2 = sc.nextInt();

int array[] = {10, 43, 25, 76, 3, 100, 56};	

if(index1 > index2) {
	for(int i=index2; i<index1 + 1; i++) {
		System.out.printf("%d\n", array[i]);
	}
}

else {
	for(int i=index1; i < index2 + 1; i++) {
		System.out.printf("%d", array[i]);
}
		
		
		
}






/*
[문제]
	array 배열에 -100~100사이의 랜덤값중 홀수만 5개 저장한다. 
	그중 가장작은값의 인덱스와 값을 출력한다. 
*/

Random rd = new Random();
int array3[] = new int[5];

for(int i=0; i<5; i++) {
	if (rd.nextInt(200)-100%2 != 0) 
	
	
	{
	array3[i]= rd.nextInt(200)-100; 
	}


}
//find min algo
	int index = 0;
	int min = array3[0];
	for(int i=1; i<array3.length; i++) {
		if(array[i]<min)
			{
			
			min = array[i];
		
			index = i;
			
			}

}

	System.out.printf("min value: %d", min);
	System.out.printf("indexof min value: %d", index);
}}








