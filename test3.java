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

	}

}
