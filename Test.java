public class Test {
    int sid;
    String sname;
    Test(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }

    public boolean equals(Object o){
        Test s = (Test)o;
        return this.sid == s.sid && this.sname==s.sname;
    }


    public int hashCode(){
        return sid + sname.hashCode();
    }
}
