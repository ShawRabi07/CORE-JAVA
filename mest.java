class test{
    int id;
    String name;
    int marks;

    test(int id, String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

   
    
    // override tostring
     public String toString(){
        return "Student id: " + id;
    }

    
    
}