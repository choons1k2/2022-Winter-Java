package basic;

import java.util.Scanner;
import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		
		
		
		/*
		[����] 
	 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp1������
	 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
		[����] 
	 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp2������
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
	[����]
		array[] = {10, 43, 25, 76, 3, 100, 56};	      
		�ε��� 2���� �Է¹ް� �����ε������� ū�ε��������� ������ ���� ����Ѵ�.
	[����] 
  		index1 �� index2 ���� ��ũ���� 
       	�����ε������� ū�ε��������� ���� ����Ѵ�.
    [��] index1 = 1;  index2 = 3;
		43 + 25 + 76
  
  	[��] index1 = 4;  index2 = 1;
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
[����]
	array �迭�� -100~100������ �������� Ȧ���� 5�� �����Ѵ�. 
	���� ������������ �ε����� ���� ����Ѵ�. 
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








