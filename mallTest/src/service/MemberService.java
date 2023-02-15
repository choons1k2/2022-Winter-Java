package service;

import dao.MemberDao;
import domain.Member;
import domain.Role;


public class MemberService {


    private MemberDao memberDao;
    private ItemService itemService;
    private CartService cartService;

    private MemberService(){};

    static private MemberService instance = new MemberService();

    static public MemberService getInstance() {
        return instance;
    }

    static public MemberService getInstance(MemberDao memberDao) {
        instance.memberDao = memberDao;
        instance.itemService = ItemService.getInstance();
        instance.cartService = CartService.getInstance();

        return instance;
    }


    public void join() {
        System.out.println("===[ 회원가입 ]===");
        System.out.println("[회원가입] 아이디 입력 : ");
        String id = Input.sc.nextLine();

        if(!memberDao.idDuplicationCheck(id)) {
            System.out.println("이미 존재하는 아이디입니다.");

        }else{System.out.println("[회원가입] 비밀번호 입력 : ");
            String pw = Input.sc.nextLine();
            System.out.println("[회원가입] 이름 입력 : ");
            String name = Input.sc.nextLine();

            Member mb =  new Member(memberDao.serialAutoIncrement(), id, pw, name);
            memberDao.addMember(mb);
            System.out.println("[회원가입 성공]");
        }

    }




}
