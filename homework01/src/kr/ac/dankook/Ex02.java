package kr.ac.dankook;
//[주말] 최민서


import java.util.Scanner;

class Member{
	
	//constructor
	
	public Member() {
		super();
	}
	
	public Member(int number, String id, String name) {
		super();
		this.number = number;
		this.id = id;
		this.name = name;
	}
	private int number;
	private String id;
	private String name;
	
	//getter & setter
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

class Account{
	private String accountNumber;
	private String password;
	private int money;
	private String memberId;
	
	
	
	public Account() {
		super();
	}
	
	public Account(String accountNumber, String password, int money, String memberId) {
		super();
		this.accountNumber = accountNumber;
		this.password = password;
		this.money = money;
		this.memberId = memberId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	
	
	
}



public class Ex02 {
	
	private static boolean idCheck(Member[] memberList, String id) {
		for(Member mb : memberList) {
			if(mb.getId().equals(id)) {
				return false;
			}
			
		}
		
		
		
		return true;
	}
	
	private static Account[] newAcList(Account[] accountList, int token, int count) {
		Account[] vla = new Account[count-1];
		for(int i = 0, idx = 0; i < count; i++) {
			
			if(i != token) {
				vla[idx] = new Account(accountList[i].getAccountNumber(),
						accountList[i].getPassword(), accountList[i].getMoney(), 
							accountList[i].getMemberId());
				
				
				idx++;
			}
			
			else
				continue;
			
		}
		return vla;
	}
	
	
	
	
	
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	String[][] memberData = {
			{"1001" , "qwer" , "김철수"},
			{"1002" , "mmkk11" , "이영희"},
			{"1003" , "javaking123" , "최민수"}			
		};
	
	Member[] memberAry = new Member[3];
	for(int i = 0; i < memberAry.length; i++) {
		memberAry[i] = new Member(Integer.parseInt(memberData[i][0]), memberData[i][1], memberData[i][2]);
	}
	
	for(Member mb : memberAry) {
		System.out.printf("%s: %s(%d)\n", mb.getName(), mb.getId(), mb.getNumber());
		
		
	}
	
	
		String[][] accountData = {
			{"111111111" , "1234" ,"100000" , "qwer"},
			{"222222222" , "1234" ,"200000" , "mmkk11"},
			{"333333333" , "1234" ,"300000" , "mmkk11"},
			{"444444444" , "1234" ,"400000" , "javaking123"},
			{"555555555" , "1234" ,"500000" , "qwer"},
			{"666666666" , "1234" ,"600000" , "qwer"},
		};
		
		
		Account[] accountAry = new Account[6];
		
		Account[] accountList = new Account[accountData.length];
		Member[] memberList = new Member[memberData.length];

		int token = -1;
		
		String menu = "=== 그린 IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		int count = 0;
		boolean logStatus = false;
		
		while(true) {
			
			System.out.println(menu);
			
			int sel = sc.nextInt();
			
			if(sel == 1) {
				
				if(count == 4) {
					System.out.println("회원가입은 5명까지 가능합니다");
					continue;
				}
				
				
				String id; String pw;
				
				System.out.println("id: ");
				id = sc.nextLine();
				System.out.println("pw: ");
				pw = sc.nextLine();
				
				if (!idCheck(memberList, id)) {
					System.out.println("이미 존재하는 아이디입니다. 처음부터 다시 시작하시오.");
					continue;
					
				}
				
				
				
				else {
					accountList[count] = new Account(Integer.toString(count), pw, 1000, id ); //id, pw, money
					count++;							
				
					
				}
				
				
				
			}
			else if(sel == 2) {
				
				if(!logStatus) {
					System.out.println("로그인이 필요합니다.");
					continue;
					}
				
				accountList[token].setAccountNumber(null);
				accountList[token].setMemberId(null);
				accountList[token].setPassword(null);
				accountList[token].setMoney(0);
				
				
				logStatus = false;
				
				
				
				Account[] vla = newAcList(accountList, token, count);
				
				token = -1;
				count--;
				accountList = vla;
				
				//여기서는 VLA 이용 count--하면 나중에 arrayIndexing시 문제 해결
			}
			else if(sel == 3) //login
				{
				
				if(logStatus) {
					System.out.println("로그인 상태입니다.");
					continue;
				}
				
				String reqId = null;
				String reqPw = null;
				
				
				System.out.println("=======login page =======");
				System.out.println("id: ");
				reqId = sc.nextLine();
				
				System.out.println("pw: ");
				reqPw = sc.nextLine();
				
				for(int i = 0; i < accountList.length; i++) {
					if(accountList[i].getMemberId()
							.equals(reqId)) {
						token = i;
						break;
						
					}
				};
				
				try { if(accountList[token].getPassword()
						  	.equals(reqPw)) {
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
					accountList[token]
							.setMoney(money + accountList[token].getMoney());
					
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
				String account = sc.nextLine();
				
				System.out.print("이체할 금액을 입력하시오: ");
				int remitt = sc.nextInt();
				
				
				if(accountList[token].getMoney() >= remitt) {
					
					accountList[token].setMoney(accountList[token]
							.getMoney() - remitt);
					
					for(int i = 0; i < count; i++) {
						if(accountList[i].getAccountNumber()
								.equals(account)) {
							
							accountList[i].setMoney(accountList[i].
									getMoney() + remitt);
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
				
				System.out.printf("잔액조회 %s:%s(%d원)\n",accountList[token].getMemberId(),
						accountList[token].getPassword(),
						accountList[token].getMoney());
				
				
				continue;
				
				
				
			}
			else if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
}

	
		
		
	}
