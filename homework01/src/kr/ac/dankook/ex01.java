package kr.ac.dankook;
//주말 최민서

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
		 * # ATM[1단계] : 전체 기능구현
		 * 1. 회원가입
		 * . id와 pw를 입력받아 가입
		 * . 가입 시 돈 1000원 부여
		 * . id 중복체크
		 * 2. 회원탈퇴
		 * . 로그인시에만 이용가능
		 * 3. 로그인
		 * . id와 pw를 입력받아 로그인
		 * . 로그아웃 상태에서만 이용가능
		 * 4. 로그아웃
		 * . 로그인시에만 이용가능
		 * 5. 입금
		 * . 로그인시에만 이용가능
		 * 6. 이체
		 * . 로그인시에만 이용가능
		 * 7. 잔액조회
		 * . 로그인시에만 이용가능
		 */

			
				
				int MAX = 5;
				int token = -1; // idx of user
				
				int[] arId = new int[MAX];
				int[] arPw = new int[MAX];
				int[] arMoney = new int[MAX];
				
				int count = 0;
				boolean logStatus = false;
				
				
				
				String menu = "=== 그린 IT ATM ===\n";
				menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
				menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
				
				while(true) {
					
					System.out.printf("회원수: %d명\n", count);
					if(count>0) {
						for(int i = 0; i<count; i++) {
							System.out.printf("%d:%d(%d원)\n",arId[i],arPw[i],arMoney[i]);
						}
					}
					if(token>=0) {
						System.out.printf("접속자: %d\n", arId[token]);
						
						
					}
					
					else {
						System.out.println("접속자 없음");
					}
					
					
					
					System.out.println(menu);
					
					int sel = sc.nextInt();
					
					if(sel == 1) {
						
						if(count == 4) {
							System.out.println("회원가입은 5명까지 가능합니다");
							continue;
						}
						
						
						int id; int pw;
						
						System.out.println("id: ");
						id = sc.nextInt();
						System.out.println("pw: ");
						pw = sc.nextInt();
						
						if (!idCheck(arId, id)) {
							System.out.println("이미 존재하는 아이디입니다. 처음부터 다시 시작하시오.");
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
							System.out.println("로그인이 필요합니다.");
							continue;
							}
						
						arId[token] =0;
						arPw[token] =0;
						arMoney[token]=0;
						logStatus=false;
						token=-1;
						//count--하면 나중에 arrayIndexing시 문제 -> 회원탈퇴시 회원 수 줄이는것 미구현
					}
					else if(sel == 3) //login
						{
						
						if(logStatus) {
							System.out.println("로그인 상태입니다.");
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
							System.out.println("로그인 성공");
							logStatus = true;
						}
						
						else {
							System.out.println("비밀번호 오류입니다. 처음부터 다시 시작하세요");
							token = -1; //token reset
							continue;
						}
						
							
						}catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("아이디 오류입니다. 처음부터 다시 시작하세요");
							continue;
							
							
						}
						
						
					}
					else if(sel == 4) {
						
						if(!logStatus) {
							System.out.println("로그인이 필요합니다.");
							continue;
							}
						
						System.out.println("로그아웃 완료");
						
							token = -1;
							
						
						
						
						
						
					}
					else if(sel == 5) {
						
						if(!logStatus) {
							System.out.println("로그인이 필요합니다.");
							continue;
							}
						
						
						System.out.print("입금할 금액을 입력하시오: ");
						
						int money = sc.nextInt();
						
						if(money > 0) {
							arMoney[token] += money;
						}
						
						else {
							System.out.println("입금 금액은 0보다 커야합니다. 다시 시작하시오");
							continue;
						}
						
					}
					else if(sel == 6) {
						
						if(!logStatus) {
							System.out.println("로그인이 필요합니다.");
							continue;
							}
						
						System.out.print("이체할 계좌번호를 입력하시오: ");
						int account = sc.nextInt();
						
						System.out.print("이체할 금액을 입력하시오: ");
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
							System.out.println("현재 보유액이 부족합니다");
							continue;
						}
						
						
						
						
						
						
						
						
						
						
						
						
					}
					else if(sel == 7) {
						if(!logStatus) {
							System.out.println("로그인이 필요합니다.");
							continue;
							}
						
						System.out.printf("잔액조회 %d:%d(%d원)\n",arId[token],arPw[token],arMoney[token]);
						continue;
						
						
						
					}
					else if(sel == 0) {
						System.out.println("종료합니다.");
						break;
					}
				}
	}

}
