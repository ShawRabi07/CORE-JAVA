// class Student{
//     public static void main(String[] args){

//         // long rabi = 23223232232L;
//         // float n = 2.2F;
//         // // System.out.println("Hey Bittu ");

//         // System.out.println(n);
//         // System.out.println(rabi);

//         // int a;
//         // // System.out.println(a);
//         // Student n = null;
//         // System.out.println(n);

        
//     }
// }



// class Student{
//     public static void main(String[] args) {
//     System.out.println("Hello World");
//     System.out.println();
//     System.out.print(); //error
//     }
// }

// class Datatype{
//     public static void main(String [] args){
//         long a = 1000001234567890L;
//         float b = 10.5f;
//         double c = 20.99d;
//         int d = 100;

//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }

// class Book{
//     public static void main(String[]args){
//         int a;  //error
//         System.out.println(a);
//     }
// }

// class TypeCasting{  //convert vaule into different data type
//     public static void main(String[]args){
//         int a = 10;
//         double d = a; //implicit type casting
//         System.out.println(d);
//     }
// }

// class TypeCasting{  //convert vaule into different data type
//     public static void main(String[]args){
//         double d = 10.5; 
//         int num = (int)d; //explicit type casting
//         System.out.println(num);
//     }
// }

// class TypeCasting{  //convert vaule into different data type
//     public static void main(String[]args){
//         char c = 'a';
//         int a = c; //explicit type casting
//         System.out.println(a);
//         double d = 89;
//         char j = (char)d;
//         System.out.println(j);

//     }
// }


// class Operators{
//     public static void main(String[] args){
//         int a = 10, b = 20;

//         String c = (a > b) ? "a is greater" : "b is greater";
//         System.out.println(c);
//     }
// }




// Assessment

// import java.util.Scanner;

// public class StudentEligibility {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
  
//         System.out.print("Enter marks: ");
//         int marks = sc.nextInt();

//         System.out.print("Enter attendance percentage: ");
//         int attendance = sc.nextInt();

//         System.out.println((marks > 0 && attendance >0) ? "true" : "false");
       
//         boolean eligible = (marks >= 40) && (attendance > 75);
        
//         String result = eligible ? "Pass" : "Fail";
//         // if (eligible) {
//         //     marks += 5;  
//         // }

//         marks = eligible ? (marks += 5) : marks;


//         System.out.println("Result: " + result);
//         System.out.println("Final Marks: " + marks);

//        sc.close();
//     }
// }


// public class practice1 {

//     public static void main(String[] args) {

//         char character = '1';
//         String result;

//         if(character >= 'A' && character <= 'Z'){
//             result = "Uppercase";

//         }
//         else if(character >= 'a' && character <= 'z'){
//             result = "LowerCase";
//         }
//         else if(character >= '0' && character <= '9'){
//             result = "Digit";
//         }
//         else{
//             result = "Special Char";
//         }

//         System.out.println("result: "+ result);
        
//     }
    
// }



// public class practice1 {

//     public static void main(String[] args) {

//         int a = 50;
//         int b= 70;
//         int c = 40;

//         int largest;
        
//         if(a>b && a>c){
//             largest = a;
//         }
//         else if(b>a && b>c){
//             largest = b;
//         }
//         else{
//             largest = c;
//         }

//         System.out.println("Largest Num: " + largest);
        
//     }
    
// }

// import java.util.Scanner;

// class Even{
//     public static void main(String[] args) {
//         // int nv= 10;
//         // while(nv<=20){
//         //     if(nv%2==0) System.out.println(nv + " ");
//         //     nv++;
//         // }
//         // Scanner sc = new Scanner(System.in);
//         // char input;

//         // do {
//         //     System.out.println("Welcome");

//         //     System.out.println("Do you want again");
//         //     input = sc.next().charAt(0);
//         // } while (input == 'y' || input == 'Y');

//          char character = 'a';

//         while ( character <= 'k'){

//             if(character % 2 == 0){
//                 System.out.println(character + " -> " + (int)character);
//             }

//             character++;

//         }
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;



// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//     //     int[] arr = new int[-5];
//     //     for(int i = 0; i < 5;  i++){
//     //         arr[i] =  sc.nextInt();

//     //     }
//     //     System.out.println(Arrays.toString(arr));
        

//     //     Main d = new Main();
//     //     d.Out();
//     //     // Out();
//     // }


//     // public void Out(){
//     //     System.out.println("HEy i am outside static block");
//     // }

    
//         // double[] arr = {2.0,3.0,6.0,4.0,9.0,4.0};

//         // for (int i = 0; i < 5; i++) {
//         //     arr[i] = sc.nextDouble();
//         // }

//         // for (int i = 0; i < 5; i += 2) {
//         //     System.out.print(arr[i] + " ");
//         // }

//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[][] arr = new int[rows][cols];

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

        
//     }
// }





public class Main{
    public static void main(String[] args) {
        Student s = new Student(101,"sds",2);

        Student ss = new Student("hkhhkhj");

        System.out.println(ss.name);
        System.out.println(ss.sid);
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.sid);
        

    }
}


// class Employee{
//     public static void main(String[] args) {
       
//     }
// }


