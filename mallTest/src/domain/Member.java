package domain;

public class Member {

    private int serialNumber; //auto_increment
    private String id; //pk
    private String password;
    private String name;

    private Role role;

    public Member() {
    };

    public Member(int serialNumber, String id, String password, String name) {
        this.serialNumber = serialNumber;
        this.id = id;
        this.password = password;
        this.name = name;

    }

    public String getId() {
        return id;
    }
}



