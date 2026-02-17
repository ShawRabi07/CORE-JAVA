import java.util.ArrayList;
import java.util.Comparator;

public class example2 {
    public static void main(String[] args) {
        // Addition d = (a, b) -> a+b;
        // System.out.println(d.calci(10,5));
        // int res = d.calci(20,4);
        // System.out.println(res);

        // ArrayList<Integer> a1 = new ArrayList<>();
        // a1.add(30);
        // a1.add(34);
        // a1.add(40);
        // a1.add(65);

        // a1.sort((a,b)->a-b);
        // System.out.println(a1);


        // ArrayList<Student> a = new ArrayList<>();
        // a.add(new Student("rabi"));
        // a.add(new Student("binaae"));
        // a.add(new Student("anurag"));
        // a.sort(a1,b)-> a.sname.compareTo(b1.sname);

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Rabi");
        a1.add("Bahi");
        a1.add("iahd");
        a1.add("ksda");
        a1.add("Updateed");

        a1.stream().sorted().forEach(x->System.out.println(x));
        a1.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
        


    }
}

// public interface Addition {
//     abstract int calci(int a, int b);
    
// }