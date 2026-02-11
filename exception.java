public class exception {
    public static void main(String[] args) {

        // System.out.println("bjdhfjbjsd");
        // System.out.println("jkdfjbhsdbh");
        // System.out.println(10/0);


        // try-catch block
        // try{
        //     System.out.println(10/0);
        //     System.out.println("from try...");
        // }
        // catch(ArithmeticException a){
        //     System.out.println("Handled....");
        // }
        // catch(NullPointerException n){
        //     System.out.println("hande in 1at catch");
        // }
        // // System.out.println("done");

        // finally{
        //     System.out.println("I will always execute......from finally...");
        // }
        
        try{
            ageCheck(17);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }

    }

    public static void ageCheck(int age) throws InvalidAgeException{
        if(age >= 28){
            System.out.println("Elligible");
        }else{
            throw new InvalidAgeException("min age is 18");
        }
    }
    
    
}