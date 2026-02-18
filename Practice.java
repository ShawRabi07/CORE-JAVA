public class Practice {
    public static void main(String[] args){
        int n = 5;
        int x = n^(n >> 1);
        System.out.println((x & ( x + 1)) == 0);
        System.out.println(x);
    }
}
