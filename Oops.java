public class Oops {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setName(1234 , "Rabi");
        System.out.println(obj.getName());


        Student std = new Student();
        std.setAge(23);
        System.out.println(std.getAge());



        Customer cs = new Customer(11, "anurag");
        Customer.acceptRef(cs);

        Chocolate c = Chocolate.returnChoco(null);


        Biryani b = new Biryani();
        int res = b.setPrice(23).set


    }
}

class Encapsulation{
    private int Pid;
    private String Name;

    public int getName(){
        System.out.println(Name);
        return Pid;
    }

    public void setName(int Pid, String Name){
        this.Pid = Pid;
        this.Name = Name;
    }
}


class Student{
    private int age;

    public void setAge(int age){
        if(age > 5 || age < 25){
            this.age = age;
        }
        
    }

    public int getAge(){
        return age;
    }

}


class Customer{
    int cid;
    String cname;

    // constructor to initialize cid and cname

    Customer(int cid, String cname){
        this.cid = cid;
        this.cname = cname;
    }

    // Method access object Reference.
    public static void acceptRef(Customer c){
        System.out.println(c.cid);
    }
    
}



// Factory Method

class Chocolate{
    int price;
    String name;

    Chocolate(int price, String name){
        this.name = name;
        this.price = price;
    }

    public static Chocolate returnChoco(Chocolate c){
        Chocolate c = new Chocolate(20, "amul");
        return c;
    }
}



class Biryani{
    private String type;
    private int price;

    // Biryani(String type, int price){
    //     this.type = type;
    //     this.price = price;
    // }

    public Biryani setPrice(int price){
        this.price = price;
        return this;
    }

    public int getPrice(){
        return price;
    }

    public void display(){
        System.out.println(type);
        System.out.println(price);
    }
}