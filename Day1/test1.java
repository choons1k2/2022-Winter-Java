package basic;

import java.util.Scanner;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		/*
		[페이징 훼이크]
		[이상한 나라의 숫자규칙]
			숫자 1~5 사이를 a 에저장하면 , num 에 1 저장후 출력
			숫자 6~10 사이를 a 에저장하면 , num 에 2 저장후 출력
			숫자 11~15 사이를 a에 저장하면, num 에 3 저장후 출력
			숫자 16~20 사이를 a 에 저장하면, num 에 4 저장후 출력
			....
			....
			숫자 96~100 사이를 a 에 저장하면 , num 에 20을 저장후 출력 
		
	 */
		
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하시오: ");
	int a = sc.nextInt();
	
	int num = 1;
	
	for(int i= 20; i > 0; i--) {
	
		if(a>=(i)*5+1 && a <=(i)*5+5)
			{num= (i+1);
			System.out.println(num);
			break; }
			
			
			
			}
	
	

		/*	[1] 48의 약수중 일의자리가 2~6사이인 수를 출력하시오.
			[2] 위 조건의 약수의 개수도 출력하시오.
		[정답]
			2 3 4 6 12 16 24 
			악수의 개수 : 7개
	 */
	
	int count =0;
	for(int i=1; i<=48; i++) {
		
		
		
	
		if(48%i==0)
	 {	
			System.out.printf("%d ", i);
	 	
			count++;
	 }
		
			
			
	
		
}
	System.out.printf("약수갯수: %d", count);
	
	/*
	[문제] 
		128의 3번째 약수 부터 6번째 약수의 전체합을 출력하시오.
	[정답]
		3번째 약수 부터 6번째 약수의 전체합 : 60
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
	System.out.printf("전체합: %d", total);
}}
	


