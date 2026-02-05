public class Oops {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setName(1234 , "Rabi");
        System.out.println(obj.getName());


        Student std = new Student();
        std.setAge(23);
        System.out.println(std.getAge());

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
