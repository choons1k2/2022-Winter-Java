package day2;

public class Calender {

	public static void main(String[] args) {
		
			/*
			[�����]	
			ö���� ����� 3�� 3�Ͽ� ������. 		
			ö���� ����� 100�� ����Ͽ� ������Ƽ�� �ҷ����Ѵ�.
			������ 100�ϵڴ�  ��������ΰ�?
			�� ������ ��������ʴ´�.
			 */

		int monthList[] =
						{31, 28, 31, 30, 
						 31, 30, 31, 31, 
						 30, 31, 30, 31};		
				int day = 3;
				int month = 3;

				
				
				
				
			
		int counter = 0;
		int tmp = 0; //100��°�� �Ѿ���� check �� counter�� ����
				
		for(int i = month - 1; i < monthList.length; i++) {
			
			
			
			
			if(i == month - 1)
				{
				
				
				tmp = counter +  monthList[i] - day;
				
				
				
				
				}
			
			//�ش��ϴ� ���� �ƴҶ�
			else
				{
				
				tmp = counter += monthList[i];
				
				}
			
			
			if(tmp > 100) //100�ڸ��� ����²���� �ִ´�.
			{
				day = counter - 100;
				month = i;
				break;		
						
						
				
				
			}
				
				
			else
				{
				
				counter = tmp;
				 month = i+1;
				}
			
			
			
			
		}
		
		
		System.out.printf("%d�� %d��", month, day);
				
		
				
				
				
		
		}
	
	

	}

	


