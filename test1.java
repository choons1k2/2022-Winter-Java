package basic;

import java.util.Scanner;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		/*
		[����¡ ����ũ]
		[�̻��� ������ ���ڱ�Ģ]
			���� 1~5 ���̸� a �������ϸ� , num �� 1 ������ ���
			���� 6~10 ���̸� a �������ϸ� , num �� 2 ������ ���
			���� 11~15 ���̸� a�� �����ϸ�, num �� 3 ������ ���
			���� 16~20 ���̸� a �� �����ϸ�, num �� 4 ������ ���
			....
			....
			���� 96~100 ���̸� a �� �����ϸ� , num �� 20�� ������ ��� 
		
	 */
		
	Scanner sc = new Scanner(System.in);
	System.out.println("���ڸ� �Է��Ͻÿ�: ");
	int a = sc.nextInt();
	
	int num = 1;
	
	for(int i= 20; i > 0; i--) {
	
		if(a>=(i)*5+1 && a <=(i)*5+5)
			{num= (i+1);
			System.out.println(num);
			break; }
			
			
			
			}
	
	

		/*	[1] 48�� ����� �����ڸ��� 2~6������ ���� ����Ͻÿ�.
			[2] �� ������ ����� ������ ����Ͻÿ�.
		[����]
			2 3 4 6 12 16 24 
			�Ǽ��� ���� : 7��
	 */
	
	int count =0;
	for(int i=1; i<=48; i++) {
		
		
		
	
		if(48%i==0)
	 {	
			System.out.printf("%d ", i);
	 	
			count++;
	 }
		
			
			
	
		
}
	System.out.printf("�������: %d", count);
	
	/*
	[����] 
		128�� 3��° ��� ���� 6��° ����� ��ü���� ����Ͻÿ�.
	[����]
		3��° ��� ���� 6��° ����� ��ü�� : 60
 */
	int total = 0;
	int count2 = 0;
	
	for(int i=1; i<=128; i++) {
		
		
		if(128%i==0) {
			++count2;
			if(count2>=3 && count2<=6) {
				total+= i;
			}
		
			
			
		}
		





}
	System.out.printf("��ü��: %d", total);
}}
	


