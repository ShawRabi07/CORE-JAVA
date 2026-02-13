import java.util.ArrayList;

public class example2 {
    public static void main(String[] args) {
        // Addition d = (a, b) -> a+b;
        // System.out.println(d.calci(10,5));
        // int res = d.calci(20,4);
        // System.out.println(res);

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(30);
        a1.add(34);
        a1.add(40);
        a1.add(65);

        a1.sort((a,b)->a-b);
        System.out.println(a1);
    }
}

// public interface Addition {
//     abstract int calci(int a, int b);
    
// }