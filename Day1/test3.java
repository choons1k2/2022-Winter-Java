package basic;

public class test3 {

	public static void main(String[] args) {
		/*
		[����] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
		[����] ��ġ�� �ڿ��� ���� �����Ѵ�. 
		[��]   c = { 0, 0, 17, 51, 49 }
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
	�Ʒ��迭���� ������ ������ ���� ����������� �Ǻ��Ͻÿ�.	
	��������̸� true , �ٸ�����̸� false ���
	[����]
		154451 �� �������� ������ ���� ��������̴�.
		154751 �� �������� ������ ���� �ٸ�����̴�.
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
