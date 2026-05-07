public class Member {

    private String name;
    private String memberId;

    public Member(String name,String memberId){
        this.name = name;
        this.memberId = memberId;
    }

    public String getName(){
        return this.name;
    }

    public String getMemberId(){
        return this.memberId;
    }

    @Override
    public String toString() {
        return "Member: Name=" + name + ", ID=" + memberId;
    }
}
