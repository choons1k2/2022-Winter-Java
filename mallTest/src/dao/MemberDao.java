package dao;

import domain.Member;

import java.util.ArrayList;

public class MemberDao {

    private ArrayList<Member> memberList = new ArrayList<>();

    private static int serialNumber = 0;

    public int serialAutoIncrement(){
        return ++serialNumber;
    }

    public void addMember(Member mb){
        memberList.add(mb);
    }
    public boolean idDuplicationCheck(String id) {
        for(Member mb : memberList){
            String memberId = mb.getId();
            if(memberId.equals(id))
                return false;
        }

        return true;
    }


}
