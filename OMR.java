package week3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



class OMR {
	int[] answer = { 1, 3, 4, 2, 5 }; // 시험답안
	int[] hgd = new int[5]; // 학생답안

	int cnt = 0; // 정답 맞춘 개수
	int score = 0; // 성적
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * # OMR카드 : 클래스 + 변수
		 * 1. 배열 answer는 시험문제의 정답지이다.
		 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
		 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
		 * 4. 한 문제당 20점이다.
		 * 예)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * 정오표     = {O, X, O, X, X}
		 * 성적        = 40점
		 */
		
		OMR stu1 = new OMR();
		
		int cnt = 0;
		
		char[] chr = {'X','X','X','X','X'};
		
		Random rd = new Random();
		for(int i = 0; i < stu1.hgd.length; i++) {
			stu1.hgd[i] = rd.nextInt(6);
		}
		
		int i = 0;
		for(int answer : stu1.answer) {
			if(answer==stu1.hgd[i]) {stu1.score+=20; cnt++; chr[i]='O';}
			i++;
		}
		
		System.out.println(Arrays.toString(stu1.answer));
		System.out.println(Arrays.toString(stu1.hgd));
		System.out.println(Arrays.toString(chr));
		System.out.println(stu1.score);
		
		
		
	}
}