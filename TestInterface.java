public class TestInterface implements Intreface{

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.add(10, 20);
        obj.sub(20,10);
    }
}