// INHERITANCE


// public class Child extends Parent{
//     public static void main(String[] args) {
//         System.out.println(n);
//         System.out.println(m);
//     }
// }

// class Parent{
//     static int n = 234;
//     int m = 2323;

// }


class Person{
    static String name;
}

class Student extends Person{
    static int sid;
    static String stream;
}

class EnggStudent extends Student{

    static int percentage;

    public static void main(String[] args) {
        name = "Rabi";
        sid = 101;
        stream = "CSE";
        percentage = 85;

        EnggStudent obj = new EnggStudent();
        obj.display();
        
    }

    void display(){
        System.out.println(name);
        System.out.println(sid);
        System.out.println(stream);
        System.out.println(percentage);
    }
}