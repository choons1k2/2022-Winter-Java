package day2;

public class Calender {

	public static void main(String[] args) {
		
			/*
			[기념일]	
			철수와 영희는 3월 3일에 만났다. 		
			철수는 영희와 100일 기념일에 축하파티를 할려고한다.
			만난지 100일뒤는  몇월몇일인가?
			단 윤년은 계산하지않는다.
			 */

		int monthList[] =
						{31, 28, 31, 30, 
						 31, 30, 31, 31, 
						 30, 31, 30, 31};		
				int day = 3;
				int month = 3;

				
				
				
				
			
		int counter = 0;
		int tmp = 0; //100일째를 넘어가는지 check 후 counter에 저장
				
		for(int i = month - 1; i < monthList.length; i++) {
			
			
			
			
			if(i == month - 1)
				{
				
				
				tmp = counter +  monthList[i] - day;
				
				
				
				
				}
			
			//해당하는 달이 아닐때
			else
				{
				
				tmp = counter += monthList[i];
				
				}
			
			
			if(tmp > 100) //100자리에 몇일짼지를 넣는다.
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
		
		
		System.out.printf("%d월 %d일", month, day);
				
		
				
				
				
		
		}
	
	

	}

	


