// public interface Intreface {

//     int a  = 10;
//     public static void main(String[] args) {
//         //  a = 434;

//         // non- static concrete method are not allowed.
//         // void method(){

//         // }

//         // COntstructor are not allowed in interface

//         // Intreface(){    

//         // }
//         System.out.println(a);
//     }
// }


public interface Intreface {

    abstract void add(int a, int b);
    abstract void sub(int a, int b);
}



// public class Test implements Intreface{

//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
//     public void sub(int a, int b){
//         System.out.println(a-b);
//     }

//     public static void main(String[] args) {
//         Test obj = new Test();
//         obj.add(10, 20);
//     }
// }