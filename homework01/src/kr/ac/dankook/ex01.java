package kr.ac.dankook;
//�ָ� �ֹμ�

import java.util.Scanner;

public class ex01 {
	static Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	private static boolean idCheck(int[] idList, int newId) {
		for(int id : idList) {
			
			if(id == newId) {
				return false;
			}
			
			}
		
		
		return true; //if there is no repetition btw arid list and newId -> return true
	}

	public static void main(String[] args) {
		
		/*
		 * # ATM[1�ܰ�] : ��ü ��ɱ���
		 * 1. ȸ������
		 * . id�� pw�� �Է¹޾� ����
		 * . ���� �� �� 1000�� �ο�
		 * . id �ߺ�üũ
		 * 2. ȸ��Ż��
		 * . �α��νÿ��� �̿밡��
		 * 3. �α���
		 * . id�� pw�� �Է¹޾� �α���
		 * . �α׾ƿ� ���¿����� �̿밡��
		 * 4. �α׾ƿ�
		 * . �α��νÿ��� �̿밡��
		 * 5. �Ա�
		 * . �α��νÿ��� �̿밡��
		 * 6. ��ü
		 * . �α��νÿ��� �̿밡��
		 * 7. �ܾ���ȸ
		 * . �α��νÿ��� �̿밡��
		 */

			
				
				int MAX = 5;
				int token = -1; // idx of user
				
				int[] arId = new int[MAX];
				int[] arPw = new int[MAX];
				int[] arMoney = new int[MAX];
				
				int count = 0;
				boolean logStatus = false;
				
				
				
				String menu = "=== �׸� IT ATM ===\n";
				menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
				menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0.����";
				
				while(true) {
					
					System.out.printf("ȸ����: %d��\n", count);
					if(count>0) {
						for(int i = 0; i<count; i++) {
							System.out.printf("%d:%d(%d��)\n",arId[i],arPw[i],arMoney[i]);
						}
					}
					if(token>=0) {
						System.out.printf("������: %d\n", arId[token]);
						
						
					}
					
					else {
						System.out.println("������ ����");
					}
					
					
					
					System.out.println(menu);
					
					int sel = sc.nextInt();
					
					if(sel == 1) {
						
						if(count == 4) {
							System.out.println("ȸ�������� 5����� �����մϴ�");
							continue;
						}
						
						
						int id; int pw;
						
						System.out.println("id: ");
						id = sc.nextInt();
						System.out.println("pw: ");
						pw = sc.nextInt();
						
						if (!idCheck(arId, id)) {
							System.out.println("�̹� �����ϴ� ���̵��Դϴ�. ó������ �ٽ� �����Ͻÿ�.");
							continue;
							
						}
						
						
						
						else {
							arId[count] = id;
							arPw[count] = pw;
							arMoney[count] += 1000;
							count++;							
						
							
						}
						
						
						
					}
					else if(sel == 2) {
						
						if(!logStatus) {
							System.out.println("�α����� �ʿ��մϴ�.");
							continue;
							}
						
						arId[token] =0;
						arPw[token] =0;
						arMoney[token]=0;
						logStatus=false;
						token=-1;
						//count--�ϸ� ���߿� arrayIndexing�� ���� -> ȸ��Ż��� ȸ�� �� ���̴°� �̱���
					}
					else if(sel == 3) //login
						{
						
						if(logStatus) {
							System.out.println("�α��� �����Դϴ�.");
							continue;
						}
						
						int reqId = -1;
						int reqPw = -1;
						
						
						System.out.println("=======login page =======");
						System.out.println("id: ");
						reqId = sc.nextInt();
						
						System.out.println("pw: ");
						reqPw = sc.nextInt();
						
						for(int i = 0; i < arId.length; i++) {
							if(arId[i] == reqId) {
								token = i;
								break;
								
							}
						};
						
						try { if(arPw[token] == reqPw) {
							System.out.println("�α��� ����");
							logStatus = true;
						}
						
						else {
							System.out.println("��й�ȣ �����Դϴ�. ó������ �ٽ� �����ϼ���");
							token = -1; //token reset
							continue;
						}
						
							
						}catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("���̵� �����Դϴ�. ó������ �ٽ� �����ϼ���");
							continue;
							
							
						}
						
						
					}
					else if(sel == 4) {
						
						if(!logStatus) {
							System.out.println("�α����� �ʿ��մϴ�.");
							continue;
							}
						
						System.out.println("�α׾ƿ� �Ϸ�");
						
							token = -1;
							
						
						
						
						
						
					}
					else if(sel == 5) {
						
						if(!logStatus) {
							System.out.println("�α����� �ʿ��մϴ�.");
							continue;
							}
						
						
						System.out.print("�Ա��� �ݾ��� �Է��Ͻÿ�: ");
						
						int money = sc.nextInt();
						
						if(money > 0) {
							arMoney[token] += money;
						}
						
						else {
							System.out.println("�Ա� �ݾ��� 0���� Ŀ���մϴ�. �ٽ� �����Ͻÿ�");
							continue;
						}
						
					}
					else if(sel == 6) {
						
						if(!logStatus) {
							System.out.println("�α����� �ʿ��մϴ�.");
							continue;
							}
						
						System.out.print("��ü�� ���¹�ȣ�� �Է��Ͻÿ�: ");
						int account = sc.nextInt();
						
						System.out.print("��ü�� �ݾ��� �Է��Ͻÿ�: ");
						int remitt = sc.nextInt();
						
						
						if(arMoney[token] >= remitt) {
							arMoney[token] -= remitt;
							
							for(int i = 0; i < count; i++) {
								if(arId[i] == account) {
									arMoney[i] += remitt;
									break;
								}
							}
						}
						
						else {
							System.out.println("���� �������� �����մϴ�");
							continue;
						}
						
						
						
						
						
						
						
						
						
						
						
						
					}
					else if(sel == 7) {
						if(!logStatus) {
							System.out.println("�α����� �ʿ��մϴ�.");
							continue;
							}
						
						System.out.printf("�ܾ���ȸ %d:%d(%d��)\n",arId[token],arPw[token],arMoney[token]);
						continue;
						
						
						
					}
					else if(sel == 0) {
						System.out.println("�����մϴ�.");
						break;
					}
				}
	}

}
