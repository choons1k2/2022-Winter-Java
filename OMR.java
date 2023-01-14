package week3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



class OMR {
	int[] answer = { 1, 3, 4, 2, 5 }; // ������
	int[] hgd = new int[5]; // �л����

	int cnt = 0; // ���� ���� ����
	int score = 0; // ����
}

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * # OMRī�� : Ŭ���� + ����
		 * 1. �迭 answer�� ���蹮���� �������̴�.
		 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
		 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
		 * 4. �� ������ 20���̴�.
		 * ��)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * ����ǥ     = {O, X, O, X, X}
		 * ����        = 40��
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