class Engine{
    private int hp;

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return hp;
    }
}


class Car{
    private String brand;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
    
    private Engine e = new Engine();

    // get methodl

    public Engine getEngine{
        return e;
    }
}