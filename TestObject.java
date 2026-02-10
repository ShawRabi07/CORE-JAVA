public class TestObject {
    public static void main(String[] args) {
        Test m = new Test(101,"Dingiluu");
        Test n = new Test(1,"sdds");
        System.out.println(m.equals(n));

        System.out.println(m.hashCode());
        System.out.println(n.hashCode());

        String s = "Hai";
        // String s1 = "Hii";
        String s2 = "Hai";
        String s3 = new String("Hai");

        System.out.println(s==s2); // this (==) is comparing reference of the object. o/p : true;
        System.out.println(s==s3); //  o/p : false.
        System.out.println(s.equals(s3));


        String a1 = "apple";
        String a2 = "Apple";
        String a3 = "apple";
        System.out.println(a1.compareTo(a2));

        System.out.println(a3.compareTo(a1));
        System.out.println(a2.compareTo(a1));


        // concat()
        // charAt()
        // startsWith()
        // 
        
    }
}
